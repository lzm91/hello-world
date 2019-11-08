package com.zemal.service;

import javax.servlet.http.HttpSession;

import com.zemal.model.vo.ResponseJson;

public interface SecurityService {

    ResponseJson login(String username, String password, HttpSession session);
    
    ResponseJson logout(HttpSession session);
}
