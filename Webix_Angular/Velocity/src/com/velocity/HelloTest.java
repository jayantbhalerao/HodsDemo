package com.velocity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.Template;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.context.Context;
import org.apache.velocity.tools.view.VelocityViewServlet;

public class HelloTest extends VelocityViewServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8192281270585422071L;

	@Override
	public Template handleRequest(HttpServletRequest request, HttpServletResponse response, Context context) {
		Template template = null;
		try{
			context.put("name", "Velocity Test");
			template = Velocity.getTemplate("hello.vm");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return template;

	}

}
