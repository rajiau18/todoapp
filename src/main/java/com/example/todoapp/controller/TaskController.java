package com.example.todoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todoapp.entity.Task;
import com.example.todoapp.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	@GetMapping
	public List<Task> getTasks()
	{
		return taskService.getAll();
	}
	
	@PostMapping
	public Task addTask(@RequestBody Task task)
	{
		return taskService.add(task);
	}
	
	@DeleteMapping("/{id}")
	public String deleteTask(@PathVariable Long id)
	{
		taskService.delete(id);
		return "Task Deleted";
	}
}
