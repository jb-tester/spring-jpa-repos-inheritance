package com.mytests.spring.springJpaRepositoriesInheritance.repositories.baseRepos;

import com.mytests.spring.springJpaRepositoriesInheritance.data.BaseEntityWithId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

/**
 * *
 * <p>Created by irina on 9/2/2022.</p>
 * <p>Project: spring-jpa-repos-inheritance</p>
 * *
 */
@NoRepositoryBean
public interface CommonExtraBaseRepository<T extends BaseEntityWithId> extends JpaRepository<T, Integer> {

    List<T> findByAttrPatterns(List<String> patterns, String attrName);
}
