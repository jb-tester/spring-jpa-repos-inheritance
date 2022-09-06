package com.mytests.spring.springJpaRepositoriesInheritance.repositories;

import com.mytests.spring.springJpaRepositoriesInheritance.data.Tab1Entity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * *
 * <p>Created by irina on 9/2/2022.</p>
 * <p>Project: spring-jpa-repos-inheritance</p>
 * *
 */
//@Repository
public interface Tab1Repository extends CrudRepository<Tab1Entity, Integer> {

    // no completion and validation in case of missing prefix - https://youtrack.jetbrains.com/issue/IDEA-76639
    List<Tab1Entity> firstnameAndAgeGreaterThan(String name, int age);

    List<Tab1Entity> findAllByFirstnameIn(List<String> firstname);

}
