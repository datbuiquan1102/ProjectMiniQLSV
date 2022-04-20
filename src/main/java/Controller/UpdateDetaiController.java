package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.DataOutput;
import java.io.IOException;

import DAO.DeTaiDAO;
import MODEL.DeTaiModel;

/**
 * Servlet implementation class UpdateDetaiController
 */
@WebServlet("/updatedetai")
public class UpdateDetaiController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDetaiController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DeTaiDAO dao = new DeTaiDAO();
		String id = request.getParameter("dtid");
		DeTaiModel dt = dao.getDetaiByID(id);
		request.setAttribute("dt", dt);
		request.getRequestDispatcher("detai.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("madt");
		int madt = Integer.parseInt(id);
		
		String tendt = request.getParameter("tendt");
		
		String i = request.getParameter("kinhphi");
		double kinhphi = Double.parseDouble(i);
		
		String noithuctap = request.getParameter("noithuctap");
		
		DeTaiDAO dao = new DeTaiDAO();
		dao.UpdateDeTai(madt, tendt, kinhphi, noithuctap);
		response.sendRedirect("detai");
	}

}
