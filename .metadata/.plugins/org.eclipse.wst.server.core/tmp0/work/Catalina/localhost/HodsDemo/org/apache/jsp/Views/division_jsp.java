/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.35
 * Generated at: 2017-11-01 06:58:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class division_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"panelcustcss panel panel-primary\">\n");
      out.write("    <div class=\"panel-heading\">\n");
      out.write("        SMF Panel\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"panel-body\">\n");
      out.write("        <div ng-contoller=\"subCtrl\">\n");
      out.write("            <div>\n");
      out.write("                <table class=\"table table-responsive table-hover table-bordered\"\n");
      out.write("                       style=\"font-size: 12px\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr class=\"info\">\n");
      out.write("                            <th>Test Plan</th>\n");
      out.write("                            <th>Scheduled Start Date</th>\n");
      out.write("                            <th>Scheduled End Date</th>\n");
      out.write("                            <th>Status</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Default</td>\n");
      out.write("                            <td>04.10.2017</td>\n");
      out.write("                            <td>10.08.2017</td>\n");
      out.write("                            <td>Pending</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Default</td>\n");
      out.write("                            <td>04.10.2017</td>\n");
      out.write("                            <td>10.08.2017</td>\n");
      out.write("                            <td>Complete</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Default</td>\n");
      out.write("                            <td>04.10.2017</td>\n");
      out.write("                            <td>10.08.2017</td>\n");
      out.write("                            <td>Complete</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Default</td>\n");
      out.write("                            <td>04.10.2017</td>\n");
      out.write("                            <td>10.08.2017</td>\n");
      out.write("                            <td>Complete</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Default</td>\n");
      out.write("                            <td>04.10.2017</td>\n");
      out.write("                            <td>10.08.2017</td>\n");
      out.write("                            <td>Pending</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Default</td>\n");
      out.write("                            <td>04.10.2017</td>\n");
      out.write("                            <td>10.08.2017</td>\n");
      out.write("                            <td>Pending</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Default</td>\n");
      out.write("                            <td>04.10.2017</td>\n");
      out.write("                            <td>10.08.2017</td>\n");
      out.write("                            <td>Pending</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Default</td>\n");
      out.write("                            <td>04.10.2017</td>\n");
      out.write("                            <td>10.08.2017</td>\n");
      out.write("                            <td>Pending</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Default</td>\n");
      out.write("                            <td>31.08.2017</td>\n");
      out.write("                            <td>31.08.2017</td>\n");
      out.write("                            <td>Complete</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Default</td>\n");
      out.write("                            <td>31.08.2017</td>\n");
      out.write("                            <td>31.08.2017</td>\n");
      out.write("                            <td>Complete</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Default</td>\n");
      out.write("                            <td>31.08.2017</td>\n");
      out.write("                            <td>31.08.2017</td>\n");
      out.write("                            <td>Complete</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Default</td>\n");
      out.write("                            <td>31.08.2017</td>\n");
      out.write("                            <td>31.08.2017</td>\n");
      out.write("                            <td>Complete</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Default</td>\n");
      out.write("                            <td>31.08.2017</td>\n");
      out.write("                            <td>31.08.2017</td>\n");
      out.write("                            <td>Complete</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Default</td>\n");
      out.write("                            <td>31.08.2017</td>\n");
      out.write("                            <td>31.08.2017</td>\n");
      out.write("                            <td>Complete</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Default</td>\n");
      out.write("                            <td>31.08.2017</td>\n");
      out.write("                            <td>31.08.2017</td>\n");
      out.write("                            <td>Complete</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Default</td>\n");
      out.write("                            <td>31.08.2017</td>\n");
      out.write("                            <td>31.08.2017</td>\n");
      out.write("                            <td>Complete</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
