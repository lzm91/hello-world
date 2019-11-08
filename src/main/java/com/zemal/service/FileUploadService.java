package com.zemal.service;

import javax.servlet.http.HttpServletRequest;

import com.zemal.model.vo.ResponseJson;
import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {

    ResponseJson upload(MultipartFile file, HttpServletRequest request);
}
