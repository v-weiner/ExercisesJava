package POOExercises.exercise4.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Random;

public class CreditCardTransaction extends Transaction {
    private String creditCardToken;

    public CreditCardTransaction(Integer creditCardToken, BigDecimal amount, LocalDateTime transactionTimestamp, String currency) {
        Random id = new Random();
        Integer idNum = id.nextInt(1, 1000000);
        super(idNum.toString(), amount, transactionTimestamp, currency);
        this.creditCardToken = creditCardToken.toString();
    }

    public String getCreditCardToken() {
        return creditCardToken;
    }
}
