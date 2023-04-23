package org.jackpot.chain.servlet;

import javax.servlet.*;
import java.io.IOException;

public class MyServletFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        chain.doFilter(request, response);//必须手动调用，才能放行到下一个过滤器
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
