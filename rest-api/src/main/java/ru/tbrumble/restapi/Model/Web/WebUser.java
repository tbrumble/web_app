package ru.tbrumble.restapi.Model.Web;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Модель User пользователя системы", description = "Web модель пользователя системы для передачи по rest-ам")
public class WebUser {
    @ApiModelProperty(value = "Имя", dataType = "string", name = "firstName")
    private String firstName;
    @ApiModelProperty(value = "Фамилия", dataType = "string", name = "lastName")
    private String lastName;
    @ApiModelProperty(value = "Пароль пользователя", dataType = "string", name = "password")
    private String password;
    @ApiModelProperty(value = "Имя пользователя", dataType = "string", name = "login")
    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "{User:\\n" +
                "firstName=" + firstName +
                "lastName=" + lastName +
                "login=" + login +
                "password=" + password +
                "}";
    }
}
