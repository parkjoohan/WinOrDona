package com.example.donation.service.board;

import com.example.donation.domain.board.Board;
import com.example.donation.domain.board.BoardRepository;
import com.example.donation.dto.user.request.BoardCreateRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class BoardService {

    private final BoardRepository boardRepository;
    LocalDateTime now = LocalDateTime.now();

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Transactional
    public void saveBoard(BoardCreateRequest request) {
        boardRepository.save(new Board(request.getTitle(), request.getContent(), request.getUser_uid(), now));
    }
}
