package sample;


 

import java.io.PrintWriter;



import demo.Person;
import demo.dao.PersonDao;

public class UserRegServlets extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
    PersonDao personDao;
    public UserRegServlets() {
        super();
        // TODO Auto-generated constructor stub
    }

 

    public void init(ServletConfig config) throws ServletException {
        PersonDao p  = new PersonDao();
    }
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        String ename = request.getParameter("name");
        String contactno = request.getParameter("contactno");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        
        Person persons = new Person();
        persons.setEname(ename);
        persons.setContactno(contactno);
        persons.setEmail(email);
        persons.setGender(gender);
        persons.setAddress(address);
        
        if(PersonDao.addPerson(persons)) {
            printWriter.println("your registration has been seccessfull");
        }
        else {
            printWriter.println("not reg successfull");
        }
        
    }

 

}