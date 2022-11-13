package com.bank.addisbank.dao;

import com.bank.addisbank.domain.SavingsTransaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

  List<SavingsTransaction> findAll();
}
