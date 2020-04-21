package com.spring.controller;

import com.spring.model.AccountModel;
import com.spring.service.IAccountService;
import com.spring.shared.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AccountController {

    @Autowired
    IAccountService service;

    @PostMapping("/security/login")
    public ResponseObject login (@RequestBody AccountModel model){
        return service.getLoginAccount(model.getAccountId(), model.getPassword());
    }

    @GetMapping("/public/get-all")
    public ResponseObject getALl (){
        return service.getAll();
    }

}
