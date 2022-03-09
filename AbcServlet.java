package pl.nazwa.rejestracja.trzy;

        import java.io.IOException;

        import jakarta.servlet.ServletException;
        import jakarta.servlet.annotation.WebServlet;
        import jakarta.servlet.http.HttpServlet;
        import jakarta.servlet.http.HttpServletRequest;
        import jakarta.servlet.http.HttpServletResponse;

        import pl.nazwa.rejestracja.jeden.Abc;
        import pl.nazwa.rejestracja.dwa.AbcdE;

/**
 * @email Ramesh Fadatare
 */

@WebServlet("/register")
public class AbcServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private AbcdE abcdE;

    private AbcdE asbcdE = new AbcdE();
    public void init() {
       abcdE = new AbcdE();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());

        RequestDispatcher dispatcher = request.getRequestDispatcher("/rejestracja.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");

        Abc abc = new Abc();
        abc.setFirstName(firstName);
        abc.setLastName(lastName);
        abc.setUsername(username);
        abc.setPassword(password);
        abc.setContact(contact);
        abc.setAddress(address);

        try {
            abcdE.registerAbc(abc);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("rejestracja.jsp");
    }
}