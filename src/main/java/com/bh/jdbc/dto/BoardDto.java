package com.bh.jdbc.dto;

import com.bh.jdbc.domain.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class BoardDto {
    private Long board_id;
    private String writer;
    private String title;
    private String content;
    private LocalDate createDate;

    public Board toEntity(){
        Board build = Board.builder()
                .writer(writer)
                .title(title)
                .content(content)
                .build();
        return build;
    }

    @Builder
    public BoardDto(Long board_id, String writer, String title, String content, LocalDate createDate) {
        this.board_id = board_id;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.createDate = createDate;
    }
}
