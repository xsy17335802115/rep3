package com.service.inter;

import com.entity.Classes;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()

/*相当于Dao层接口，Service层接口实现一样的功能*/
public interface ClassesInt {

    @Select("select * from classes")
    public List<Classes> selectAll(RowBounds rowBounds);
    /*可以实现分页   该实体类由Spring提供*/
//    查询所有


//   添加
    @Insert("insert into classes(name,begin_date,end_date) values (#{name},#{begin_date},#{end_date})")
    public void insert(Classes classes);
}
