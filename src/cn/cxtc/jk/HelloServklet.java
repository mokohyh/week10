package cn.cxtc.jk;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServklet implements javax.servlet.Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        // TODO Auto-generated method stub
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // TODO Auto-generated method stub
        System.out.println("service start");
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        System.out.println("servlet destroy");
    }

    @Override
    public ServletConfig getServletConfig() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getServletInfo() {
        // TODO Auto-generated method stub
        return null;
    }
}
