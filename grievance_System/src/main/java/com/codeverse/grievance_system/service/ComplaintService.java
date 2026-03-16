package com.codeverse.grievance_system.service;

import java.util.List;
import com.codeverse.grievance_system.model.Complaint;

public interface ComplaintService {

    Complaint addComplaint(Complaint complaint);

    List<Complaint> getAllComplaints();

    Complaint trackComplaint(String trackingId);

    Complaint updateStatus(Long id, String status);
}