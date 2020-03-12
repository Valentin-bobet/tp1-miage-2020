/**
 * 
 */
package com.acme.todolist.application.port.in;

import com.acme.todolist.domain.TodoItem;

/**
 * @author Valentin
 *
 */
public interface SetTodoItem {

	void setTodoItem(TodoItem item);
	
}
