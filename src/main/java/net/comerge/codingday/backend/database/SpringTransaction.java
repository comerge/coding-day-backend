package net.comerge.codingday.backend.database;

import org.jooq.Transaction;

import org.springframework.transaction.TransactionStatus;

public class SpringTransaction implements Transaction {

    final TransactionStatus transactionStatus;

    public SpringTransaction(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}