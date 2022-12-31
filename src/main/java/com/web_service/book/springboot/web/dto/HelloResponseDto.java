package com.web_service.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
//선언된 모든 핅드의 get 메소드를 생성해준다.
@RequiredArgsConstructor
//선성된 모등 final 필들가 포함된 생성자를 생성해준다.
//final이 없는 필드는 생성자에 포함 되지 않는다.
public class HelloResponseDto {
    private final String name;
    private final int amount;

}
