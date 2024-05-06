package com.theobroma.core.core.servlets;
 
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
 
@Component(service = { Servlet.class })
@SlingServletResourceTypes(resourceTypes ="theobroma/components/page", methods = HttpConstants.METHOD_GET, extensions = "txt")
public class Calculation extends SlingAllMethodsServlet {
 
    @Override
    protected void doGet(final SlingHttpServletRequest req,
            final SlingHttpServletResponse resp) throws ServletException, IOException {
        int hp = Integer.parseInt(req.getParameter("hp"));
        int dp = Integer.parseInt(req.getParameter("dp"));
 
        String symbol = req.getParameter("symbol1");
        double lt = Double.parseDouble(req.getParameter("lt"));
        double ir = Double.parseDouble(req.getParameter("ir"));
        String month = req.getParameter("month");
        String year = req.getParameter("year");
 
        if (month != null) {
            double n = lt / 12;
            int payment = hp - dp;
            double intrestrate = (payment * (ir / 100)) * n;
            double totalpayment = payment + intrestrate;
   
            resp.setContentType("text/html");
            resp.setContentType("text/html");
            resp.getWriter().write("<h2>Loan Calculation Result</h2>");
            resp.getWriter().write("<p>Payment amount: " + payment + "</p>");
            resp.getWriter().write("<p>Loan term: " + lt + "</p>");
            resp.getWriter().write("<p>Interest rate: " + ir + "%</p>");
            resp.getWriter().write("<p>Total interest: " + intrestrate + "</p>");
            resp.getWriter().write("<p>Total payment: " + totalpayment + "</p>");
           
        }
        if (year != null) {
            double n = lt;
            int payment = hp - dp;
            double intrestrate = (payment * (ir / 100)) * n;
            double totalpayment = payment + intrestrate;
            resp.setContentType("text/html");
            resp.setContentType("text/html");
            resp.getWriter().write("<h2>Loan Calculation Result</h2>");
            resp.getWriter().write("<p>Payment amount: " + payment + "</p>");
            resp.getWriter().write("<p>Loan term: " + lt + "</p>");
            resp.getWriter().write("<p>Interest rate: " + ir + "%</p>");
            resp.getWriter().write("<p>Total interest: " + intrestrate + "</p>");
            resp.getWriter().write("<p>Total payment: " + totalpayment + "</p>");
        }
    }
 
   
}