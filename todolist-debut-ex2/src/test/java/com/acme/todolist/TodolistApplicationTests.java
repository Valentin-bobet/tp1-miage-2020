package com.acme.todolist;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Instant;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.acme.todolist.domain.TodoItem;

@SpringBootTest
class TodolistApplicationTests {

	@Test
	void contextLoads() {
		String content = "test";
		TodoItem item = new TodoItem("test", Instant.now().minusSeconds(3600*24), content);
		
		assertTrue(item.getContent().length() > content.length(), "ok");
	}

}
