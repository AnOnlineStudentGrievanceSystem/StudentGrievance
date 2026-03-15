package com.codeverse.grievance_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.codeverse.grievance_system.model.Admin;
import com.codeverse.grievance_system.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService service;

    // Register Admin
    @PostMapping("/register")
    public Admin register(@RequestBody Admin admin){
        return service.register(admin);
    }

    // Login Admin
    @PostMapping("/login")
    public Admin login(@RequestBody Admin admin){

        return service.login(admin.getUsername(), admin.getPassword());

    }

}