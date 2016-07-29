package app;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "UserServlet",
        urlPatterns = {"/user"}
)
public class UserServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/user.jsp");
        String action = request.getParameter("action");
        if (action.equals("remove")) {
            removeUser(request, response);
        } else {
            if (action.equals("edit")) {
                long id = Long.valueOf(request.getParameter("id"));
                if (id != 0L) {
                    UserDAO userDAO = new UserDAO();
                    User user = userDAO.getUser(id);
                    request.setAttribute("user", user);
                }
            }
            dispatcher.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action.equals("add")) {
            addUser(request, response);
        } else {
            editUser(request, response);
        }
    }

    private void addUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setUserName(userName);
        user.setPassword(password);

        UserDAO userDAO = new UserDAO();
        userDAO.addUser(user);

        response.sendRedirect("/user-list");
    }

    private void editUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        long id = Long.valueOf(request.getParameter("id"));

        UserDAO userDAO = new UserDAO();
        User user = userDAO.getUser(id);

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setUserName(userName);
        user.setPassword(password);

        userDAO.updateUser(user);

        response.sendRedirect("/user-list");
    }

    private void removeUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        long id = Long.valueOf(request.getParameter("id"));

        UserDAO userDAO = new UserDAO();
        userDAO.removeUser(id);

        response.sendRedirect("/user-list");
    }
}
