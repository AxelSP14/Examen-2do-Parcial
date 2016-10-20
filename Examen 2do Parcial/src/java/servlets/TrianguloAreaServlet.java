/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
public class TrianguloAreaServlet extends HttpServlet{
    public int base;
    public int altura;
    public int area;
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException{
        base = Integer.parseInt(req.getParameter("base"));
        altura = Integer.parseInt(req.getParameter("altura"));
        area = (base*altura)/2;
        response(res, "Actualizado");
    }
    
    public void response(HttpServletResponse resp, String msg)
            throws IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>"
                + "<body>"
                + "<center>"
                + "<h1>El area de este triangulo es igual a "+area+" u</h1>"
                + "<br><br>"
                + "<h2><a href='triangulo.html'>Regresar</a></h2>"
                + "</center>"
                + "</body>"
                + "</html>");
    }
            
}
