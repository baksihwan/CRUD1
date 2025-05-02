package com.example.crud1;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long boardId;

    private Long userId;

    private String comment;

    private String userNickname;

    public Comment(Long boardId, Long userId, String comment) {
        this.boardId = boardId;
        this.userId = userId;
        this.comment = comment;
    }
    public Comment() {}
}
