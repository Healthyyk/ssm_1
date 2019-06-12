package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MyBatis {

    @Test
    public void run1() throws Exception {
// 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
// 创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
// 创建sqlSession对象
        SqlSession session = factory.openSession();
// 获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
// 调用查询的方法
        Account account = new Account();
        account.setName("哈哈");
        account.setMoney(100d);
        dao.add(account);
        session.commit();
//        List<Account> lists = dao.findAll();
//        for (Account list : lists) {
//            System.out.println(list);
//        }
    }
}
