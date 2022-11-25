package com.cybage.repository;
import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cybage.model.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer>{


	List<Admin> findByPrice( int price);
	List<Admin> findByAdminName(String name);
	//List<Admin> findByAdminNameAndPrice(String name,int price);
	List<Admin>findByPriceLessThan(int price);
	//Object findAll(Pageable pageble);
	@Query(value="select * FROM Admin_Info WHERE price =:pr",nativeQuery=true)
	List<Admin> getByPrice(@Param("pr") int price);	}
