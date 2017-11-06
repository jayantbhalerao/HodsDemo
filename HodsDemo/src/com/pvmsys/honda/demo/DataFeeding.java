package com.pvmsys.honda.demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class DataFeeding
 */
@WebServlet("/DataFeeding")
public class DataFeeding extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataFeeding() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		JSONArray array = new JSONArray();
		PrintWriter responseWriter = response.getWriter();
		TreeBean bean = null;
		
		if(request.getParameter("parent") == null)
		{
			System.out.println("called data load for India");		
			for(int i =0;i<10;i++){
              bean = new TreeBean();
              bean.setId("Node_"+i);
              bean.setValue("#P60411110088"+i);
              bean.setLink("div");
              bean.setWebix_kids(true);
              array.add(bean);
			}
		}
		else
		{
			System.out.println("The Node Name is "+request.getParameter("parent"));
			if(request.getParameter("parent").equals("Node_0")){
			for(int i =0;i<4;i++){
	              bean = new TreeBean();
	              bean.setId("Node_0_"+i);
	              bean.setValue("#Q047799000"+i);
	              bean.setLink("add");
	              bean.setWebix_kids(true);
	              array.add(bean);
				}
			}
			if(request.getParameter("parent").equals("Node_0_0")){
				for(int i =0;i<4;i++){
		              bean = new TreeBean();
		              bean.setId("Node_0_0_"+i);
		              bean.setValue("#R041199000"+i);
		              bean.setLink("sub");
		              bean.setWebix_kids(true);
		              array.add(bean);
					}
				}
			if(request.getParameter("parent").equals("Node_0_0_0")){
				for(int i =0;i<4;i++){
		              bean = new TreeBean();
		              bean.setId("Node_0_0_0_"+i);
		              bean.setValue("#S6041111900"+i);
		              bean.setLink("multi");
		              bean.setWebix_kids(true);
		              array.add(bean);
					}
				}
		}
		JSONObject jsonData = new JSONObject();
		jsonData.put("data", array);
		jsonData.put("parent", request.getParameter("parent"));
		responseWriter.println(jsonData.toString());
		responseWriter.close();
	}

}
