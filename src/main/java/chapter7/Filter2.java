package chapter7;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter2 implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("<<Filter2 doFilter 메서드 호출>>");
		
		request.setCharacterEncoding("UTF-8");
		
		chain.doFilter(request, response);
	}
	
}
