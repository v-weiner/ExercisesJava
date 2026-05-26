package POOExercises.exercise4.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class Transaction implements Comparable<Transaction>{
    private final String idTransaction;
    private BigDecimal amount;
    private LocalDateTime transactionTimestamp;
    private String currency;

    public Transaction(String idTransaction, BigDecimal amount, LocalDateTime transactionTimestamp, String currency) {
        this.idTransaction = idTransaction;
        this.amount = amount;
        this.transactionTimestamp = transactionTimestamp;
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getIdTransaction() {
        return idTransaction;
    }

    public String getTransactionTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return transactionTimestamp.format(formatter);
    }

    public void setTransactionTimestamp(LocalDateTime transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(idTransaction, that.idTransaction) && Objects.equals(currency, that.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTransaction, currency);
    }

    @Override
    public int compareTo(Transaction o) {
        return this.transactionTimestamp.compareTo(o.transactionTimestamp);
    }
}
