package sk.martindobos.spring.services;

import sk.martindobos.spring.models.Example;
import sk.martindobos.spring.models.Todo;
import sk.martindobos.spring.models.TodoList;

import java.util.List;

public interface RestApiService {
    Example getExample(Long id);
    Todo getTodo(Long id);
    List<Todo> getTodos();
    TodoList getTodoList();

}
