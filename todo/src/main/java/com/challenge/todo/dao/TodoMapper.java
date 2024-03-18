package com.challenge.todo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.challenge.todo.entity.Todo;

@Mapper
public interface TodoMapper {
	
	List<Todo> getAllTodos();
	Todo getTodo(Long id);
	Long addTodo(Todo todo);
	void updateTodo(Long id, Todo todo);
	void deleteTodo(Long id);
}
