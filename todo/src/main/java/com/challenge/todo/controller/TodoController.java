package com.challenge.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.todo.entity.Todo;
import com.challenge.todo.service.TodoService;

@RestController
@CrossOrigin
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@GetMapping("/todos")
	public List<Todo> getAllTodos() {
		List<Todo> allTodos = todoService.getAllTodos();
		return allTodos;
	}
	
	@GetMapping("todos/{id}")
	public Todo getTodo(@PathVariable("id") Long id) {
		Todo todo = todoService.getTodo(id);
		return todo;
	}
	
	@PostMapping("/todos")
	public Long addTodo(@RequestBody Todo todo) {
		Long NewTodoId = todoService.addTodo(todo);
		return NewTodoId;
	}
	
	@PutMapping("/todos/{id}")
	public void updateTodo(
			@PathVariable("id") Long id,
			@RequestBody Todo todo) {
		todoService.updateTodo(id, todo);
	}
	
	@DeleteMapping("/todos/{id}")
	public void deleteTodo(@PathVariable("id") Long id) {
		todoService.deleteTodo(id);
	}
	
}
