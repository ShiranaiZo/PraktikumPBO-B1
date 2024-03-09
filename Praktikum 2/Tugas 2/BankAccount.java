public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double jumlah) {
        this.balance += jumlah;
        System.out.println("Deposit sejumlah " + jumlah + " berhasil. Saldo saat ini: " + this.balance);
    }

    public void withdraw(double jumlah) {
        if (jumlah > this.balance) {
            System.out.println("Saldo tidak mencukupi");
        }else{
            this.balance -= jumlah;
            System.out.println("Penarikan sejumlah " + jumlah + " berhasil. Saldo saat ini: " + this.balance);
        }
    }

    public double getBalance() {
        return this.balance;
    }
}
