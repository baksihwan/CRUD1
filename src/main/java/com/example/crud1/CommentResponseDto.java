package com.example.crud1;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommentResponseDto {
    private Long id;
    private Long boardId;
    private String userNickname;
    private String comment;

    public CommentResponseDto(Long id, Long boardId, String userNickname, String comment) {
        this.id = id;
        this.boardId = boardId;
        this.userNickname = userNickname;
        this.comment = comment;
    }

    public static CommentResponseDto toDto(Comment comment) {
        return new CommentResponseDto(comment.getId(), comment.getBoardId(), comment.userNickname(), comment.getComment());
    }
}
