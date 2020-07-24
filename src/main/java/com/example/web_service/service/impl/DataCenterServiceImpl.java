package com.example.web_service.service.impl;

import com.example.web_service.service.DataCenterService;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.io.UnsupportedEncodingException;


/**
 * targetNamespace:按照endpointInterface反写，很关键
 */
@Service
@WebService(serviceName = "dataShare" ,
        targetNamespace ="http://service.web_service.example.com/" ,
        endpointInterface = "com.example.web_service.service.DataCenterService")
public class DataCenterServiceImpl implements DataCenterService {

    @Override
    public String dataShare(String code) throws UnsupportedEncodingException {
        System.out.println("test:"+ code);
        return "test"+code;
    }
}