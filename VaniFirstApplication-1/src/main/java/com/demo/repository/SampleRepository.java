package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Sample;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Integer>{

}
