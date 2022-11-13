package com.bank.addisbank.service.UserServiceImp;

import com.bank.addisbank.dao.UserDao;
import com.bank.addisbank.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Service
public class UserSecurityService implements UserDetailsService {

  /** The application logger */
  private static final Logger LOG = (Logger) LoggerFactory.getLogger(UserSecurityService.class);

  @Autowired
  private UserDao userDao;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userDao.findByUsername(username);
    if (null == user) {
      LOG.warn("Username {} not found");
      throw new UsernameNotFoundException("Username " + username + " not found");
    }
    return user;
  }
}
