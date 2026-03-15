package com.codeverse.grievance_system.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trackingId;

    private String category;

    private String description;

    private String status;

    private String priority;

    // Student Roll Number
    private String studentRollNo;

    private LocalDateTime createdAt;
}