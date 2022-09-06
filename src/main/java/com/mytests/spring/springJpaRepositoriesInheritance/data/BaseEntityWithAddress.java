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
public class BaseEntityWithAddress extends BaseEntityWithNames {


    @Basic
    @Column(name = "email")
    protected String email;
    @Basic
    @Column(name = "telephone")
    protected String telephone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
