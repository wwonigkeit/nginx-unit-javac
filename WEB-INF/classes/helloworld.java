import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;  
import java.util.Date;

public class helloworld extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
Date date = new Date();
res.setContentType("text/html");//setting the content type  
PrintWriter pw=res.getWriter();//get the stream to write the data  
  
//writing html in the stream  
pw.println("<!DOCTYPE html>");
pw.println("<html lang=\"en\">");
pw.println("<head>");
pw.println("<meta charset=\"UTF-8\">");
pw.println("<title>Hello World</title>");
pw.println("<meta name=\"description\" content=\"Description\">");
pw.println("<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">");
pw.println("<meta http-equiv=\"refresh\" content=\"2\">");
pw.println("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">");
pw.println("<!-- Compiled and minified CSS -->");
pw.println("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css\">");
pw.println("<!-- Compiled and minified JavaScript -->");
pw.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js\"></script>");
pw.println("<style>");
pw.println("body {");
pw.println("background-color: " + System.getProperty("helloworld.colour","#FF0000") + ";");
pw.println("\"}");
pw.println("h5 {");
pw.println("color: #2396d8;");
pw.println("\"}");
pw.println("</style>");
pw.println("</head>");
pw.println("<body class=\"valign-wrapper\" style=\"height:100vh;\">");
pw.println("<div class=\"row\">");
pw.println("<div class=\"center-align\">");
//pw.println("<img src=\"data:image/png;base64," + picture + "\" alt=\"Vorteil\">");
pw.println("<img src=\"vorteil.png\" alt=\"Vorteil\">");
pw.println("<h5>WELCOME TO VORTEIL</h5>");
pw.println("</div>");
pw.println("</div>");
pw.println("<div class=\"w3-container w3-content w3-center w3-padding-64\" style=\"max-width:800px\">");
pw.println("<h2 class=\"w3-wide\">CONNECTION INFORMATION</h2>");
pw.println("<p class=\"w3-opacity\"><i>Visitor Information</i></p>");
pw.println("<p class=\"w3-justify\">Visitor IP address: " + req.getRemoteAddr() + "</p>");
pw.println("<p class=\"w3-justify\">Visitor User agent: " + req.getHeader("User-Agent") + "</p>");
pw.println("<p></p>");
pw.println("<p class=\"w3-justify\">Server IP address: " + req.getLocalAddr() + "</p>");
pw.println("<p class=\"w3-justify\">Server hosted on: " + System.getenv("CLOUD_PROVIDER") + "</p>");
pw.println("<p class=\"w3-justify\">Server local time: " + date.toString() + "</p>");
pw.println("<p></p>");
pw.println("</div>");
pw.println("</body>");
pw.println("</html>");
pw.close();//closing the stream  
}}  
