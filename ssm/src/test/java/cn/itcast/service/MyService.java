package cn.itcast.service;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import cn.itcast.service.impl.AccountServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyService {
    private AccountService service;

    @Before
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        service = context.getBean(AccountServiceImpl.class);
    }

    @Test
    public void testFindAll(){
        List<Account> lists = service.findAll();
    }
}
