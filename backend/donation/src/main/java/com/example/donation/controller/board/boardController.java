package com.example.donation.controller.board;

import com.example.donation.dto.user.request.BoardCreateRequest;
import com.example.donation.dto.user.response.BoardResponse;
import com.example.donation.dto.user.response.UserResponse;
import com.example.donation.service.board.BoardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class boardController {

    private final BoardService boardService;

    public boardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/board")
    public void saveBoard(@RequestBody BoardCreateRequest request) {
        boardService.saveBoard(request);
    }

    @GetMapping("/board")
    public List<BoardResponse> getUsers() {
        return boardService.getBoard();
    }
}
