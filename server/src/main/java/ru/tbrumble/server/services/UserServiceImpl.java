package ru.tbrumble.server.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import ru.tbrumble.restapi.Model.User;
import ru.tbrumble.server.dao.UserDao;
import ru.tbrumble.restapi.service.user.UserService;

import java.util.List;

@AllArgsConstructor
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
