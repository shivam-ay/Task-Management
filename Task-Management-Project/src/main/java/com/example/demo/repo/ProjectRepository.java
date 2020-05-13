package com.example.demo.repo;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Project;

@Repository(value = "projectRepo")
@EnableTransactionManagement
public interface ProjectRepository extends JpaRepository<Project,Integer>
{
	@Query
	@RestResource(path = "byusers")
	@Transactional
	public Page<Project> findByUserId(@RequestParam int userId, Pageable pageable);
	@RestResource(path = "name")
	@Transactional
	public Page<Project> findByUserUserNameStartsWith(@RequestParam String userName, Pageable pageable);
}
