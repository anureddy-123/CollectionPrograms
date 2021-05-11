package user;

import java.io.PrintWriter;

import demo.Person;
import demo.dao.PersonDao;

public class UserRegisterServlet<ServletConfig> extends HttpServer {
	    private static final long serialVersionUID = 1L;
	       
	   
	    PersonDao personDao;
	    public UserRegisterServlet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	    /**
	     * @see Servlet#init(ServletConfig)
	     */
	    public void init(ServletConfig config) throws ServletException {
	        personDao = new PersonDao();
	    }

	  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        response.setContentType("text/html");
	        PrintWriter pw = response.getWriter();
	        String ename = request.getParameter("ename");
	        String contactno = request.getParameter("contactno");
	        String email = request.getParameter("email");
	        String gender = request.getParameter("gender");
	        String address = request.getParameter("address");
	        Person p = new Person();
	        p.setEname(ename);
	        p.setContactno(contactno);
	        p.setEmail(email);
	        p.setGender(gender);
	        p.setAddress(address);
	        
	        if(personDao.addPerson(p)){
	            pw.println(
	                    "<h1 stye=background-color:maroon>Registration done</h1>");
	        }else
	        {
	            pw.println("<h1 stye=background-color:maroon>Try again</h1>");
	        }
	    }
	    }


