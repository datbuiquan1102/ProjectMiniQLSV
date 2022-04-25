package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import DAO.GiangVienDAO;
import DAO.KhoaDAO;
import MODEL.GiangVienModel;
import MODEL.KhoaModel;

/**
 * Servlet implementation class AddGiangVien
 */
@WebServlet("/addgv")
public class AddGiangVien extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddGiangVien() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<KhoaModel> list = new KhoaDAO().getKhoaDAO();
		request.setAttribute("List_GV", list);
		request.getRequestDispatcher("addgiangvien.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mak = request.getParameter("makhoa");
		long makhoa = Long.parseLong(mak);
		String hoten = request.getParameter("hoten");
		String l = request.getParameter("luong");
		double luong = Double.parseDouble(l);
		GiangVienDAO dao = new GiangVienDAO();
		dao.getAdd(hoten, luong, makhoa);
		response.sendRedirect("giangvien");
	}

}
