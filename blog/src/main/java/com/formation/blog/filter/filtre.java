package com.formation.blog.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class filtre
 */
@WebFilter("/filtre")
public class filtre implements Filter {

    /**
     * Default constructor. 
     */
    public filtre() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse resp =(HttpServletResponse) response;
		// pass the request along the filter chain
		HttpSession session = req.getSession(false);
		String uri = req.getRequestURI();
		
		
		
		if ((session == null || session.getAttribute("session") != "Florian") &&  !uri.contentEquals(req.getContextPath()+"/login")) {
			resp.sendRedirect(req.getContextPath()+"/login");
		}else {
			chain.doFilter(request, response);
		}
		chain.doFilter(request, response);
	}
	

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
