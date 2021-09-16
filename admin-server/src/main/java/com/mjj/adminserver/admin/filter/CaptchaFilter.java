package com.mjj.adminserver.admin.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mjj.adminserver.admin.vo.LoginResult;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter({"/admin/login","/user/login"})
public class CaptchaFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("验证码过滤器......");
        String code = request.getParameter("code");
        String scode = (String) ((HttpServletRequest)request).getSession().getAttribute("code");
        LoginResult result = new LoginResult();
        if (!scode.equalsIgnoreCase(code)){
            result.setSuccess(false);
            result.setMsg("验证码错误");
            ObjectMapper om = new ObjectMapper();
            String json = om.writeValueAsString(result);
            response.getWriter().print(json);
        }else {
            filterChain.doFilter(request,response);
        }


    }

    @Override
    public void destroy() {

    }
}
