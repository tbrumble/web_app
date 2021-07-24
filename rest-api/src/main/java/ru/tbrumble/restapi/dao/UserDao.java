package ru.tbrumble.restapi.dao;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.tbrumble.restapi.Model.User;
import ru.tbrumble.restapi.repository.user.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDao {
    UserRepository userRepository;

    public List<User> getUsers() {

        List<User> users = new ArrayList<>();
        ModelMapper modelMapper = new ModelMapper();
        userRepository.findAll().forEach(
                userEntity -> users.add(
                        modelMapper.map(userEntity, User.class)
                )
        );
        return users;
    }
}
