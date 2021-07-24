package ru.tbrumble.restapi.service.user;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tbrumble.restapi.Model.User;
import ru.tbrumble.restapi.dao.UserDao;
import ru.tbrumble.restapi.repository.user.UserRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
