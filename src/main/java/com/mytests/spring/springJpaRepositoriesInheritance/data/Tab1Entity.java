package com.mytests.spring.springJpaRepositoriesInheritance.data;

import javax.persistence.Basic;
import javax.persistence.Column;
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
@Table(name = "tab1", schema = "jbtests")
public class Tab1Entity extends BaseEntityWithAddress {
    @Basic
    @Column(name = "name")
    protected String name;
    @Basic
    @Column(name = "surname")
    private String surname;
    @Basic
    @Column(name = "gender")
    private String gender;
    @Basic
    @Column(name = "age")
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tab1Entity that = (Tab1Entity) o;
        return id == that.id && age == that.age && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(gender, that.gender) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname) && Objects.equals(getTelephone(), that.getTelephone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, gender, age, getEmail(), firstname, lastname, getTelephone());
    }

    @Override
    public String toString() {
        return "Tab1Entity{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                '}';
    }
}
