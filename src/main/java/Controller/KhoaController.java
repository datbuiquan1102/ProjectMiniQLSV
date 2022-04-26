package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import DAO.GiangVienDAO;
import DAO.KhoaDAO;
import MODEL.GiangVienModel;
import MODEL.KhoaModel;

/**
 * Servlet implementation class KhoaController
 */
@WebServlet("/khoa")
public class KhoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KhoaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		KhoaDAO dao = new KhoaDAO();
		KhoaModel khoa = new KhoaModel();
		HttpSession ss = request.getSession();
		List<KhoaModel> listKhoa = dao.getKhoaDAO();
		ss.setAttribute("KHOA_LIST", listKhoa);
		
		String makhoa = request.getParameter("makhoa");
		List<GiangVienModel> listGv = dao.getGVbyIDKhoa(makhoa);
		ss.setAttribute("GV_LIST", listGv);
		
		request.getRequestDispatcher("khoa.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
