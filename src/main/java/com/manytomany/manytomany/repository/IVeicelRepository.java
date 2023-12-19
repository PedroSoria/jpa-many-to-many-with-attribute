package com.manytomany.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.manytomany.manytomany.entity.Veicle;

@RepositoryRestResource
public interface IVeicelRepository extends JpaRepository<Veicle, Long> {

}
