package com.hp.boot.exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

    @Order(Ordered.HIGHEST_PRECEDENCE)
    @Component
    public class SyncHandler implements HandlerExceptionResolver{
        @Override
        public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
            return null;
        }
    }

    @Order(Ordered.HIGHEST_PRECEDENCE)
    @Component
    public class AyncHandler implements HandlerExceptionResolver{
        @Override
        public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
            return null;
        }
    }



}
