package com.cdforum.getway.filter;

import com.cdforum.getway.entities.SessionValue;
import org.mockito.internal.matchers.Contains;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @author 019409
 */
@Component
public class FilterConfigs implements Filter {


    /**
     *   跳转的错误信息页面
     */
    private String errorPage;
    private int num=0;
    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("过滤器初始化");
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        System.out.println(((HttpServletRequest) servletRequest).getRequestURI());
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpServletRequest request = (HttpServletRequest)servletRequest ;
        if(request.getRequestURI().contains("/error")){
            System.out.println(((HttpServletRequest) servletRequest).getRequestURI());
        }else if(request.getRequestURI().contains("/login") ){
            request.getSession().setAttribute(SessionValue.USERINFO,request.getParameter("user"));
            System.out.println(request.getSession().getAttribute(SessionValue.USERINFO));
        }else{
            System.out.println("USERINFO:"+request.getSession().getAttribute(SessionValue.USERINFO));
            if(request.getSession().getAttribute(SessionValue.USERINFO) == null){
                request.setAttribute("msg","请先登录！");
                request.getRequestDispatcher("/error").forward(request, response);
            }
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
    @Override
    public void destroy() {
        System.out.println("过滤器销毁了");
    }
}
