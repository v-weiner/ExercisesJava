package POOExercises.exercise4.service;

import POOExercises.exercise4.entities.Transaction;

import java.util.Set;

public class TransactionAuditor {
    private Set<Transaction> transactions;

    public TransactionAuditor(Set<Transaction> transactions){
        this.transactions = transactions;
    }

    public boolean addTransaction(Transaction transaction){
        if(transactions.contains(transaction)){
            return false;
        }
        transactions.add(transaction);
        return true;
    }

    public void printTransactions(){
        for(Transaction transaction : transactions){
            System.out.printf("Transaction: \n" + transaction.getIdTransaction() + "\n" + transaction.getCurrency() + "\n" + transaction.getAmount() + "\n"
            + transaction.getTransactionTimestamp() + "\n\n");
        }
    }
}
