package com.springboot.mytodoapp.ToDoItem;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ToDoItem {

    /* id가 몽고 DB에서의 ID임을 나타내기 위해 사용하는 어노테이션
    *  이 ID는 몽고 디비가 알아서 만들어줌으로 별도로 개발자가 고유한 값을 생성할 피요가 없다. */
    @Id
    private String id;
    private String title;
    private boolean done;
}
