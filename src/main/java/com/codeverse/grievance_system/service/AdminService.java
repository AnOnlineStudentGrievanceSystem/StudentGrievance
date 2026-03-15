package com.codeverse.grievance_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeverse.grievance_system.model.Admin;
import com.codeverse.grievance_system.repository.AdminRepository;

@Service
public class AdminService {

    @Autowired
    private AdminRepository repository;

    // Register new admin
    public Admin register(Admin admin){
        return repository.save(admin);
    }

    // Admin login
    public Admin login(String username, String password){

        Admin admin = repository.findByUsername(username);

        if(admin != null && admin.getPassword().equals(password)){
            return admin;
        }

        return null;
    }

}
