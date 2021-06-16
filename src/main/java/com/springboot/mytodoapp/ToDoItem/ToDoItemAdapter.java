package com.springboot.mytodoapp.ToDoItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
* @description : ToDoItem을 ToDoItemResponse로 바꿔주는 작업.
* @author : ChoiJisoo
* @date : 2021-06-04 오후 3:10
**/
public class ToDoItemAdapter {

    public static ToDoItem toToDoItem(final ToDoItemRequest toDoItemRequest) {
        if(toDoItemRequest == null) {
            return null;
        }
        return ToDoItem.builder()
                .id(toDoItemRequest.getId()) // update할 때 반드시 필요
                .title(toDoItemRequest.getTitle())
                .done(toDoItemRequest.isDone())
                .build();
    }

    // 아래의 메서드가 toDoItem과 errors리스트를 받아 ToDoItemResponse를 만들어준다.
    public static ToDoItemResponse toToDoItemResponse(final ToDoItem toDoItem, final List<String> errors) {

        return ToDoItemResponse.builder()
                .toDoItem(toDoItem)
                .errors(Optional.ofNullable(errors).orElse(new ArrayList<>()))
                .build();

    }
}
