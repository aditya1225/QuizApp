package com.aditya.quizapp.dao;

import com.aditya.quizapp.model.Quiz;
//import com.aditya.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {

    //void save(List<Question>);


}
