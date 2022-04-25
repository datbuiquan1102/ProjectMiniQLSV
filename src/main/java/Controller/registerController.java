package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import DAO.LoginDao;
import MODEL.LoginModel;

/**
 * Servlet implementation class registerController
 */
@WebServlet("/register")
public class registerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerController() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("register.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullname = request.getParameter("fullname");
		String email = request.getParameter("email");
		String sdt = request.getParameter("sdt");
		int numberphone = Integer.parseInt(sdt);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");
		LoginModel model = new LoginModel(fullname, email, numberphone, username, password2);
		System.out.println("a");
		List<LoginModel> list = new ArrayList<LoginModel>();
		System.out.println("b");
		for (LoginModel login : list) {
			System.out.println("c");
			if(login.getUsername() != null) {
				if(password.equals(password2)) {
					LoginDao dao =new LoginDao();
					dao.getDangky(fullname, email, numberphone, username, password2);
					request.setAttribute("mess", "Đăng Kí Thành Công");	
					response.sendRedirect("login");
				}
			}
		}
	}

}
