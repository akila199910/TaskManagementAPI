package com.example.TaskManagementAPI.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

@Entity
@Table(name = "tasks")
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String title;
    @Column(length = 2000)

    private String description;

    private String status = "PENDING";

    private Instant createdAt = Instant.now();

    private Instant updatedAt = Instant.now();

}
