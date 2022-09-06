package com.mytests.spring.springJpaRepositoriesInheritance.repositories;

import com.mytests.spring.springJpaRepositoriesInheritance.data.ContactEntity;
import com.mytests.spring.springJpaRepositoriesInheritance.repositories.baseRepos.AbstractTelMailRepository;
import com.mytests.spring.springJpaRepositoriesInheritance.repositories.baseRepos.CommonExtraBaseRepository;

import java.util.List;

/**
 * *
 * <p>Created by irina on 9/2/2022.</p>
 * <p>Project: spring-jpa-repos-inheritance</p>
 * *
 */
public interface ContactRepository extends AbstractTelMailRepository<ContactEntity>, CommonExtraBaseRepository<ContactEntity> {
    @Override
    List<ContactEntity> findByAttrPatterns(List<String> patterns, String attrName); // should not display an error for the inherited implemented method!

    //@Override
    // List<ContactEntity> findByTelephones(List<String> telephones); // error is displayed - ok!


    @Override
    void deleteAllByIdInBatch(Iterable<Integer> integers);// should not display an error: https://youtrack.jetbrains.com/issue/IDEA-301097


}
