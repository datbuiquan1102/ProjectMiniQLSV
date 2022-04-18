package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import DAO.SinhVienDAO;
import MODEL.SinhVienModel;

/**
 * Servlet implementation class UpdateSVController
 */
@WebServlet("/update")
public class UpdateSVController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateSVController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String masv = request.getParameter("uid");
		SinhVienDAO dao = new SinhVienDAO();
		SinhVienModel a = new SinhVienModel();
		a = dao.getUpdateSV(masv);
		request.setAttribute("sv", a);
		request.getRequestDispatcher("sinhvien.jsp").forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String i = request.getParameter("masv");
		long masv = Long.parseLong(i);
		String hotensv = request.getParameter("hoten");
		String n = request.getParameter("namsinh");
		String quequan = request.getParameter("quequan");
		try {
			Date namsinh = Date.valueOf(n);
			SinhVienDAO dao = new SinhVienDAO();
			dao.UpdateSV(masv, hotensv, namsinh, quequan);
			response.sendRedirect("sinhvien");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
