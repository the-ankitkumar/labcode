package java_program;

public class Empolyee {
	public static void main(String args[]) {
        Account[] accounts = {
                new Account(1, 10, "User1", 1000),
                new Account(2, 100, "User2", 100000),
                new Account(3, 1000, "User3", 1000000000000L)
            };

            Account maxAcc = accounts[0];
            for (int i = 1; i < accounts.length; i++) {
                if (accounts[i].getBalance() > maxAcc.getBalance()) {
                    maxAcc = accounts[i];
                }
            }


            System.out.println("User with maximum balance: " + maxAcc.getName());
	}
}

class Account{
    private int id;
    private int num;
    private String name;
    private long balance;


    public Account(int id, int num, String name, long balance) {
        this.id = id;
        this.num = num;
        this.name = name;
        this.balance = balance;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }

}
