package com.bank.addisbank.service;

import com.bank.addisbank.domain.PrimaryAccount;
import com.bank.addisbank.domain.SavingsAccount;

import java.security.Principal;

public interface AccountService {
  PrimaryAccount createPrimaryAccount();
  SavingsAccount createSavingsAccount();
  void deposit(String accountType, double amount, Principal principal);
  void withdraw(String accountType, double amount, Principal principal);


}
