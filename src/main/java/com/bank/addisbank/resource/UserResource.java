package com.bank.addisbank.resource;

import com.bank.addisbank.domain.PrimaryTransaction;
import com.bank.addisbank.domain.SavingsTransaction;
import com.bank.addisbank.domain.User;
import com.bank.addisbank.service.TransactionService;
import com.bank.addisbank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@PreAuthorize("hasRole('ADMIN')")

public class UserResource {

  @Autowired
  private UserService userService;

  @Autowired
  private TransactionService transactionService;

  @RequestMapping(value = "/user/all", method = RequestMethod.GET)
  public List<User> userList() {
    return userService.findUserList();
  }

  @RequestMapping(value = "/user/primary/transaction", method = RequestMethod.GET)
  public List<PrimaryTransaction> getPrimaryTransactionList(@RequestParam("username") String username) {
    return transactionService.findPrimaryTransactionList(username);
  }

  @RequestMapping(value = "/user/savings/transaction", method = RequestMethod.GET)
  public List<SavingsTransaction> getSavingsTransactionList(@RequestParam("username") String username) {
    return transactionService.findSavingsTransactionList(username);
  }

  @RequestMapping("/user/{username}/enable")
  public void enableUser(@PathVariable("username") String username) {
    userService.enableUser(username);
  }

  @RequestMapping("/user/{username}/disable")
  public void diableUser(@PathVariable("username") String username) {
    userService.disableUser(username);
  }
}
