
public class Encapsulation {
    public static void main(String[] args) {
        
        System.out.println("Encapsulation In Java");

        // Encapsulation = bundling data (fields) and methods that operate on that data into a single unit (class),
        // and restricting direct access to the internals. It's the "data hiding" pillar of OOP.
        // Encapsulation is Data-hiding + Data binding + Give Control Access through getter and setters like read and write access
        // Wrapping data and methods in one unit and restricting direct access using private + public getters/setters. Protects invariants and enables validation.
        
        // Creating BankAccount Class
        BankAccount bank = new BankAccount();

        // System.out.println(bank.balance); cannot direct access

        System.out.println("Welcome to Bank Account :");

        System.out.println("Original Name : " + bank.getName());
        bank.setName("Akshay Gohrava");
        System.out.println("Updated Name : " + bank.getName());


        System.out.println("Original Balance : " + bank.getBalance());
        bank.setBalance(700);
        System.out.println("Updated Balance : " + bank.getBalance());


        // The Four Pillars of Encapsulation
        // Pillar	Meaning
        // Private fields	Hide internal state
        // Public methods (getters/setters)	Controlled access
        // Validation in setters	Enforce invariants
        // Immutable where possible	Fewer moving parts
    }
}


class BankAccount {
    private String name = "Akshay";
    private int age = 24;
    private String bankname = "SBI-Bank";
    private int balance = 500;

    // this is getter -- only return value , no parameter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBankname() {
        return bankname;
    }

    public int getBalance() {
        return balance;
    }

    // this is setter -- 
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setBankName(String bankname) {
        this.bankname = bankname;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

}
