package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import DAO.GiangVienDAO;
import DAO.HuongDanDAO;
import MODEL.HuongDanModel;

/**
 * Servlet implementation class UpdateHDController
 */
@WebServlet("/updateHD")
public class UpdateHDController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateHDController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HuongDanDAO dao = new HuongDanDAO();
		String id = request.getParameter("madt");
		HuongDanModel hd = dao.getHuongDanByID(id);
		request.setAttribute("hd1", hd);
		request.getRequestDispatcher("huongdan.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gv = request.getParameter("magv");
		long magv = Long.parseLong(gv);
		
		String sv = request.getParameter("masv");
		long masv = Long.parseLong(sv);
		
		String dt = request.getParameter("madt");
		long madt = Long.parseLong(dt);
		
		String kq = request.getParameter("ketqua");
		double ketqua = Double.parseDouble(kq);
		
		HuongDanDAO dao = new HuongDanDAO();
		dao.UpdateHD(magv, masv, madt, ketqua);
		response.sendRedirect("huongdan");
	}

}
