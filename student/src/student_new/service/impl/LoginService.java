package service.impl;

import model.User;
import view.LoginView;

public class LoginService {
    private String userName;
    private String password;

    public LoginService(String userName, String password) {
        System.out.println(userName);
        System.out.println(password);
//        this.userName = userName;
//        this.password = password;
    }

    public User getUser() {
        return new User(userName, password);
    }

    @Override
    public String toString() {
        return "user " + userName + "pass: " + password;
    }
}
