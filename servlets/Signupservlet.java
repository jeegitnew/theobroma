package com.theobroma.core.core.servlets;
 
import com.day.cq.commons.jcr.JcrConstants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.request.RequestParameter;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
//import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.List;
 
@Component(service = {Servlet.class},
    property={
        "sling.servlet.methods="+ "post",
        "sling.servlet.paths="+"/bin/form/details",
       // "sling.servlet.selectors"+ "form",
        "sling.servlet.extensions="+"html"
    }
)

public class Signupservlet extends SlingAllMethodsServlet {
    private static final Logger log = LoggerFactory.getLogger(Signupservlet.class);
 
    @Override
    protected void doPost(final SlingHttpServletRequest req,
            final SlingHttpServletResponse resp) throws ServletException, IOException {
           /*  String name=req.getParameter("name");  */  
            String email=req.getParameter("email");
            log.info("<------------------Path Servlet--------------->");
            log.info( "email"+email);
            resp.getWriter().write("Thanks your form is successfully uploaded.");

        
    }
 
   
    }
