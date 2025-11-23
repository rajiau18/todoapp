package com.example.todoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todoapp.entity.Task;
import com.example.todoapp.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired	
	private TaskRepository repo;
	
	public List<Task> getAll()
	{
		return repo.findAll();
	}
	public Task add(Task task)
	{
		return repo.save(task);
	}
	public void delete(Long id)
	{
		repo.deleteById(id);
	}
}
