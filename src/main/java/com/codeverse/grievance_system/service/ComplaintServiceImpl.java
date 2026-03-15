package com.codeverse.grievance_system.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeverse.grievance_system.model.Complaint;
import com.codeverse.grievance_system.repository.ComplaintRepository;

@Service
public class ComplaintServiceImpl implements ComplaintService {

    @Autowired
    private ComplaintRepository complaintRepository;

    @Override
    public Complaint addComplaint(Complaint complaint) {

        String trackingId = "GRV" + System.currentTimeMillis();

        complaint.setTrackingId(trackingId);
        complaint.setStatus("Pending");
        complaint.setCreatedAt(LocalDateTime.now());

        return complaintRepository.save(complaint);
    }

    @Override
    public List<Complaint> getAllComplaints() {

        return complaintRepository.findAll();
    }

    @Override
    public Complaint trackComplaint(String trackingId) {

        return complaintRepository.findByTrackingId(trackingId);
    }

    @Override
    public Complaint updateStatus(Long id, String status) {

        Complaint complaint = complaintRepository.findById(id).get();

        complaint.setStatus(status);

        return complaintRepository.save(complaint);
    }
}