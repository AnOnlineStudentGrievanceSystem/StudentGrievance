package com.codeverse.grievance_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codeverse.grievance_system.model.Complaint;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {

    Complaint findByTrackingId(String trackingId);

}