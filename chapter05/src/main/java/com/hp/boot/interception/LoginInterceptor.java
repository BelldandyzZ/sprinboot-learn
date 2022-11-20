package com.hp.boot.interception;

import com.hp.boot.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
@Slf4j
public class LoginInterceptor  implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("拦截的请求路径是：" + request.getRequestURI());
        log.info("异常是：" + request.getAttribute("message"));
        HttpSession session = request.getSession();
        User currentUser = (User) session.getAttribute("currentUser");
        if(currentUser != null){
            return true;
        }
        response.sendRedirect("/");
        return false;
    }


}
