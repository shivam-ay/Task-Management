package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Task;

@Repository(value ="taskRepo")
public interface TaskRepository extends JpaRepository<Task,Integer>
{

}
