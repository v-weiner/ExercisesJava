package POOExercises.exercise4.entities;

import java.lang.invoke.StringConcatFactory;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Random;

public class PixTransaction extends  Transaction {
    private String pixKey;

    public PixTransaction(Integer pixKey, BigDecimal amount, LocalDateTime transactionTimestamp, String currency) {
        Random id = new Random();
        Integer idNum = id.nextInt(1, 1000000);
        super(idNum.toString(), amount, transactionTimestamp, currency);
        this.pixKey = pixKey.toString();
    }

    public String getPixKey() {
        return pixKey;
    }
}
