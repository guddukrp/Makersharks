package com.makersharks.service;

import net.javaguides.banking.dto.AccountDto;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto account);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id,double balance);

    AccountDto withdraw(Long id,double balance);

    List<AccountDto> getAllAccounts();

    void deleteAccountById(long id);
}
