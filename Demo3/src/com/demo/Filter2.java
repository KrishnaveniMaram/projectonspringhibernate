package com.demo;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Filter2
 */
@WebFilter(filterName="filter2")
public class Filter2 implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
	

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("i am in filter 2");
		chain.doFilter(request, response);
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

}
