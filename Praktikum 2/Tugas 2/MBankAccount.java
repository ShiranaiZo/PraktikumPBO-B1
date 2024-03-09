public class MBankAccount {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(1000);

        System.out.println("Saldo sebelum transaksi: " + b.getBalance());
        b.deposit(500);
        b.withdraw(2000);
        System.out.println("Saldo setelah transaksi: " + b.getBalance());
    }
}
