package com.bank.addisbank.dao;

import com.bank.addisbank.domain.PrimaryTransaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

  List<PrimaryTransaction> findAll();
}
