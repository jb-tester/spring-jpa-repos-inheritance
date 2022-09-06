package com.mytests.spring.springJpaRepositoriesInheritance.data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

/**
 * *
 * <p>Created by irina on 9/2/2022.</p>
 * <p>Project: spring-jpa-repos-inheritance</p>
 * *
 */
@Entity
@Table(name = "contact", schema = "jbtests")
public class ContactEntity extends BaseEntityWithAddress {


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactEntity that = (ContactEntity) o;
        return id == that.id && Objects.equals(getFirstname(), that.getFirstname()) && Objects.equals(getLastname(), that.getLastname()) && Objects.equals(telephone, that.telephone) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getFirstname(), getLastname(), telephone, email);
    }

    @Override
    public String toString() {
        return "ContactEntity{" +
                "email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                '}';
    }
}
