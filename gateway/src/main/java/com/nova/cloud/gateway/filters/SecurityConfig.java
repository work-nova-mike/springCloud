package com.nova.cloud.gateway.filters;

import org.springframework.context.annotation.Configuration;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Configuration
public class SecurityConfig extends ZuulFilter{

	@Override
	public Object run() throws ZuulException {
		System.out.println("Prefiltro-false");
		
		RequestContext context = RequestContext.getCurrentContext();
		context.addZuulRequestHeader("cabeceraPrueba", "la chunda es chunday");
		return true;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 99;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

}
