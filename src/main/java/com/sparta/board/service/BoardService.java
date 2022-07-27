package com.sparta.board.service;

import com.sparta.board.domain.Board;
import com.sparta.board.dto.BoardRequestDto;
import com.sparta.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

//    public final BoardRepository boardRepository;
//
//
//    public Long detail(Long id, BoardRequestDto requestDto) {
//        Board board = boardRepository.findById(id).orElseThrow(
//                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
//        );
//        board.detail(requestDto);
//        return id;
//    }
}
