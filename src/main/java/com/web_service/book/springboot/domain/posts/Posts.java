package com.web_service.book.springboot.domain.posts;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Getter
//클래스 내 모든 필드의 Getter 메소드를 자동생성
@NoArgsConstructor
//기본생성자자동추가
@Entity
//테이블과 링크될 클래스임을 나타낸다.
public class Posts {
    @Id
    //해당 테이블의 PK필드를 나타낸다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //PK의 생성규칙을 나타낸다.
    //strategy = GenerationType.IDENTITY 스프링부트 2.0에서는 이 옵션을 추가해야만
    //autoincrement가 된다.
    private Long id;
    //왠만하면, Entity의 PK는 long타입의 Autoincrment를 추천
    //91페이지 참고

    @Column(length = 500, nullable = false)
    //테이블의 컬럼의 나타내며 굳이 선언하지 않더라도 해당클래스의 필드는 모두 칼럼이 된다.
    //사용하는 이유는 기본값외에 추가로 변경이 필요한 옵션이 있으면 사용한다.
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    //해당클래스의 빌더 패턴 클래스를 생성
    //생성자 상단에 선언시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author =  author;
    }
}
