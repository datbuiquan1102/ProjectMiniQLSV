package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import DAO.InformationdDisplayByKhoaDAO;
import MODEL.InformationdDisplayByKhoaModel;

/**
 * Servlet implementation class InformationdDisplayByKhoaController
 */
@WebServlet("/informationdDisplay")
public class InformationdDisplayByKhoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InformationdDisplayByKhoaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InformationdDisplayByKhoaDAO dao = new InformationdDisplayByKhoaDAO();
        List<InformationdDisplayByKhoaModel> list = dao.getAllIDByKhoa();
        request.setAttribute("LIST_INFO", list);
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
