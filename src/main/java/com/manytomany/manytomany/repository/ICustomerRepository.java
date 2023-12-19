package com.manytomany.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.manytomany.manytomany.entity.Customer;

@RepositoryRestResource
public interface ICustomerRepository extends JpaRepository<Customer, Long> {

}
