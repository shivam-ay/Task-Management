package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne
	@JoinColumn(name = "user_id",  referencedColumnName = "user_id")
	private User user;

	public Project(String projectName, String projectDesc, LocalDate startDate, LocalDate endDate, User user) {
		super();
		this.projectName = projectName;
		this.projectDesc = projectDesc;
		this.startDate = startDate;
		this.endDate = endDate;
		this.user = user;
	}
	
	
	

}
