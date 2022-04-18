package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import DAO.DeTaiDAO;
import DAO.HuongDanDAO;
import MODEL.DeTaiModel;
import MODEL.HuongDanModel;

/**
 * Servlet implementation class HuongDanController
 */
@WebServlet("/huongdan")
public class HuongDanController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HuongDanController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HuongDanDAO dao = new HuongDanDAO();
		List<HuongDanModel> model = dao.getAllHuongDan();
		request.setAttribute("HUONGDAN_LIST", model);
		DeTaiDAO daodt = new DeTaiDAO();
		List<DeTaiModel> list = daodt.getDTDAO();
		request.setAttribute("DT_LIST", list);
		request.getRequestDispatcher("huongdan.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
