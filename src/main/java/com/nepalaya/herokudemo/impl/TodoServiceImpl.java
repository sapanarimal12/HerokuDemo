package com.nepalaya.herokudemo.impl;


import com.nepalaya.herokudemo.dto.Response;
import com.nepalaya.herokudemo.model.Todo;
import com.nepalaya.herokudemo.repository.TodoRepository;
import com.nepalaya.herokudemo.request.CreateTodoRequest;
import com.nepalaya.herokudemo.service.TodoService;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

    private  final TodoRepository todoRepository ;
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public Response create(CreateTodoRequest request) {
        todoRepository.save(new Todo(request.getDescription()));
        return new Response()
                .buildSuccess("Todo Saved Successfully");
    }

    @Override
    public Response getAll() {
        return new Response()
                .buildSuccess("Todo Fetched Successfully",todoRepository.findAll());
    }
}
