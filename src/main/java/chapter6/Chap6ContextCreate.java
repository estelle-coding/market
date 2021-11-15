package chapter6;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap6/context/create")
public class Chap6ContextCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Chap6ContextCreate() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		ServletContext context = getServletContext();
		
		ShareObject so = new ShareObject();
		so.setCount(so.getCount() + 1);
		so.setStr(id + "의 객체");
		
		context.setAttribute(id, so);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
