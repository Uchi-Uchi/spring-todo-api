package com.challenge.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.todo.dao.TodoMapper;
import com.challenge.todo.entity.Todo;

@Service
public class TodoService {
	
	@Autowired
	private TodoMapper todoMapper;
	
	public List<Todo> getAllTodos(){
		return todoMapper.getAllTodos();
	}	
	
	public Todo getTodo(Long id){
		return todoMapper.getTodo(id);
	}
	
	public Long addTodo(Todo todo){
		todoMapper.addTodo(todo);
		Long newTodoId =todo.getId();
		return newTodoId;
	}	
	
	public void updateTodo(Long id, Todo todo){
		todoMapper.updateTodo(id, todo);
	}	
	public void deleteTodo(Long id){
		todoMapper.deleteTodo(id);
	}
}
