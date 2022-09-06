package com.mytests.spring.springJpaRepositoriesInheritance.services;

import com.mytests.spring.springJpaRepositoriesInheritance.data.CustomerEntity;
import com.mytests.spring.springJpaRepositoriesInheritance.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 9/2/2022.</p>
 * <p>Project: spring-jpa-repos-inheritance</p>
 * *
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void displayCustomers() {
        System.out.println("===== Customers tests: =====");
        System.out.println("-- customers by firstname: ");
        for (CustomerEntity customer : customerRepository.findByFirstname("irina")) {
            System.out.println(customer);
        }
        System.out.println("-- vip customers : ");
        for (CustomerEntity customer : customerRepository.findByVip((byte) 1)) {
            System.out.println(customer);
        }

    }
}
