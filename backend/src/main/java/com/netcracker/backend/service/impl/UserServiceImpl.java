package com.netcracker.backend.service.impl;

import com.netcracker.backend.entity.AnswerSubmitted;
import com.netcracker.backend.entity.Login;
import com.netcracker.backend.entity.Quiz;
import com.netcracker.backend.entity.User;
import com.netcracker.backend.repository.LoginRepository;
import com.netcracker.backend.repository.UserRepository;
import com.netcracker.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LoginRepository loginRepository;


    @Override
    public ArrayList<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long id){
        return userRepository.findById(id);
    }

    @Override
    public User addUser (User user){
        Login login = loginRepository.save(user.getLogin());
        List<Quiz> quizList = new ArrayList<Quiz>();
        List<AnswerSubmitted> answerSubmittedList = new ArrayList<AnswerSubmitted>();
        user.setLogin(login);
        user.setQuizList(quizList);
        user.setAnswerSubmittedList(answerSubmittedList);
        return userRepository.save(user);
    }
}

