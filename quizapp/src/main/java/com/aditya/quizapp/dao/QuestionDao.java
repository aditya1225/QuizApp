package com.aditya.quizapp.dao;

import com.aditya.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
        List<Question> findByCategory(String category);

        @Query(value = "Select * from Question q where q.category=:category order by RANDOM() LIMIT :numQ",nativeQuery = true)
        List<Question> findRandomQuestionsByCategory(String category, int numQ);

        //public List<Question> getAllQuestions() {
      //  return
    //}
}
