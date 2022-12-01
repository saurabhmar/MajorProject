
package com.cybage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.model.Complaints;
@Repository
public interface complaintsRepository extends JpaRepository<Complaints,Integer>{


	List<Complaints> findAll();

}