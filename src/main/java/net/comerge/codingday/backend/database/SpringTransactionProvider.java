package net.comerge.codingday.backend.database;

import static org.springframework.transaction.TransactionDefinition.PROPAGATION_NESTED;

import org.jooq.TransactionContext;
import org.jooq.TransactionProvider;
import org.jooq.tools.JooqLogger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class SpringTransactionProvider implements TransactionProvider {

    private static final JooqLogger log = JooqLogger.getLogger(SpringTransactionProvider.class);

    @Autowired
    private DataSourceTransactionManager transactionManager;

    @Override
    public void begin(TransactionContext ctx) {
        log.info("Begin transaction");

        // This TransactionProvider behaves like jOOQ's DefaultTransactionProvider,
        // which supports nested transactions using save points
        TransactionStatus tx = transactionManager.getTransaction(new DefaultTransactionDefinition(PROPAGATION_NESTED));
        ctx.transaction(new SpringTransaction(tx));
    }

    @Override
    public void commit(TransactionContext ctx) {
        log.info("commit transaction");
        transactionManager.commit(((SpringTransaction) ctx.transaction()).transactionStatus);
    }

    @Override
    public void rollback(TransactionContext ctx) {
        log.info("rollback transaction");
        transactionManager.rollback(((SpringTransaction) ctx.transaction()).transactionStatus);
    }

}
