package com.demo.api.service;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
/*
 * Author :- Suyash
 * 28122024
 */

@Component
public class SimpleFilter implements Filter{

	
	
	
	@Override
	public void destroy() {}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterchain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("Remote Host :"+request.getRemoteHost());
		System.out.println("Remote Address :"+request.getRemoteAddr());
		System.out.println("Local Address :"+request.getLocalAddr());
		filterchain.doFilter(request, response);
		
		
	}
	
	public void init(FilterConfig filterConfig)throws ServletException{}

}
