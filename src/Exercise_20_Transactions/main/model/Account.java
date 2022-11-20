package Exercise_20_Transactions.main.model;

public class Account {
    private int id;
    private int accountNumber;
    private String name;
    private Double balance;

    public Account() {
    }

    public Account(int accountNumber, String name, Double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public Account(int id, int accountNumber, String name, Double balance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
