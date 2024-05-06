/*package com.theobroma.core.core.servlets;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.servlets.ServletResolverConstants;
import org.apache.sling.api.servlets.Servlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.framework.Constants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import com.day.cq.search.QueryBuilder;
import org.apache.sling.api.servlets.ServletResolverConstants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
 
@Component(service = Servlet.class,
        property = {
                ServletResolverConstants.SLING_SERVLET_PATHS + "=/bin/mysearch",
                Constants.SERVICE_DESCRIPTION + "=Query Builder Example Servlet",
                "sling.servlet.methods=" + HttpConstants.METHOD_GET
        })
public class Queryservlet extends SlingAllMethodsServlet {
    @Reference
    private QueryBuilder queryBuilder;
 
    @Reference
    private ResourceResolverFactory resolverFactory;
 
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        String propertyName = request.getParameter("propertyName");
        String propertyValue = request.getParameter("propertyValue");
 
        if (propertyName != null && propertyValue != null) {
            QueryBuilderExample queryBuilderExample = new QueryBuilderExample(queryBuilder, resolverFactory);
            queryBuilderExample.executeQuery(propertyName, propertyValue);
            response.getWriter().write("Query executed successfully!");
        } else {
            response.getWriter().write("Please provide both propertyName and propertyValue parameters.");
        }
    }
}*/