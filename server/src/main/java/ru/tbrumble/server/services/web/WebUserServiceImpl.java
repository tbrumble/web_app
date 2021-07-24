package ru.tbrumble.server.services.web;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import ru.tbrumble.restapi.Model.Web.WebUser;
import ru.tbrumble.restapi.service.user.UserService;
import ru.tbrumble.restapi.service.user.web.WebUserService;

import java.util.ArrayList;
import java.util.List;

public class WebUserServiceImpl implements WebUserService {
    @Autowired
    UserService userService;

    @Override
    public List<WebUser> getUsers() {
        List<WebUser> users = new ArrayList<>();
        ModelMapper modelMapper = new ModelMapper();

        userService.getUsers().forEach(user -> users.add(modelMapper.map(user, WebUser.class)));
        return users;
    }
}
