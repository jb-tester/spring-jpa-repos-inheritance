package com.mytests.spring.springJpaRepositoriesInheritance;

import com.mytests.spring.springJpaRepositoriesInheritance.repositories.baseRepos.CommonExtraBaseRepositoryImpl;
import com.mytests.spring.springJpaRepositoriesInheritance.services.ContactService;
import com.mytests.spring.springJpaRepositoriesInheritance.services.CustomerService;
import com.mytests.spring.springJpaRepositoriesInheritance.services.Tab1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = CommonExtraBaseRepositoryImpl.class)
public class SpringJpaReposInheritanceApplication implements CommandLineRunner {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private Tab1Service tab1Service;
    @Autowired
    private ContactService contactService;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaReposInheritanceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("======================================================");
        customerService.displayCustomers();
        tab1Service.displayTab1();
        contactService.displayContacts();
        System.out.println("======================================================");
    }
}
