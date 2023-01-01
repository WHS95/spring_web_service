package com.web_service.book.springboot.web;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import com.web_service.book.springboot.web.HelloController;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import java.util.regex.Matcher;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)

public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void hello가_리턴된다() throws Exception{
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }

    @Test
    public void helloDto가_리턴된다() throws Exception{
        String name = "hello";
        int amount = 1000;

        mvc.perform(get("/hello/dto")
                        .param("name", name)
                        .param("amount", String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount)));
    }
    //param
    //API 테스트를 할때 사용될 요청 파라미터를 설정한다.
    //단, 값은 Strin만 허용된다.
    //그래서 숫자/날짜 등의 데이터도 등록 할때는 문자열로 변경해야만 가능

    //jsonPath
    //JSON응답값을 필드별로 검증 할 수있느느 메소드입니다.
    //$를 기준으로 필드명을 암시한다.
    //여기서는 name과 amount를 검증하니 $name, $amount로 검증한다.


}
