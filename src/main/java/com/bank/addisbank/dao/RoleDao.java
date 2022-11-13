package com.bank.addisbank.dao;

import com.bank.addisbank.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends CrudRepository<Role, Integer> {
  Role findByName(String name);
}
