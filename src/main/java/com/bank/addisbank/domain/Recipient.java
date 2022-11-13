package com.bank.addisbank.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Recipient {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String email;
  private String phone;
  private String accountNumber;
  private String description;

  @ManyToOne
  @JoinColumn(name = "user_id")
  @JsonIgnore
  private User user;

}
