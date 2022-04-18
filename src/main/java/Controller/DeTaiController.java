package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import DAO.DeTaiDAO;

/**
 * Servlet implementation class DeTaiController
 */
@WebServlet("/detai")
public class DeTaiController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeTaiController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DeTaiDAO dao = new DeTaiDAO();
		request.setAttribute("DETAI_LIST", dao.getDTDAO());
		request.getRequestDispatcher("detai.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tendt = request.getParameter("tendt");
		String k = request.getParameter("kinhphi");
		int kinhphi = Integer.parseInt(k);
		String noithuctap = request.getParameter("noithuctap");
		DeTaiDAO dao = new DeTaiDAO();
		dao.getInsertDetai(tendt, kinhphi, noithuctap);
		response.sendRedirect("detai");
		
	}

}
