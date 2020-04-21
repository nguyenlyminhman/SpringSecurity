package com.spring.service;

import com.spring.model.AccountModel;
import com.spring.shared.ResponseObject;

import java.util.List;

public interface IAccountService {
    ResponseObject getLoginAccount(String username, String pass);
    ResponseObject<List<AccountModel>> getAll();
}
