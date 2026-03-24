package service;

import model.ExternalTransaction;
import model.InternalTransaction;
import model.UserSummary;

import java.util.Arrays;
import java.util.List;

public class TransactionService {
    // TODO: Add cache here

    public List<ExternalTransaction> fetchFromProvider() {
        long now = System.currentTimeMillis();

        return Arrays.asList(
                new ExternalTransaction("t1", "u1", 100, "USD", now - 1000),
                new ExternalTransaction("t2", "u1", 200, "USD", now - 2000),
                new ExternalTransaction("t3", "u2", 300, "EUR", now - 4000000) // old
        );
    }

    public InternalTransaction convert(ExternalTransaction tx) {
        // TODO: Convert External → Internal
        return null;
    }

    public List<UserSummary> getUserTransactionSummary() {

        // TODO:
        // 1. Check cache
        // 2. Fetch transactions
        // 3. Filter last 1 hour
        // 4. Aggregate per user
        // 5. Store in cache
        // 6. Return result

        return null;
    }
}
