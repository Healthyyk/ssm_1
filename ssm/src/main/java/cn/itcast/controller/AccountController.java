package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("AccountController-----findAll");
        accountService.findAll();
        return "success";
    }

    @RequestMapping("/add")
    public String add(Account account){
        System.out.println("AccountController---add");
        accountService.add(account);
        return "success";
    }
}
