package com.bh.jdbc.mapper;

import com.bh.jdbc.domain.Board;
import com.bh.jdbc.dto.BoardDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BoardMapper {

    @Select("SELECT * FROM BOARD")
    List<Board> findAll();

    @Select("SELECT * FROM BOARD WHERE board_id=#{board_id}")
    Board findById(@Param("board_id") Long board_id);

    @Insert("INSERT INTO BOARD(writer, title, content) VALUES (#{writer}, #{title}, #{content})")
    void save(Board board);
}
