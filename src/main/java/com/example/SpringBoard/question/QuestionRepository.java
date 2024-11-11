package com.example.SpringBoard.question;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject);

    Question findBySubjectAndContent(String subject, String content);

    List<Question> findBySubjectLike(String subject);

    // 페이징 구현용
    Page<Question> findAll(Pageable pageable);

    // 검색용
    Page<Question> findAll(Specification<Question> spec, Pageable pageable);
}
