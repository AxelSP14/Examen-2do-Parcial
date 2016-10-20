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
public class CuadradoPerimetroServlet extends HttpServlet{
    public int lado=0;
    public int perimetro;
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException{
        lado = Integer.parseInt(req.getParameter("lado"));
        perimetro = lado*4;
        response(res, "Actualizado");
    }
    
    public void response(HttpServletResponse resp, String msg)
            throws IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>"
                + "<body>"
                + "<center>"
                + "<h1>El perimetro de este cuadrado es igual a "+perimetro+" u</h1>"
                + "<br><br>"
                + "<h2><a href='cuadrado.html'>Regresar</a></h2>"
                + "</center>"
                + "</body>"
                + "</html>");
    }
            
}
