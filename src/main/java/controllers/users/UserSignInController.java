package controllers.users;

import entities.User;
import services.UserService;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/signIn"})

public class UserSignInController extends HttpServlet {

    private  UserService userService = new UserService();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        String login = req.getParameter("login");
        String password = req.getParameter("password");

       List<User> users = userService.signIn(login,password);

        if (users != null) {

            RequestDispatcher rd = req.getRequestDispatcher("/online-cabinet.jsp");

            rd.forward(req,resp);

        }

    }
}
