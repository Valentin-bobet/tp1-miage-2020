/**
 * 
 */
package com.acme.todolist.application.service;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.acme.todolist.application.port.in.SetTodoItem;
import com.acme.todolist.application.port.out.UpdateTodoItem;
import com.acme.todolist.domain.TodoItem;

/**
 * @author Valentin
 *
 */
@Component
public class SetTodoItemService implements SetTodoItem {

	private UpdateTodoItem updateTodo;
	
	@Inject
	public SetTodoItemService(UpdateTodoItem updateTodoItem) {
		this.updateTodo = updateTodoItem;
	}
	
	@Override
	public void setTodoItem(TodoItem item) {
		System.out.println("1 : "+item.getId());
		this.updateTodo.storeNewTodoItem(item);
	}

}
