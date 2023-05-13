public class Account {
    private String id;
    private String nama;
    private double balance;

    public Account(String id, String nama){
        this(id, nama, 0);
    }
    public Account(String id, String nama, int balance) {
        this.id = id;
        this.nama = nama;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName(){
        return nama;
    }
    public double getBalance(){
        return balance;
    }

    public double credit(int amount){
        balance += amount;
        return balance;
    }
    public double debit(int amount){
        if (amount < 0){
            System.out.println("Amount cannot be negative");
        }
        else if (balance < amount){
            System.out.println("Amount exceeded balance");
        }
        else{
            balance -= amount;
        }
        return balance;
    }
    public double transferTo(Account another, int amount){
        if (amount < 0){
            System.out.println("Amount cannot be negative");
        }
        else if (balance < amount){
            System.out.println("Amount exceeded balance");
        }
        else{
            another.balance += amount;
            balance -= amount;
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[id=" + id + ",name=" + nama + ",balance=" + balance + "]";
    }
}
