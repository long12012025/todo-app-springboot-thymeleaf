package com.example.demo.service;

import com.example.demo.entity.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getAllTodos();
    Todo getTodoById(Long id);
    Todo createTodo(Todo todo);
    Todo updateTodo(Long id, Todo updatedTodo);
    void deleteTodo(Long id);
    void toggleComplete(Long id);
}
