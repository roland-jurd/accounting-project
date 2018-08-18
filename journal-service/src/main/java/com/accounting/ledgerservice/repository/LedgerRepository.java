package com.accounting.ledgerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accounting.ledgerservice.model.LedgerRecord;


@Repository
public interface LedgerRepository extends JpaRepository<LedgerRecord, Long> {
    
}
