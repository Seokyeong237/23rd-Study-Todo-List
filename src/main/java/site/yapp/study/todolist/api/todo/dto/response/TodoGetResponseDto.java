package site.yapp.study.todolist.api.todo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import site.yapp.study.todolist.api.todo.domain.Todo;

@Getter
@AllArgsConstructor(staticName = "of")
@Builder
public class TodoGetResponseDto {
    private Long todoId;

    private String category;

    private String content;

    private boolean isCompleted;

    public static TodoGetResponseDto of(Todo todo) {
        return TodoGetResponseDto.builder()
                .todoId(todo.getId())
                .category(todo.getCategory())
                .content(todo.getContent())
                .isCompleted(todo.is_completed())
                .build();
    }
}