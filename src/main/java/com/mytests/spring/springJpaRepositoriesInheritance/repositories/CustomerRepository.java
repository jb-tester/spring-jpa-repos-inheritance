package com.mytests.spring.springJpaRepositoriesInheritance.repositories;

import com.mytests.spring.springJpaRepositoriesInheritance.data.CustomerEntity;
import com.mytests.spring.springJpaRepositoriesInheritance.repositories.baseRepos.AbstractNamedRepository;

import java.util.List;

/**
 * *
 * <p>Created by irina on 9/2/2022.</p>
 * <p>Project: spring-jpa-repos-inheritance</p>
 * *
 */
public interface CustomerRepository extends AbstractNamedRepository<CustomerEntity> {

    List<CustomerEntity> findByVip(Byte vip);

    // @Override
    //  List<CustomerEntity> findByFirstnameAndLastname(); // inspection violation - ok

    @Override
    Iterable<CustomerEntity> findAllById(Iterable<Integer> integers); // inspection violation - should not be shown: https://youtrack.jetbrains.com/issue/IDEA-301097

}
