package ua.kiev.prog;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class LoginServlet  extends HttpServlet {
    static final String TEMPLATE = "<html>" +
            "<head><title>Prog.kiev.ua</title></head>" +
            "<body><h1>%s</h1></body></html>";


    static final Map<String, String> map = new HashMap<String, String>();

    static {//login
        map.put("oiuy", " oiuy");//login
        map.put("uhyf ", "uyag");//login
        final String put = map.put("1234", "90876");//password

    }

    public void doPost(HttpServletRequest req, HttpServletResponse res, String password) {
        String login = req.getParameter("login");
        String pass = req.getParameter("password");
        String ss = map.get(login);
        if (login.equals(ss))
           System.out.println("Yes");
        else
           System.out.println("No ");


        String pp = map.get(password);
        if (pass.equals(ss))
            System.out.println("Yes");
        else
            System.out.println("No ");


    }


}