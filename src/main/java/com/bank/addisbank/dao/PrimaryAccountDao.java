package com.bank.addisbank.dao;

import com.bank.addisbank.domain.PrimaryAccount;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by z00382545 on 10/21/16.
 */
public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {

  PrimaryAccount findByAccountNumber (int accountNumber);
}
