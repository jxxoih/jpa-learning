package com.learning.fras.dto;

import com.learning.fras.entity.Board;
import lombok.Builder;
import lombok.Getter;

@Getter
public class BoardPostRequestDto {
    private Integer age;
    private String name;

    @Builder
    public BoardPostRequestDto(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Board toEntity() {
        return Board.builder()
                .age(age)
                .name(name)
                .build();
    }

    public BoardPostRequestDto toDto(Board board) {
        return BoardPostRequestDto.builder()
                .age(board.getAge())
                .name(board.getName())
                .build();
    }
}
