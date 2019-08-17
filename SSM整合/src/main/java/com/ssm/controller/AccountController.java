package com.ssm.controller;

import com.ssm.domain.Account;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 13967
 * @date 2019/8/17 16:57
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findallaccount")
    public String findAllAccount(Model model){

        System.out.println("表现层: 查找所有用户...");

        // 调用service的方法
        List<Account> list = accountService.findAllAccount();
        model.addAttribute("list", list);
        return "list";
    }

    @RequestMapping("/saveaccount")
    public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("表现层: 保存用户...");

        accountService.saveAccount(account);
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);
        return;
    }
}
