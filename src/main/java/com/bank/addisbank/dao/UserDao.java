package com.bank.addisbank.dao;

import com.bank.addisbank.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao extends CrudRepository<User, Long> {
  User findByUsername(String username);
  User findByEmail(String email);
  List<User> findAll();
}

