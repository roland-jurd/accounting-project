package com.accounting.ledgerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ledger")
public class LedgerController {
    
    @GetMapping("/test")
    public String testAvailable() {
        return "ledger-service available";
    }
    
}
