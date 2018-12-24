package SessionListener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;

@WebListener()
public class OnlineNumberListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {

    private int count = 0;

    // Public constructor is required by servlet spec
    public OnlineNumberListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed). 
         You can initialize servlet context related data here.
      */
    }

    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        /* Session is created. */
        System.out.println("Session 已经 创建！");
        System.out.println("sessionCreated start ...");
        count ++;
        //通过事件对象(HttpSessionEvent)找到session
        HttpSession session = httpSessionEvent.getSession();
        ServletContext sctx = session.getServletContext();
        //将人数count绑定到servletContext，这样，可以随时访问。
        sctx.setAttribute("count",count);

    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        /* Session is destroyed. */
        System.out.println("Session 已经销毁！");
        /* Session is created. */
        System.out.println("Session 已经 创建！");
        System.out.println("sessionCreated start ...");
        count --;
        //通过事件对象(HttpSessionEvent)找到session
        HttpSession session = httpSessionEvent.getSession();
        ServletContext sctx = session.getServletContext();
        //将人数count绑定到servletContext，这样，可以随时访问。
        sctx.setAttribute("count",count);
    }

    // -------------------------------------------------------
    // HttpSessionAttributeListener implementation
    // -------------------------------------------------------

    public void attributeAdded(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute 
         is added to a session.
      */
    }

    public void attributeRemoved(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute
         is removed from a session.
      */
    }

    public void attributeReplaced(HttpSessionBindingEvent sbe) {
      /* This method is invoked when an attibute
         is replaced in a session.
      */
    }
}
