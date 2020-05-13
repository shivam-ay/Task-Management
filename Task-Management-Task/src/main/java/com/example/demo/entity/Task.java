package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "task")
@NoArgsConstructor
@Getter
@Setter
public class Task 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="task_id")
	private int taskId;
	@Column(name = "task_name")
	private String name;
	@Column(name = "task_description")
	private String taskDesc;
	@Column(name = "assign_date")
	private LocalDate assignDate;
	@Column(name = "deadline")
	private LocalDate deadLine;
	
	@ManyToOne
	@JoinColumn(name = "user_id",  referencedColumnName = "user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "project_id")
	private Project project;

	public Task(String name, String taskDesc, LocalDate assignDate, LocalDate deadLine, User user, Project project) {
		super();
		this.name = name;
		this.taskDesc = taskDesc;
		this.assignDate = assignDate;
		this.deadLine = deadLine;
		this.user = user;
		this.project = project;
	}
}
