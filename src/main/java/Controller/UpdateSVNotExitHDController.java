package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import DAO.HuongDanDAO;

/**
 * Servlet implementation class UpdateSVNotExitHDController
 */
public class UpdateSVNotExitHDController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateSVNotExitHDController() {
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
		// TODO Auto-generated method stub
		String masv = request.getParameter("masv");
		String madt = request.getParameter("madt");
		long MASV = Long.parseLong(masv);
		long MADT = Long.parseLong(madt);
		String magv = request.getParameter("magv");
		long MAGV = Long.parseLong(magv);
		String diem = request.getParameter("ketqua");
		double ketqua = Double.parseDouble(diem);
		
		HuongDanDAO dao = new HuongDanDAO();
		dao.UpdateHD(MAGV, MASV, MADT, ketqua);
		response.sendRedirect("huongdan");
	}

}
