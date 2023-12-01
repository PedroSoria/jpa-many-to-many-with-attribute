package com.manytomany.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.manytomany.manytomany.entity.Veicle;

@Repository
public interface IVeicelRepository extends JpaRepository<Veicle, Long> {

}
