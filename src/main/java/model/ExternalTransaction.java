package model;

public class ExternalTransaction {
    public String id;
    public String userId;
    public double amount;
    public String currency;
    public long timestamp;

    public ExternalTransaction(String id, String userId, double amount, String currency, long timestamp) {
        this.id = id;
        this.userId = userId;
        this.amount = amount;
        this.currency = currency;
        this.timestamp = timestamp;
    }
}
