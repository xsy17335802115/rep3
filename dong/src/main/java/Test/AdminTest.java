package Test;

import Dao.AdminDao;
import Entity.Admin;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class AdminTest {
    InputStream inputStream=null;
    SqlSessionFactory sqlSessionFactory=null;
    SqlSession sqlSession=null;

    @Before
    public void test01() throws Exception{
        inputStream= Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession=sqlSessionFactory.openSession();
    }

    @Test
    public void test02(){
        AdminDao adminDao=sqlSession.getMapper(AdminDao.class);
        /*原来写sqlSession.selectList("命名空间+方法名")*/
        List<Admin> list=adminDao.findAll();

        for(Admin admin:list){
            System.out.println(admin);
        }
    }

    @Test
    public void test03(){
        AdminDao adminDao=sqlSession.getMapper(AdminDao.class);
        /*原来写sqlSession.selectList("命名空间+方法名")*/
        Admin admin=new Admin();
        admin.setAdminName("xxx");
        admin.setAdminPassword("yyy");
        adminDao.insert(admin);
        sqlSession.commit();
    }

    @Test
    public void test04(){
        AdminDao adminDao=sqlSession.getMapper(AdminDao.class);
        /*原来写sqlSession.selectList("命名空间+方法名")*/
        Admin admin=new Admin();
        admin.setAdminId(1019);
        admin.setAdminName("xxx");
        admin.setAdminPassword("xsy");
        adminDao.update(admin);
        sqlSession.commit();
    }

    @Test
    public void test05(){
        AdminDao adminDao=sqlSession.getMapper(AdminDao.class);
        /*原来写sqlSession.selectList("命名空间+方法名")*/
        adminDao.delete(1019);
        sqlSession.commit();
    }
}
