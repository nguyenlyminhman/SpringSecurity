package com.spring.mapper;

import com.spring.model.AccountModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {
    int getLoginAccount(String accountId, String password);
    List<AccountModel> getAll();
}
