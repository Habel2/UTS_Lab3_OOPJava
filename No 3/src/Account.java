public class Account {
    private String id;
    private String nama;
    private int balance;

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
    public int getBalance(){
        return balance;
    }

    public int credit(int amount){
        balance += amount;
        return balance;
    }
    public int debit(int amount){
        if (balance < amount){
            System.out.println("Amount exceeded balance");
        }
        else{
            balance -= amount;
        }
        return balance;
    }
    public int transferTo(Account another, int amount){
        if (balance < amount){
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
