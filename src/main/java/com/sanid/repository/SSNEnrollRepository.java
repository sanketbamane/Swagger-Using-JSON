package com.sanid.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanid.entity.SSNEnrollEntity;

public interface SSNEnrollRepository extends JpaRepository<SSNEnrollEntity, Serializable> {

	
}
