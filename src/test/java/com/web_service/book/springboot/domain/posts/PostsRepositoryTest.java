package com.web_service.book.springboot.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired // 의존객체자동주입
    PostsRepository postsRepository;

    @After
    //Junit에서 단위테스트가 끝날때마다 수행되는 메소드를 지정
    //보통은 배포전 전체 테스트를 수행할 때 테슽간 데이터 침범을 막기 위해 사용
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기() {
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        //테이블 posts에 insert/update
        //id값이 있다면 update가, 없다면 insert쿼리가 실행된다.
        postsRepository.save(Posts.builder().title(title)
                .content(content)
                .author("tjrdlf08@gmail.com")
                .build());

        //when
        //테이블 posts에 있는 모든 데이터를 조회해오는 메소드이다.
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }

}