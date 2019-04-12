package com.yyh.application.service;

import org.springframework.stereotype.Component;

/**
 * @author dry
 * @create 2019-04-10-14:37
 */
@Component
public class ApiServiceError implements ApiService {
    @Override
    public String index() {
        return "服务器发生故障";
    }
}
