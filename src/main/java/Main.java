import model.UserSummary;
import service.TransactionService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        TransactionService service = new TransactionService();

        List<UserSummary> summaries = service.getUserTransactionSummary();

        for (UserSummary summary : summaries) {
            System.out.println(summary);
        }
    }
}
