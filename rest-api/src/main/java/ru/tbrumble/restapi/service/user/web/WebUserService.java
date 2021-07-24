package ru.tbrumble.restapi.service.user.web;

import ru.tbrumble.restapi.Model.Web.WebUser;

import java.util.List;

public interface WebUserService {
    List<WebUser> getUsers();
}
