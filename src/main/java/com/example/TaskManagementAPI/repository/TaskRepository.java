package com.example.TaskManagementAPI.repository;

import com.example.TaskManagementAPI.model.Task;
import com.example.TaskManagementAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {
    List<Task> findByUser(User user);

}
