package com.netcracker.backend.repository;

import com.netcracker.backend.entity.AnswerTemplate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerTemplateRepository extends CrudRepository<AnswerTemplate, Long> {
    public List<AnswerTemplate> findAllByQuestionId(long questionId);
}
