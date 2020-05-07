package controllers.products;

import services.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = {"/add-product"})

public class AddProductController extends HttpServlet {

    ProductService productService = new ProductService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        String cssClass = "";
        String location = "";
        String message = "";

        try {
            String image = req.getParameter("image");
            String name = req.getParameter("name");

            if (image.isEmpty() || name.isEmpty()){
                throw new Exception();
            }

            double price = Double.parseDouble(req.getParameter("price"));
            int quantity = Integer.parseInt(req.getParameter("quantity"));

            String result = productService.addProduct(image, name, price, quantity);

            if (result.equals("product created")) {
                cssClass = "alert-success";
                location = "/index.jsp";
            }
            else {
                cssClass = "alert-danger";
                location = "/add-product.jsp";
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            cssClass = "alert-danger";
            message = "some values not entered";
            location = "/add-product.jsp";
        }

        RequestDispatcher rd = req.getRequestDispatcher(location);

        out.println("<div class=\"alert" + cssClass + "alert-dismissible fade show\" role=\"alert\">\n" +
                "  <strong>" + message + "</strong>" +
                "  <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n" +
                "    <span aria-hidden=\"true\">&times;</span>\n" +
                "  </button>\n" +
                "</div>");

        rd.include(req,resp);
    }
}

