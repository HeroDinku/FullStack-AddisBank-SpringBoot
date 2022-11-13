package com.bank.addisbank.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
public class PrimaryTransaction {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Date date;
  private String description;
  private String type;
  private String status;
  private double amount;
  private BigDecimal availableBalance;

  public PrimaryTransaction() {}


  public PrimaryTransaction(Date date, String description, String type, String status, double amount, BigDecimal availableBalance, PrimaryAccount primaryAccount) {
    this.date = date;
    this.description = description;
    this.type = type;
    this.status = status;
    this.amount = amount;
    this.availableBalance = availableBalance;
    this.primaryAccount = primaryAccount;
  }

  @ManyToOne
  @JoinColumn(name = "primary_account_id")
  private PrimaryAccount primaryAccount;

}

