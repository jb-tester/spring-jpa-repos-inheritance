package com.mytests.spring.springJpaRepositoriesInheritance.repositories.baseRepos;

import com.mytests.spring.springJpaRepositoriesInheritance.data.BaseEntityWithAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * *
 * <p>Created by irina on 9/2/2022.</p>
 * <p>Project: spring-jpa-repos-inheritance</p>
 * *
 */
@NoRepositoryBean
public interface AbstractTelMailRepository<T extends BaseEntityWithAddress> extends JpaRepository<T, Integer> {


    default List<T> findByTelephones(List<String> telephones) {
        if (!telephones.iterator().hasNext()) {
            return Collections.emptyList();
        } else {
            List<T> results = new ArrayList();
            for (String p : telephones) {
                results.addAll(findByTelephoneLike(p));
            }

            return results;
        }
    }

    ;

    List<T> findByTelephoneLike(String pattern);

    List<T> findByEmail(String email);


}
