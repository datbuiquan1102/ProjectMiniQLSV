package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
		KhoaModel km = new KhoaModel();
		List<KhoaModel> k = new ArrayList<KhoaModel>();
		k = dao.getKhoaDAO();
		request.setAttribute("KHOA_LIST", k);
		GiangVienDAO gvdao = new GiangVienDAO();
		List<GiangVienModel> listgv = gvdao.getGVInKhoa(km.getMakhoa());
		request.setAttribute("GVinKHOA", listgv);
		request.getRequestDispatcher("khoa.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
