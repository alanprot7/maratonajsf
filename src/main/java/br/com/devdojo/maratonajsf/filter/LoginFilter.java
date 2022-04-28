package br.com.devdojo.maratonajsf.filter;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.devdojo.maratonajsf.bean.login.LoginBean;

public class LoginFilter implements Filter {
	@Inject
	private LoginBean loginBean;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req = (HttpServletRequest) arg0;
		HttpServletResponse res = (HttpServletResponse) arg1;
		String url = req.getRequestURL().toString();
		System.out.println(url);
		if(url.contains("/restricted") && loginBean.getEstudante() == null) {
			res.sendRedirect(req.getServletContext().getContextPath()+ "/login.xhtml");
		}else {
			arg2.doFilter(arg0, arg1);
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
