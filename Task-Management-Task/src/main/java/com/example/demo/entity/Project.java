package com.example.demo.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="project")
@NoArgsConstructor
@Getter
@Setter
public class Project
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "project_id")
	private int id;
	@Column(name = "project_name")
	private String projectName;
	@Column(name = "project_description")
	private String projectDesc;
	@Column(name = "assign_date")
	private LocalDate startDate;
	@Column(name = "deadline")
	private LocalDate endDate;
	
	@OneToMany(mappedBy = "project", cascade = {CascadeType.ALL})
	private List<Task> task;
}
