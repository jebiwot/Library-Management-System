import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class PaymentInfo extends HttpServlet{
    @EJB
    UserI userI;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if (session.getAttribute("sName") != null) {
            User user = new User();
            user.setNatId(req.getParameter("natId"));
            User u = userI.search(user);

       }
        else{
                resp.sendRedirect("LoginLibrarian.jsp");
            }
        }
    }

