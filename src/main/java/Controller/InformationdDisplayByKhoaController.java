package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import DAO.GiangVienDAO;
import DAO.InformationdDisplayByKhoaDAO;
import DAO.SinhVienDAO;
import MODEL.InformationdDisplayByKhoaModel;
import MODEL.KhoaModel;

/**
 * Servlet implementation class InformationdDisplayByKhoaController
 */
@WebServlet("/informationdDisplay")
public class InformationdDisplayByKhoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InformationdDisplayByKhoaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InformationdDisplayByKhoaDAO dao = new InformationdDisplayByKhoaDAO();
        List<KhoaModel> list = dao.getAllIDByKhoa();
        request.setAttribute("LIST_INFO", list);
        request.getRequestDispatcher("khoa.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String masv  = request.getParameter("masv");
		String makhoa = request.getParameter("makhoa");
//		long MASV = Long.parseLong(masv);
//		long MAKHOA = Long.parseLong(makhoa);
		SinhVienDAO svdao = new SinhVienDAO();
		svdao.getDataMigration(masv, makhoa);
		
		String magv = request.getParameter("magv");
//		String makhoagv = request.getParameter("makhoagv");
		GiangVienDAO dao = new GiangVienDAO();
		dao.getDataMigration(magv, makhoa);
		response.sendRedirect("informationdDisplay");
	}

}
