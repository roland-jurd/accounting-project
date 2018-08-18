package com.accounting.ledgerservice.model;


import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class LedgerRecord {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    
    @Column(name = "debit_account_id")
    Long debitAccountId;
    
    @Column(name = "credit_account_id")
    Long creditAccountId;
    
    Long reference;
    
    String currency;
    
    
}
