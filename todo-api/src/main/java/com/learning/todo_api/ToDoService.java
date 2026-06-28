package com.learning.todo_api;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {
    @Getter  // for todoList return

    private List<ToDo> todoList=new ArrayList<>();
    private int id=1;//initially by default value de do

    public ToDo addTodo(String title){
        ToDo todo= new ToDo(id++,title,false);// nya address hold karega
        todoList.add(todo);// ye list hr object ka address hold karega jisse woh gyb na hoon jaye
        return todo;
    }

   public void deleteTodo(int id){
        todoList.removeIf(todo->todo.getId()==id);
        // sbe pehle ye todo list mein jayega then -->
   }

   /* bina lambda ka aisa hota ye
   for(Todo todo : todos) {
    if(todo.getId() == id) {
        todos.remove(todo);
    }
}
    */

}
