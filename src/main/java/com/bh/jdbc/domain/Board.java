package com.bh.jdbc.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board {
    private Long board_id;
    private String writer;
    private String title;
    private String content;
    private LocalDate createDate;

    @Builder
    public Board(String writer, String title, String content) {
        this.writer = writer;
        this.title = title;
        this.content = content;
    }
}
