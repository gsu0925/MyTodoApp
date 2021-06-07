package com.springboot.mytodoapp.ToDoItem;

import org.springframework.stereotype.Service;

@Service
public class ToDoItemService {

    public ToDoItem get(final String id) {
        // id validation
        return ToDoItem.builder()
                .title("Add an id validation")
                .build();
    }
}
