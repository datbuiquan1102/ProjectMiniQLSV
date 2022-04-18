package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
		LoginModel login = new LoginDao().CheckLogin(username);
		if(login == null) {
			if(password.equals(password2)) {
				LoginDao dao = new LoginDao();
				dao.getDangky(fullname, email, numberphone, username, password2);
				request.setAttribute("mess", "Đăng Kí Thành Công");	
				request.getRequestDispatcher("dangky").forward(request, response);
			}
			else {
				request.setAttribute("pass", "Nhập Mật Khẩu Không Đúng");
			}
		}
		else {
			request.setAttribute("uname", "Tài Khoản Đã Đã Tồn Tại");
		}
	}

}
