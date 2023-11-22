package com.study.jpa.chap05_practice.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class postModifyDTO {

    @NotBlank
    @Size(min = 1, max = 20)
    private String title;

    private String content;

    @NotNull // 공백이나 빈 문자열 들어올 수 없는 타입은 NotNull로 선언.
    @Builder.Default // NoArgsConstructor로 인해 null이 들어올 수 있는 가능성 방지.
    private Long postNo = 0L;



}
