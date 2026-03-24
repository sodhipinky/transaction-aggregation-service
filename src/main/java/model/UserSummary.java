package model;

public class UserSummary {
    public String userId;
    public double totalAmount;
    public int transactionCount;

    @Override
    public String toString() {
        return "UserSummary{" +
                "userId='" + userId + '\'' +
                ", totalAmount=" + totalAmount +
                ", transactionCount=" + transactionCount +
                '}';
    }
}
