package com.mytests.spring.springJpaRepositoriesInheritance.repositories.baseRepos;

import com.mytests.spring.springJpaRepositoriesInheritance.data.BaseEntityWithNames;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

/**
 * *
 * <p>Created by irina on 9/2/2022.</p>
 * <p>Project: spring-jpa-repos-inheritance</p>
 * *
 */
@NoRepositoryBean
public interface AbstractNamedRepository<T extends BaseEntityWithNames> extends CrudRepository<T, Integer> {
    // no completion/validation for query methods in the generic repos: https://youtrack.jetbrains.com/issue/IDEA-301293
    // List<T> findByFirstnameAndLastname();  // Incorrect query method! should be reported

    List<T> findByFirstname(String firstname);

    List<T> findByLastname(String lastname);

}
