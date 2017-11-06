package WebixPOC;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TreeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println(req.getParameter("parent"));
		PrintWriter responseWriter = resp.getWriter();
		//JSONObject jsonObject = new JSONObject();
		JSONArray array = new JSONArray();
		TreeBean bean = null;
		//List<TreeBean> beans = new ArrayList<TreeBean>();
		if(req.getParameter("parent") == null){
			for(int i=0;i<10;i++){
				bean = new TreeBean();
				bean.setId("Project_" + i);     
				bean.setValue("Project"+i);
				bean.setWebix_kids(true);
				bean.setLink("home");
				array.add(bean);
			}
			
		}
		else if(req.getParameter("parent").equals("Project_0")){
			for(int i=0;i<10;i++){
				bean = new TreeBean();
				bean.setId("Project_0_" + i);
				bean.setValue("Project0"+i);
				bean.setWebix_kids(true);
				bean.setLink("about");
				array.add(bean);
			}
		}
		JSONObject jsonData = new JSONObject();
		jsonData.put("data", array);
		jsonData.put("parent", req.getParameter("parent"));
		responseWriter.println(jsonData.toString());
		responseWriter.close();
	}
}
