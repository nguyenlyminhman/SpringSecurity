package com.spring.service.impl;

import com.spring.mapper.AccountMapper;
import com.spring.model.AccountModel;
import com.spring.service.IAccountService;
import com.spring.shared.ResponseObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountService.class);

    @Autowired
    private AccountMapper mapper;

    @Override
    public ResponseObject getLoginAccount(String accountId, String password) {
        ResponseObject responseObject = new ResponseObject();
        try {
            int result = mapper.getLoginAccount(accountId, password);
            if (result > 0) {
                responseObject.setData(result);
                responseObject.setSuccess(true);
                responseObject.setMessage("Success");
            } else {
                responseObject.setData(result);
                responseObject.setSuccess(false);
                responseObject.setMessage("Fail", "Failure");
            }
        } catch (Exception e) {
            responseObject.setSuccess(false);
            responseObject.setMessage("Ec ec");
            LOGGER.error("Error when call saveAddressDetails function  in AddressService class: .", e);
        }
        return responseObject;
    }

    @Override
    public ResponseObject<List<AccountModel>> getAll() {
        ResponseObject res = new ResponseObject();
        List<AccountModel> a = mapper.getAll();
        return new ResponseObject(a);
    }
}
