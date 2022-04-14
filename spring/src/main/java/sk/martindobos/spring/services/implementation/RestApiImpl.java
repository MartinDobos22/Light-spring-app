package sk.martindobos.spring.services.implementation;

import sk.martindobos.spring.models.Example;
import sk.martindobos.spring.models.Todo;
import sk.martindobos.spring.models.TodoList;
import sk.martindobos.spring.services.RestApiService;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class RestApiImpl implements RestApiService {
    @Override
    public Example getExample(Long id) {

        List<HttpMessageConverter<?>> messageConverter = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Arrays.asList(MediaType.ALL));
        messageConverter.add(converter);


        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setMessageConverters();
       Example example= restTemplate.getForObject("url", Example.class);
        return example;
    }

    @Override
    public Todo getTodo(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        Example todo= restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos", Todo.class);
        return todo;
    }

    @Override
    public java.util.List<Todo> getTodos() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<Todo>> responseEntity = restTemplate.exchange("https://jsonplaceholder.typicode.com/todos",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Todo>>(){});
        List<Todo> todos = responseEntity.getBody();
        return todos;
    }

    @Override
    public TodoList getTodoList() {
        RestTemplate restTemplate = new RestTemplate();
        TodoList todoList = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos", TodoList.class);
        return todoList;
    }

    public static void main(String[] args) {
        RestApiImpl restApiimpl =  new RestApiImpl();
        restApiimpl.getExample(222L);

    }
}
