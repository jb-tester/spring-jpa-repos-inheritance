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
@Table(name = "customer", schema = "jbtests")
public class CustomerEntity extends BaseEntityWithNames {


    @Basic
    @Column(name = "birthday")
    private String birthday;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "street")
    private String street;
    @Basic
    @Column(name = "building")
    private Integer building;
    @Basic
    @Column(name = "card")
    private Integer card;
    @Basic
    @Column(name = "mobilephone")
    private String mobilephone;
    @Basic
    @Column(name = "homephone")
    private String homephone;
    @Basic
    @Column(name = "credit")
    private Integer credit;
    @Basic
    @Column(name = "vip")
    private Byte vip;


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getBuilding() {
        return building;
    }

    public void setBuilding(Integer building) {
        this.building = building;
    }

    public Integer getCard() {
        return card;
    }

    public void setCard(Integer card) {
        this.card = card;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Byte getVip() {
        return vip;
    }

    public void setVip(Byte vip) {
        this.vip = vip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerEntity that = (CustomerEntity) o;
        return id == that.id && Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname) && Objects.equals(birthday, that.birthday) && Objects.equals(city, that.city) && Objects.equals(street, that.street) && Objects.equals(building, that.building) && Objects.equals(card, that.card) && Objects.equals(mobilephone, that.mobilephone) && Objects.equals(homephone, that.homephone) && Objects.equals(credit, that.credit) && Objects.equals(vip, that.vip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname, birthday, city, street, building, card, mobilephone, homephone, credit, vip);
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "birthday='" + birthday + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building=" + building +
                ", card=" + card +
                ", mobilephone='" + mobilephone + '\'' +
                ", homephone='" + homephone + '\'' +
                ", credit=" + credit +
                ", vip=" + vip +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                '}';
    }
}
