package com.github.gourav_pal.taskmanager.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity  // Marks this class as a database entity
@Table(name = "tasks")  // Optional: custom table name
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskEntity {

    @Id  // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment ID
    private Long id;

    @Column(nullable = false)  // Title cannot be null
    private String title;

    private String description;
    private LocalDateTime dueDate;
    private boolean completed;

    private LocalDateTime createdAt;

    @PrePersist  // Automatically set createdAt before saving
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}
