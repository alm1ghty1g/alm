package controllers.users;

import services.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = {"/userSignUp"})

public class UserSignUpController extends HttpServlet {

    private UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String cssClass = "";
        String location = "";
        String message = "";

        try {

            String login = req.getParameter("login");
            String email = req.getParameter("email");

            if (login.isEmpty() || email.isEmpty()) {
                throw new Exception();
            }

            String password = req.getParameter("password");
            String passwordc = req.getParameter("passwordc");

            String result = userService.createUser(login, password, passwordc, email);

            if (result.equals("user created")) {

                cssClass = "alert-success";
                location = "/index.jsp";
                message = "user created";

            } else {

                cssClass = "alert-danger";
                location = "/signup.html";
                //      message = "incorrect input";

            }
        } catch (Exception e) {

            message = "incorrect input";
            cssClass = "alert-danger";
            location = "/signup.html";
        }

        RequestDispatcher rd = req.getRequestDispatcher(location);

        out.println("<div class=\"alert" + cssClass + "alert-dismissible fade show\" role=\"alert\">\n" +
                "  <strong>" + message + "</strong>" +
                "  <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n" +
                "    <span aria-hidden=\"true\">&times;</span>\n" +
                "  </button>\n" +
                "</div>");

        rd.include(req, resp);

    }
}
