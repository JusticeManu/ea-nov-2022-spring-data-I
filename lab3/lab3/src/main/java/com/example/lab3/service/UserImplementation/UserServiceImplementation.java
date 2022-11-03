package com.example.lab3.service.UserImplementation;

import com.example.lab3.entity.User;
import com.example.lab3.repository.UserRepository;
import com.example.lab3.service.UserServiceInterface;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImplementation implements UserServiceInterface {

    private final UserRepository userRepository;

    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void saveUser(User user) {

        this.userRepository.save(user);
    }

    @Override
    public Optional<User> getUser(Integer id) {
        return this.userRepository.findById(id);
    }

    @Override
    public User editUserById(Integer id,User user) {
//        User userFromDb = userRepository.findById(u.getid());
//        // crush the variables of the object found
//        userFromDb.setEmail(user.getEmail());
//        userFromDb.setLastname("dew");
//        userFromDb.setAge(16);
//        userRepository.save(userFromDb);
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
