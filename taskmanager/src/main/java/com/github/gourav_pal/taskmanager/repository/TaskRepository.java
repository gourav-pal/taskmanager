package com.github.gourav_pal.taskmanager.repository;

import com.github.gourav_pal.taskmanager.model.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // Optional: marks it as a Spring-managed bean
public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
    // No need to implement anything — JpaRepository provides CRUD
}
