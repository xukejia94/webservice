package com.example.web_service.service;

import java.io.UnsupportedEncodingException;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface DataCenterService {
    @WebMethod
    public String dataShare(String code) throws UnsupportedEncodingException;
}
