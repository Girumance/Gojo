package com.example.gojo.Repository;

import com.example.gojo.Domain.Bank;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends MongoRepository<Bank,String> {

    Bank findByPhoneNumber(String phone);
}
