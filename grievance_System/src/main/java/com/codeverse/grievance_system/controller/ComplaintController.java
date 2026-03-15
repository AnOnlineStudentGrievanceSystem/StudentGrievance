package com.codeverse.grievance_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.codeverse.grievance_system.model.Complaint;
import com.codeverse.grievance_system.service.ComplaintService;

@RestController
@RequestMapping("/complaints")
public class ComplaintController {

    @Autowired
    private ComplaintService complaintService;

    // Add Complaint
    @PostMapping("/add")
    public Complaint addComplaint(@RequestBody Complaint complaint) {
        return complaintService.addComplaint(complaint);
    }

    // Get All Complaints
    @GetMapping("/all")
    public List<Complaint> getAllComplaints() {
        return complaintService.getAllComplaints();
    }

    // Track Complaint
    @GetMapping("/track/{trackingId}")
    public Complaint trackComplaint(@PathVariable String trackingId) {
        return complaintService.trackComplaint(trackingId);
    }

    // Update Status
    @PutMapping("/update/{id}")
    public Complaint updateStatus(@PathVariable Long id, @RequestParam String status) {
        return complaintService.updateStatus(id, status);
    }
}