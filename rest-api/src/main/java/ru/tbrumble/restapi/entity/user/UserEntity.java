package ru.tbrumble.restapi.entity.user;

import org.springframework.data.annotation.Id;

public class UserEntity {

    @Id
    public String id;

    public String firstName;
    public String lastName;
    public String password;
    public String login;

    public UserEntity() {
    }

    public UserEntity(String firstName, String lastName, String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format(
                "UserController[id=%s, firstName='%s', lastName='%s', password='%s', login='%s']",
                id, firstName, lastName, password, login);
    }
}