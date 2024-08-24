package com.company.event.repository;

import java.time.LocalDateTime;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;

import com.company.event.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(String status);
    List<Task> findByPriority(String priority);
    List<Task> findByDueDate(LocalDateTime dueDate);
    List<Task> findByTitleContainingOrDescriptionContaining(String title, String description);
}