package com.acme.todolist.adapters.persistence;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.acme.todolist.application.port.out.LoadTodoItem;
import com.acme.todolist.domain.TodoItem;


/**
 * Implémentation JPA des port out de persistence 
 * @author bflorat
 *
 */
@Component
public class ToItemPersistenceAdapter implements LoadTodoItem {
	
	private TodoItemRepository todoItemRepository;
	
	private TodoItemMapper mapper;

	
	@Inject
	public ToItemPersistenceAdapter(TodoItemRepository todoItemRepository, TodoItemMapper mapper) {
		super();
		this.todoItemRepository = todoItemRepository;
		this.mapper = mapper;
	}
	

	@Override
	public List<TodoItem> loadAllTodoItems() {
		return this.todoItemRepository.findAll().stream().map(todoItemJpaEntory -> mapper.mapToTodoItem(todoItemJpaEntory)).collect(Collectors.toList());
	}

}