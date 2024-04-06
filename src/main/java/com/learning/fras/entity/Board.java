package com.learning.fras.entity;

import com.learning.fras.dto.BoardDTO;
import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Entity
@Getter
@Table(name = "board")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Slf4j
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // PK

    @Column (name = "age")
    private Integer age;

    @Column (name = "name")
    private String name;

    public static Board toEntity(BoardDTO dto) {
        return Board.builder()
                .id(dto.getId())
                .age(dto.getAge())
                .name(dto.getName())
                .build();
    }

}
