package com.codeverse.grievance_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codeverse.grievance_system.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{

    Admin findByUsername(String username);

}