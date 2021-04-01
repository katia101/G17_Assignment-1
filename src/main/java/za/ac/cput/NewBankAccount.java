package za.ac.cput;
/*
 *
 * @author Mziyanda
 * Mziyanda Mwanda
 * 215133765
 * ADP 3
 * Assignment
 * 01 April 2021
 * */
public class NewBankAccount {
    private String name ;
    private String lastName;
    private int id;
    private double balance = 0;
    private static int lastId = 0;

    public NewBankAccount(String name, String lastName){
        this.name = name ;
        this.lastName = lastName;
        this.id = ++lastId;
    }
    public NewBankAccount(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        negativeAmount(amount);
        balance += amount;

    }
    public void withDrawal(double amount){
        negativeAmount(amount);
        if (balance - amount <= 0){
            try {
                throw new IllegalAccessException("Cannot withdraw" + amount + "from" + balance);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        balance = balance - amount;
    }

    private void negativeAmount(double amount){
        if (amount < 0 ){
            try {
                throw new IllegalAccessException("Negative amount" + amount);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "NewBankAccount{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                '}';
    }
}

