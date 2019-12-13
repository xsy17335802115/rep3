package com.service.impl;

import com.service.inter.AdminInt;
import com.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class adminImpl {

    @Autowired
    private AdminInt ad;


    public Admin selectOne(Admin admin) {
        Admin fanhui=ad.selectOne(admin);
        return fanhui;
    }
}
