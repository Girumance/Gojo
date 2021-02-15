package com.example.gojo.Services;


import com.example.gojo.Components.BankWrapper;
import com.example.gojo.Domain.Bank;
import com.example.gojo.Domain.Property;
import com.example.gojo.Repository.BankRepository;
import com.example.gojo.Repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BankService {

    @Autowired
    BankRepository bankRepository;

    @Autowired
    PropertyService propertyService;

    @Autowired
    PropertyRepository propertyRepository;

    public int pay(BankWrapper wrapper){

        Bank userData = bankRepository.findByPhoneNumber(wrapper.getPhoneNumber());

        if(!userData.getPassword().equals(wrapper.getPassword())) return 0;

        if(userData.getDeposit() < wrapper.getPayment()) return -1;
        bankRepository.delete(userData);
        double dep =userData.getDeposit()- wrapper.getPayment();

        userData.setDeposit(dep);
        bankRepository.save(userData);
        Property property = propertyService.findPropertyById(wrapper.getId());
            propertyRepository.delete(property);
            property.setPayed(true);
            propertyRepository.save(property);

        return 1;



    }
}
