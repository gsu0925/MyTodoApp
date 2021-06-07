package com.springboot.mytodoapp.ToDoItem;

import java.util.List;

/**
*
* @description : ToDoItem을 ToDoItemResponse로 바꿔주는 작업.
* @author : ChoiJisoo
* @date : 2021-06-04 오후 3:10
**/
public class ToDoItemAdapter {

    // 아래의 메서드가 toDoItem과 errors리스트를 받아 ToDoItemResponse를 만들어준다.
    public static ToDoItemResponse toDoItemResponse(final ToDoItem toDoItem, final List<String> errors) {
        return ToDoItemResponse.builder().toDoItem(toDoItem).errors(errors).build();

    }
}
