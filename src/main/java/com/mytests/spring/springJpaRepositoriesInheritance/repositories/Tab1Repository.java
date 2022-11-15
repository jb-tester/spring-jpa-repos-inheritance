package com.mytests.spring.springJpaRepositoriesInheritance.repositories;

import com.mytests.spring.springJpaRepositoriesInheritance.data.Tab1Entity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * *
 * <p>Created by irina on 9/2/2022.</p>
 * <p>Project: spring-jpa-repos-inheritance</p>
 * *
 */
//@Repository
public interface Tab1Repository extends JpaRepository<Tab1Entity, Integer> {

    // no completion and validation in case of missing prefix - https://youtrack.jetbrains.com/issue/IDEA-76639
    List<Tab1Entity> firstnameAndAgeGreaterThan(String name, int age);

    List<Tab1Entity> findAllByFirstnameIn(List<String> firstname);

    @Override
    void deleteAllById(Iterable<? extends Integer> integers);// should not display an error: https://youtrack.jetbrains.com/issue/IDEA-301097

    @Override
    void deleteAllByIdInBatch(Iterable<Integer> integers);// should not display an error: https://youtrack.jetbrains.com/issue/IDEA-301097

}
