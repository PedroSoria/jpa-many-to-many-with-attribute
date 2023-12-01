package com.manytomany.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.manytomany.manytomany.entity.Sale;

@Repository
public interface ISaleRepository extends JpaRepository<Sale, Long> {

}
