package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import DAO.GiangVienDAO;
import MODEL.GiangVienModel;

/**
 * Servlet implementation class UpdateGVController
 */
@WebServlet("/updategv")
public class UpdateGVController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateGVController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("abc");
		GiangVienDAO dao = new GiangVienDAO();
		GiangVienModel gv = dao.getGVbyID(id);
		request.setAttribute("gv", gv);
		request.getRequestDispatcher("sinhvien.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GiangVienDAO dao = new GiangVienDAO();
		String id = request.getParameter("magv");
		int magv = Integer.parseInt(id);
		String hoten = request.getParameter("hoten");
		String l = request.getParameter("luong");
		double luong = Double.parseDouble(l);
		dao.UpdateGV(hoten, luong, magv);
		response.sendRedirect("giangvien");
		
	}

}
