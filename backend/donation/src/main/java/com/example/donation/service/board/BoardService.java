package com.example.donation.service.board;

import com.example.donation.domain.board.Board;
import com.example.donation.domain.board.BoardRepository;
import com.example.donation.domain.user.User;
import com.example.donation.dto.user.request.BoardCreateRequest;
import com.example.donation.dto.user.response.BoardResponse;
import com.example.donation.dto.user.response.UserResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

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

    @Transactional(readOnly = true)
    public List<BoardResponse> getBoard() {
        List<Board> boards = boardRepository.findAll();
        return boards.stream()
                .map(BoardResponse::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public void deleteBoard(long boardId) {
        Board board = boardRepository.findByBoardId(boardId)
                .orElseThrow(IllegalArgumentException::new);

        boardRepository.delete(board);
    }
}
