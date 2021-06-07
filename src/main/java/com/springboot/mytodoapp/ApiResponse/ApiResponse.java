package com.springboot.mytodoapp.ApiResponse;

import lombok.*;

import java.util.List;

/**
* @description : ApiResponse
* @author : ChoiJisoo
* @date : 2021-06-04 오후 2:07
**/
@Getter @Setter
@RequiredArgsConstructor
public abstract class ApiResponse<T> {

    // data에는 어떤 모델이든 들어갈 수 있고,
    // 각 response는 항상 errors 에러 리스트를 가지고 있으므로
    // response마다 errors를 추가하지 않아도 된다.
    @NonNull private T data;
    private List<String> errors;
}
