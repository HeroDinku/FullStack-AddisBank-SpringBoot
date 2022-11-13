package com.bank.addisbank.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter

public class PrimaryAccount {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private int accountNumber;
  private BigDecimal accountBalance;

  @OneToMany(mappedBy = "primaryAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JsonIgnore
  private List<PrimaryTransaction> primaryTransactionList;

}
