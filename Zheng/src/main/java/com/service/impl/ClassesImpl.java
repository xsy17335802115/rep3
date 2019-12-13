package com.service.impl;

import com.entity.Classes;
import com.service.inter.ClassesInt;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//  在此层写一些事务操作
public class ClassesImpl  {
    /*这里一般实现的是service层的接口*/

    @Autowired
    private ClassesInt classesInt;
    /*项目完整时：  使用Dao 类*/

    public List<Classes> selectAll() {
        List<Classes> list=classesInt.selectAll(new RowBounds());
        return list;
    }

    public void insert(Classes classes) {
        classesInt.insert(classes);
    }


}
