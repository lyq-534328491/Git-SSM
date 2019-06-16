package com.itcast.controller;

import com.itcast.domain.Account;
import com.itcast.service.AccountService;
import com.itcast.service.impl.AccountSerivceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author Lyq
 * @Profession Programmer
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层:查询所有...");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("表现层:查询所有...");
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return "list";
    }

}
