package api;

import model.User;
import model.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf8");
        resp.setCharacterEncoding("utf8");
        resp.setContentType("text/html;charset=UTF-8");

        String username=req.getParameter("username");
        String password=req.getParameter("password");
        String authority=req.getParameter("authority");

        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAuthority(authority);

        //打印查看
        System.out.println("{username:"+username);
        System.out.println("password:"+password);
        System.out.println("authority:"+authority+"}");

        UserDAO userDAO=new UserDAO();
        userDAO.save_userInfo(user);

        resp.sendRedirect("http://127.0.0.1:8080/MeetingRoomReservationSystem/fronter/html/login.html");


    }
}
