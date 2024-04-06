package com.learning.fras.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {
    private Long id;
    private Integer age;
    private String name;

    //    public static BoardDTO toDTO(Board entity) {
//        return BoardDTO.builder()
//                .id(entity.getId())
//                .age(entity.getAge())
//                .name(entity.getName())
//                .build();
//    }

}
