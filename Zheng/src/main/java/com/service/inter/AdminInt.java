package com.service.inter;

import com.entity.Admin;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminInt {

    @Select("select * from admin where adminname=#{adminName} and adminpassword=#{adminPassword}")
    public Admin selectOne(Admin admin);
}
