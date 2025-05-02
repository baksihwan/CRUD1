package com.example.crud1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentResponseDto saveComment(Long boardId, Long userId, String comment){
        Board board = boardRepsitory.findByBoardId(boardId);
        User user = userRepository.findByUserId(user);

        Comment comment = new Comment(boardId, userId, comment);
        Comment savedComment = commentRepository.save(comment);

        return CommentResponseDto.toDto(savedComment);
    }
}
