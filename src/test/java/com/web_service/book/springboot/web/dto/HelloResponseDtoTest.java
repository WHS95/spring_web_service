package com.web_service.book.springboot.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class HelloResponseDtoTest {
    @Test
    public void 롬복_기능_테스트(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);


        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
        //위와 같은 assertThat을 만들고싶다면 Assertions을 먼저 불러온후
        // 완성후 option enter단축키를 이용하여 바꾼다.

        //assertThat??
        //assertj라는 테스트 검증 라이브러리의 검증 메소드이다.
        //검증하고 싶은 대상을 메소드 인자로 받는다.
        //메소드 체이닝이 지원되어 isEqualTo와 같이 메소드를 이어서 사용하 수있다.

        //isEqualTo??
        //assertj와 동등 비교 메소드이다.
        //assertThat에 있는 값과 isEqualTo의 값을 비교해서 같을때만 성공입니다.



    }

}