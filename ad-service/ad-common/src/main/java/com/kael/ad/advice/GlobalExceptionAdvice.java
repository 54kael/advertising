package com.kael.ad.advice;

import com.kael.ad.exception.AdException;
import com.kael.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerAdException(HttpServletRequest request, AdException e) {
        CommonResponse<String> response = new CommonResponse<>(-1,"business error");
        response.setData(e.getMessage());
        return response;
    }
}
