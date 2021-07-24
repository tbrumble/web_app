package ru.tbrumble.restapi.service.user;


import ru.tbrumble.restapi.Model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
}
