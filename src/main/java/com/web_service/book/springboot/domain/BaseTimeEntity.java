package com.web_service.book.springboot.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass//JPA Entity 클래스들이 BaseTimeEntity을 상속할 경우 필드들(createdDate,modifiedDate)도 칼럼으로 인식하도록 합니다.
@EntityListeners(AuditingEntityListener.class)//BaseTimeEntity클래스에 Auditing기능을 포함시킵니다.
public abstract class BaseTimeEntity {
    @CreatedDate//Entity가 생성되어 저장될때 시간이 자동 저장됩니다.
    private LocalDate createdDate;

    @LastModifiedDate//조회한 Entity의 값이 변경할때 자동으로 시간을 저장합니다.
    private LocalDateTime modifiedDate;
}
