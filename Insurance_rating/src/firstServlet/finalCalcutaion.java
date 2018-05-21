package firstServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class finalCalcutaion
 */
public class finalCalcutaion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public finalCalcutaion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	String vehicle=request.getParameter("vehicle");
	String earlierInsurance=request.getParameter("Earlier Insurance");
	String driverClass=request.getParameter("Driver Class");
	String advSecurity=request.getParameter("Adv Security");
	String antiTheft=request.getParameter("Anti Theft");
	String violation=request.getParameter("Violation");
	String policyTerm=request.getParameter("Policy Term");
	double ratingFactor=new InsuranceDAO1().premiumCalculator(vehicle, earlierInsurance, driverClass, advSecurity, antiTheft, violation, policyTerm);
	
	}

}
