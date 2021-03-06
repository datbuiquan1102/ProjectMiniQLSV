package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import DAO.DeTaiDAO;
import DAO.GiangVienDAO;
import DAO.HuongDanDAO;
import MODEL.DeTaiModel;
import MODEL.GiangVienModel;
import MODEL.HuongDanModel;

/**
 * Servlet implementation class SVNotExistsInDTController
 */
@WebServlet("/svnotexistsindt")
public class SVNotExistsInDTController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SVNotExistsInDTController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HuongDanDAO dao = new HuongDanDAO();
		List<HuongDanModel> list = dao.getSVNotExistHD();
		request.setAttribute("LIST_SVNOTEXIST", list);
		List<GiangVienModel> listgv = new GiangVienDAO().getGVDAO();
		request.setAttribute("LIST_GIANGVIEN", listgv);
		List<DeTaiModel> listdt = new DeTaiDAO().getDTDAO();
		request.setAttribute("LIST_DETAI", listdt);
		request.getRequestDispatcher("huongdan2.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String masv = request.getParameter("masv");
		String madt = request.getParameter("madt");
		String magv = request.getParameter("magv");
		long MASV = Long.parseLong(masv);
		long MADT = Long.parseLong(madt);
		long MAGV = Long.parseLong(magv);
		String ket = request.getParameter("ketqua");
		double ketqua = Double.parseDouble(ket);
		HuongDanDAO dao = new HuongDanDAO();
		dao.getUpdateDTbySV(MASV, MADT, MAGV, ketqua);
		response.sendRedirect("huongdan");
		
		
		
	}

}
