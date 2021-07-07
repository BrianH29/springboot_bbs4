package com.bh.jdbc.service;

import com.bh.jdbc.domain.Board;
import com.bh.jdbc.dto.BoardDto;
import com.bh.jdbc.repository.BoardRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BoardService {

    private BoardRepository boardRepository;

    @Autowired
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Transactional
    public List<BoardDto> findAll(){
        List<Board> boards = boardRepository.findAll();
        List<BoardDto> boardDtoList = new ArrayList<>();

        for(Board board : boards){
            BoardDto boardDto = BoardDto.builder()
                    .board_id(board.getBoard_id())
                    .writer(board.getWriter())
                    .title(board.getTitle())
                    .content(board.getContent())
                    .createDate(board.getCreateDate())
                    .build();
            boardDtoList.add(boardDto);
        }
        return boardDtoList;
    }

    @Transactional
    public BoardDto findById(Long board_id){
        Board findPost = boardRepository.findById(board_id);

        BoardDto boardDto = BoardDto.builder()
                .board_id(findPost.getBoard_id())
                .writer(findPost.getWriter())
                .title(findPost.getTitle())
                .content(findPost.getContent())
                .createDate(findPost.getCreateDate())
                .build();
        return boardDto;
    }

    @Transactional
    public void save(BoardDto boardDto){
        boardRepository.save(boardDto);
    }
}
