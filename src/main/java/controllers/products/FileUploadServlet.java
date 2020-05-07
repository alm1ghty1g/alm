//package controllers.products;
//
//import org.apache.commons.fileupload.*;
//import org.apache.commons.fileupload.disk.DiskFileItemFactory;
//import org.apache.commons.fileupload.servlet.ServletFileUpload;
//import org.apache.log4j.Logger;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.File;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.time.LocalDateTime;
//import java.util.List;
//
//@WebServlet(urlPatterns = {"/upload"})
//
//public class FileUploadServlet extends HttpServlet {
//
//    final static Logger logger = Logger.getLogger(FileUploadServlet.class);
//
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        PrintWriter out = resp.getWriter();
//        String path = System.getProperty("catalina.base")
//                + "/webapps/ROOT/images/";
//
//        ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
//        try {
//            List<FileItem> multifiles = sf.parseRequest(req);
//
//
//
//
//            System.out.println(LocalDateTime.now() + " #### " +path);
//
//            logger.info(LocalDateTime.now() + " #### " +path);
//
//            for (FileItem item : multifiles) {
//                try {
//                    item.write(new File(path + item.getName()));
//
//
////String tomcatBase = System.getProperty("catalina.base");
//
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        } catch (FileUploadException e) {
//            e.printStackTrace();
//        }
//
//        out.println("file uploaded add" + path);
//
//
//    }
//}
