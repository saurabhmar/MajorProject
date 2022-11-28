package com.cybage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.model.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer>{


	List<Admin> findAll();
	
}