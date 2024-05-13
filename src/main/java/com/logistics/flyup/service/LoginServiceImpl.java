package com.logistics.flyup.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
@Slf4j
public class LoginServiceImpl implements LoginService{


    @Override
    public int login(String custId, String pass) {
        log.info("login Service req = {}", custId);
        return 9999;
    }

    @Override
    public int logout(String custId) {
        log.info("logout Service req = {}", custId);
        return 10000;
    }
}
