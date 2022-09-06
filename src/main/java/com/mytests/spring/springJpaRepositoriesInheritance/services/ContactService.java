package com.mytests.spring.springJpaRepositoriesInheritance.services;

import com.mytests.spring.springJpaRepositoriesInheritance.data.ContactEntity;
import com.mytests.spring.springJpaRepositoriesInheritance.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * *
 * <p>Created by irina on 9/2/2022.</p>
 * <p>Project: spring-jpa-repos-inheritance</p>
 * *
 */
@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;


    public void displayContacts() {
        System.out.println("=== Contacts tests: ===");
        System.out.println("--- the inherited query method with standard syntax:---");
        for (ContactEntity contact : contactRepository.findByEmail("petrovskaya@gmail.com")) {
            System.out.println(contact);
        }
        System.out.println("--- the inherited (not overriden!) query method with non-standard syntax implemented as default method in the base interface:---");
        System.out.println("!!should fail if you uncomment the overridong method in the contactRepository interface ");
        for (ContactEntity contact : contactRepository.findByTelephones(Arrays.asList("44", "812"))) {
            System.out.println(contact);
        }
        System.out.println("--- the inherited query method with non-standard syntax implemented in the base class:---");
        for (ContactEntity contact : contactRepository.findByAttrPatterns(Arrays.asList("gmail", "borland"), "email")) {
            System.out.println(contact);
        }
    }
}
