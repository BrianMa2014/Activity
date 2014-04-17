package com.cognizant.flis.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

    public class EncodingFilter implements Filter
{
    public void destroy() {  }
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException
    {
        request.setCharacterEncoding("GBK");  // 将客户端提交的数据设为GBK编码格式
        // 继续处理客户端提交的数据，如果不写这条语句，Servlet引擎将不会处理所过滤的页面
        chain.doFilter(request, response);      
    }
    public void init(FilterConfig filterConfig) throws ServletException {   }  
}