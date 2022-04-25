package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

import DAO.KhoaDAO;
import DAO.SinhVienDAO;
import MODEL.KhoaModel;

/**
 * Servlet implementation class AddSVController
 */
@WebServlet("/addsv")
public class AddSVController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSVController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<KhoaModel> listk = new KhoaDAO().getKhoaDAO();
		request.setAttribute("List_K", listk);
		request.getRequestDispatcher("addsinhvien.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String i = request.getParameter("makhoa");
		long makhoa = Long.parseLong(i);
		String hotensv = request.getParameter("hoten");
		String n = request.getParameter("namsinh");
		String quequan = request.getParameter("quequan");
		try {
			Date namsinh = Date.valueOf(n);
			SinhVienDAO dao = new SinhVienDAO();
			dao.getAddSV(hotensv, makhoa, namsinh, quequan);
			response.sendRedirect("sinhvien");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
