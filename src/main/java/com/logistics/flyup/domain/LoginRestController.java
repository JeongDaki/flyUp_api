package com.logistics.flyup.domain;

import com.logistics.flyup.service.LoginService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@AllArgsConstructor
@Slf4j
public class LoginRestController {

    private final LoginService loginService;

    @GetMapping("/login")
    public int login(String custId, String passWord){
        log.info("login RestController req = {}", custId);
        return loginService.login(custId, passWord);
    }

    @GetMapping("/logout")
    public int logout(String custId){
        log.info("login RestController req = {}", custId);
        return loginService.logout(custId);
    }

}
