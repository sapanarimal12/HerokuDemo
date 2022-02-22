package com.nepalaya.herokudemo.controller;

import com.nepalaya.herokudemo.dto.Response;
import com.nepalaya.herokudemo.model.Todo;
import com.nepalaya.herokudemo.request.CreateTodoRequest;
import com.nepalaya.herokudemo.service.TodoService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("todo")
public class TodoController {

    private  final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public Response getAllTodos(){
        return todoService.getAll();
    }

    @PostMapping
    public Response save(@Valid @RequestBody CreateTodoRequest request){
        return todoService.getAll();
    }

}
