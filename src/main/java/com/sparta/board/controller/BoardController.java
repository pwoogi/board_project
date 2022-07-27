package com.sparta.board.controller;

import com.sparta.board.domain.Board;
import com.sparta.board.dto.BoardRequestDto;
import com.sparta.board.repository.BoardRepository;
import com.sparta.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardRepository boardRepository;
    private final BoardService boardService;

    @PostMapping("/api/boards")
    public Board creatPosting(@RequestBody BoardRequestDto requestDto) {
        Board board = new Board(requestDto);
        return  boardRepository.save(board);
    }

    @GetMapping("/api/boards")
    public List<Board> getPosting() {
        return boardRepository.findAllByOrderByModifiedAtDesc();
    }

    @GetMapping("/api/boards/{id}")
    public Board detail(@PathVariable Long id) {
        Board board = boardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException()
        );
        return board;
    }
//    @GetMapping("/api/boards/{password}")

    @DeleteMapping("/api/boards/{id}")
    public Long deletePosting(@PathVariable Long id) {
        boardRepository.deleteById(id);
        return id;
    }
}
