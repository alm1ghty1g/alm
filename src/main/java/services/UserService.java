package services;

import dao.Dao;
import dao.UserDao;
import entities.User;
import java.util.*;

public class UserService {


    private Dao<User, String> dao = new UserDao();

    public String createUser(String login, String password, String passwordc, String email) {

        if (!(password.equals(passwordc))) {
            return "password doesnt match";
        }
        User user = new User(0, login, password, email);
        try {
            user = dao.create(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (user.getUser_id() != 0) {
            return "user created";
        }

        return "problem";
    }

    public List<User> signIn(String login, String password) {

        List<User> users = new ArrayList<>();

        if (login.isEmpty() || password.isEmpty()) {
            return null;
        }

        User user = (User) dao.findByKeyL(login);
        users.add(user);


        if (password.equals(user.getPassword())) {
            return users;

        } else return null;
    }
}




