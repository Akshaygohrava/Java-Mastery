import java.io.*;
import java.util.*;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String m) { super(m); }
}

class Account {
    private double balance;
    Account(double b) { balance = b; }

    void withdraw(double amt) throws InsufficientFundsException {
        if (amt <= 0) throw new IllegalArgumentException("amt > 0");
        if (amt > balance) throw new InsufficientFundsException(
            "Need " + (amt - balance) + " more");
        balance -= amt;
    }
    double getBalance() { return balance; }
}

public class BankApp {
    static void processFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                processLine(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + path);
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }

    static void processLine(String line) {
        try {
            String[] parts = line.split(",");
            double amt = Double.parseDouble(parts[1]);
            new Account(100).withdraw(amt);
            System.out.println("OK: " + line);
        } catch (NumberFormatException e) {
            System.err.println("Bad number in: " + line);
        } catch (InsufficientFundsException e) {
            System.err.println("Rejected: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Malformed line: " + line);
        }
    }

    public static void main(String[] args) {
        processFile("transactions.txt");
    }
}