package com.bh.jdbc.repository;

import com.bh.jdbc.domain.Board;
import com.bh.jdbc.dto.BoardDto;
import com.bh.jdbc.mapper.BoardMapper;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
public class BoardRepository {
    private BoardMapper mapper;

    public BoardRepository(BoardMapper mapper) {
        this.mapper = mapper;
    }

    public List<Board> findAll(){
        return mapper.findAll();
    }

    public Board findById(Long board_id){
        return mapper.findById(board_id);
    }

    public void save(BoardDto boardDto){
        mapper.save(boardDto.toEntity());
    }
}
