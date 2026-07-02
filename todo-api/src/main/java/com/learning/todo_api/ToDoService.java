package com.learning.todo_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService{

    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDo> getTodoList(){
        return toDoRepository.findAll();
    }

    public ToDo addTodo(String title){
        ToDo t=new ToDo(null,title,false);
        ToDo t1=toDoRepository.save(t);
        return t1;
    }

    public void deleteTodo(int id){
        toDoRepository.deleteById(id);
    }

}
