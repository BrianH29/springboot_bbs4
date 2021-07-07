package com.bh.jdbc.repository;

import com.bh.jdbc.domain.Board;
import com.bh.jdbc.dto.BoardDto;
import com.bh.jdbc.mapper.BoardMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardRepositoryTest {
    private BoardMapper mapper;

    String writer = "Shaq";
    String title = "NBA is my life";
    String content = "What can you say I'm the best";

    @Test
    void findAll() {
        //given
       /* BoardDto boardDto = BoardDto.builder()
                .writer(writer)
                .title(title)
                .content(content)
                .build();

        //when
        mapper.save(boardDto.toEntity());
        System.out.println("TEST1::" + boardDto.getWriter());*/
        //List<Board> list = mapper.findAll();
        //then
    }

    @Test
    void findById() {
    }
}