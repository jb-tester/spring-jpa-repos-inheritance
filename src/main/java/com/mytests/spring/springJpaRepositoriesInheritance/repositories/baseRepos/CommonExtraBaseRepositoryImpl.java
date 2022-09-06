package com.mytests.spring.springJpaRepositoriesInheritance.repositories.baseRepos;

import com.mytests.spring.springJpaRepositoriesInheritance.data.BaseEntityWithId;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * *
 * <p>Created by irina on 9/2/2022.</p>
 * <p>Project: spring-jpa-repos-inheritance</p>
 * *
 */

public class CommonExtraBaseRepositoryImpl<T extends BaseEntityWithId> extends SimpleJpaRepository<T, Integer> implements CommonExtraBaseRepository<T> {


    private final EntityManager entityManager;

    public CommonExtraBaseRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }

    private List<T> searchByAttrPattern(String pattern, String attributeName) {

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(getDomainClass());
        Root<T> root = query.from(getDomainClass());
        query.select(root).where(builder.like(root.get(attributeName), "%" + pattern + "%"));
        TypedQuery<T> q = entityManager.createQuery(query);
        return q.getResultList();
    }

    @Transactional
    public List<T> findByAttrPatterns(List<String> patterns, String attrName) {

        if (!patterns.iterator().hasNext()) {
            return Collections.emptyList();
        } else {
            List<T> results = new ArrayList();
            for (String p : patterns) {
                results.addAll(searchByAttrPattern(p, attrName));
            }

            return results;
        }
    }
}
