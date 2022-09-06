package com.mytests.spring.springJpaRepositoriesInheritance.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * *
 * <p>Created by irina on 9/2/2022.</p>
 * <p>Project: spring-jpa-repos-inheritance</p>
 * *
 */
@MappedSuperclass
public class BaseEntityWithNames extends BaseEntityWithId {

    @Basic
    @Column(name = "firstname")
    protected String firstname;
    @Basic
    @Column(name = "lastname")
    protected String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
