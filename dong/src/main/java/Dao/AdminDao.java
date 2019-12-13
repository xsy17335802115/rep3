package Dao;

import Entity.Admin;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

//@CacheNamespace(blocking = true)
//  开启二级缓存
public interface AdminDao {


    @Select("select * from admin")
//    当属性只有value 可以省略   大括号只有一个，也可以省略
//    @Results(id = "",value={
//         @Result(id = true,column = "", property = ""),
//         @Result(column = "", property = ""),
//         @Result(column = "", property = "" ,one = @One(select = " 选择方法的全类名 ",fetchType = FetchType.EAGER))
//    })
//    级联实体类的时候用@one  级联数组的时候用@many    fetchType 是选择 延迟加载和立即加载

//    id 区分是否为主键
//     写在@Select下面   @ResultMap(value = "")  ---和 @Results搭配使用       上面Id 相对应

    public List<Admin> findAll();

    @Insert("insert into admin (adminname,adminpassword) values (#{adminName},#{adminPassword})")
    public void insert(Admin admin);

    @Update("update admin set adminname=#{adminName},adminpassword=#{adminPassword} where adminid=#{adminId}")
    public void update(Admin admin);

    @Delete("delete from admin where adminid=#{adminId} ")
    public void delete(int adminId);
}
