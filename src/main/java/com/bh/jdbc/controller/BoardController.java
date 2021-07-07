package com.bh.jdbc.controller;

import com.bh.jdbc.domain.Board;
import com.bh.jdbc.dto.BoardDto;
import com.bh.jdbc.service.BoardService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class BoardController {
    private BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping
    public List<BoardDto> getBoardList(){
        return boardService.findAll();
    }

    @GetMapping("/bbs/{boardId}")
    public BoardDto getBoard(@PathVariable("boardId") Long board_id){
        return boardService.findById(board_id);
    }

    @PostMapping("/bbs")
    public void insertBoard(@RequestBody BoardDto boardDto){
       boardService.save(boardDto);
    }
}
