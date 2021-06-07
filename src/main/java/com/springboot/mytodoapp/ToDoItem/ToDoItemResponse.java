package com.springboot.mytodoapp.ToDoItem;

import com.springboot.mytodoapp.ApiResponse.ApiResponse;
import lombok.Builder;

import java.util.List;

/**
*
* @description :
* @author : ChoiJisoo
* @date : 2021-06-04 오후 2:33
**/
public class ToDoItemResponse extends ApiResponse<ToDoItem> {

    /* ApiResponse의 T에는 ToDoItem이 들어있다고 생각하면 된다.
    그리고 이 클래스의 생성자에서 부모클래스인 ApiResponse의 data를 toDoItem으로 초기화해준다.
     */
    @Builder
    public ToDoItemResponse(final ToDoItem toDoItem, final List<String> errors) {
        super(toDoItem);
        this.setErrors(errors);
    }
}
