package com.mytests.spring.springJpaRepositoriesInheritance.services;

import com.mytests.spring.springJpaRepositoriesInheritance.data.Tab1Entity;
import com.mytests.spring.springJpaRepositoriesInheritance.repositories.Tab1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 9/2/2022.</p>
 * <p>Project: spring-jpa-repos-inheritance</p>
 * *
 */
@Service
public class Tab1Service {

    @Autowired
    private Tab1Repository tab1Repository;

    public void displayTab1() {
        System.out.println("=== Tab1 test: ===");
        System.out.println("--test query methods without prefixes:");
        for (Tab1Entity entity : tab1Repository.firstnameAndAgeGreaterThan("masha", 15)) {
            System.out.println(entity);
        }

    }
}
