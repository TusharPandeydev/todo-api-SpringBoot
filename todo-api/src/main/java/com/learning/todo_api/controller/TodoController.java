package com.learning.todo_api.controller;

import com.learning.todo_api.service.ToDoService;
import com.learning.todo_api.entity.ToDo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
public class TodoController {
   // MAKE TODOSEVICE CLASS KYUKI TODOCONTROLLER USKE BINA KAAM NAHI KREG
    ToDoService todoService; // help of @allargconstructor refrence varibale ko iska object mil
    // bhi jaata hai
    @GetMapping("/list")
    public List<ToDo>getAllTodos(){
        return todoService.getTodoList();
    }

  @PostMapping("/add")
    public ToDo addtodo(@RequestBody String task ){ //return type todo
        ToDo t=todoService.addTodo(task);
        return t;
  }
  @DeleteMapping("/deleteID/{id}")
    public String deleteTodo(@PathVariable int id){
        todoService.deleteTodo(id);
        return "given id->"+id+"is deleted";
  }
}
