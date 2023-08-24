package com.venancio.daw.proyectoClaseSSNN;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import com.venancio.daw.proyectoClaseSSNN.model.Alumno;
import com.venancio.daw.proyectoClaseSSNN.service.CursosServices;

public class MostrarAlumnosServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
    	this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	super.doGet(request, response);

        WebContext ctx = new WebContext(request, response, servletContext, request.getLocale());

        CursosServices cS = new CursosServices();
        List<Alumno> allAlumnos = cS.mostrarAlumnos();
        
        ctx.setVariable("listaA", allAlumnos);
        
        TemplateEngine engine = configThymeleaf.getTemplateEngine();

        engine.process("mostrarAlumnos", ctx, response.getWriter());

    }
}
