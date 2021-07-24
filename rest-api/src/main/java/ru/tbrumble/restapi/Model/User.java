package ru.tbrumble.restapi.Model;

public class User {
    private String firstName;
    private String lastName;
    private String password;
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
