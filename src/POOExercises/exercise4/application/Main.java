package POOExercises.exercise4.application;

import POOExercises.exercise4.entities.CreditCardTransaction;
import POOExercises.exercise4.entities.PixTransaction;
import POOExercises.exercise4.service.TransactionAuditor;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    static void main() {
        TransactionAuditor auditor = new TransactionAuditor(new TreeSet<>());
        auditor.addTransaction(new PixTransaction(new Random().nextInt(100000, 1000000000), new BigDecimal(1000), LocalDateTime.now(), "BRL"));
        auditor.addTransaction(new PixTransaction(new Random().nextInt(100000, 1000000000), new BigDecimal(2000), LocalDateTime.now().plusSeconds(10), "BRL"));
        auditor.addTransaction(new CreditCardTransaction(new Random().nextInt(100000, 1000000000), new BigDecimal(3000), LocalDateTime.now().minusSeconds(10), "BRL"));
        auditor.printTransactions();
    }
}
