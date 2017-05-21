package xm.zjl.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.security.access.SecurityMetadataSource;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.access.intercept.InterceptorStatusToken;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

public class MySecurityFilterInterceptor extends AbstractSecurityInterceptor implements Filter {

	private FilterInvocationSecurityMetadataSource securityMetadataSource;
	
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {
		FilterInvocation fi = new FilterInvocation(arg0, arg1, arg2);
		invoke(fi);

	}
	
	@Override
	public Class<?> getSecureObjectClass() {
		 return FilterInvocation.class;  
	}
	
	private void invoke(FilterInvocation fi) throws IOException, ServletException {
		// object为FilterInvocation对象
		// super.beforeInvocation(fi);源码
		// 1.获取请求资源的权限
		// 执行Collection<ConfigAttribute> attributes =
		// SecurityMetadataSource.getAttributes(object);
		// 2.是否拥有权限
		// this.accessDecisionManager.decide(authenticated, object, attributes);
		InterceptorStatusToken token = super.beforeInvocation(fi);
		try {
			fi.getChain().doFilter(fi.getRequest(), fi.getResponse());
		} finally {
			super.afterInvocation(token, null);
		}
	}

	@Override
	public SecurityMetadataSource obtainSecurityMetadataSource() {
		return this.securityMetadataSource;
	}

	public void setSecurityMetadataSource(FilterInvocationSecurityMetadataSource securityMetadataSource) {
		this.securityMetadataSource = securityMetadataSource;
	}
	
	public FilterInvocationSecurityMetadataSource getSecurityMetadataSource() {
		return securityMetadataSource;
	}

	

	public void destroy() {
		// TODO Auto-generated method stub

	}

	

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	
}
