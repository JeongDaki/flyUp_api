package com.logistics.flyup.service;


public interface LoginService {

    public int login (String custId, String pass);

    public int logout (String custId);

}
