package chapter7;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

// ulrPattenrs, value : 필터가 동작할 URL을 지정 / 반드시 필요한 속성
// servletNames : 필터가 동작할 서블릿의 이름
// filterName : 필터의 이름
// initParam : 필터가 가져야 할 초기 파라미터
@WebFilter(servletNames = {"servlet1", "servlet2"})
public class Filter3 implements Filter {
    public Filter3() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// 필터가 사라질 때 (서버가 종료될 떄) 동작하는 메서드
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
