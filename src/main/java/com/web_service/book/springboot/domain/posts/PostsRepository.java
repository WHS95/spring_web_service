package com.web_service.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PostsRepository extends JpaRepository<Posts,Long> {
    void deleteByAuthorAllIgnoreCase(String author);
    @Transactional
    @Modifying
    @Query("delete from Posts p")
    int deleteFirstByAllIgnoreCase();

}
