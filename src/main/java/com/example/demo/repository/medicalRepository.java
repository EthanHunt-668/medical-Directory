package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.medicalEntity;

@Repository
public interface medicalRepository extends JpaRepository<medicalEntity,Integer> {

}
