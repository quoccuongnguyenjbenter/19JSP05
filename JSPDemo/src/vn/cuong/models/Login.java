package vn.cuong.models;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public Login() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
	public Login() {
    }
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
//        ServletOutputStream out = response.getOutputStream();
 
        // Lấy ra đối tượng HttpSession
//        HttpSession session = request.getSession();
 
        // Giả sử người dùng đã login thành công.
//        UserInfo loginedInfo = new UserInfo("Tom", "USA", 5);
//        UserInfo loginedInfo=new UserInfo("Tom","USA",5);
 
        // Lưu trữ thông tin người dùng vào 1 thuộc tính (attribute) của Session.
//        session.setAttribute("Tom infor", loginedInfo);
// 
//        out.println("<html>");
//        out.println("<head><title>Session example</title></head>");
// 
//        out.println("<body>");
//        out.println("<h3>You are logined!, info stored in session</h3>");
// 
//        out.println("<a href='userInfo'>View User Info</a>");
//        out.println("</body>");
//        out.println("<html>");
    	 RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("index.jsp");
    	 dispatcher.forward(request, response);
    }
}
