




public record AngkaSial() {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+ " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// Jawaban:
// 1. pada baris ke 12, di eksekusi 1 kali dikarenakan input angka nya bukan 13 alias tidak masuk ke dalam if yang menjalankan throw untuk memicu AngkaSialException. sedangkan pada eksekusi ke 2, di karenakan input angkanya 13, maka masuk ke fungsi if, lalu throw akan di jalankan untuk memicu AngkaSialException sehingga tidak akan menjalankan perintah selanjutnya (karena langsung masuk ke catch).
// 2. pada baris ke 21, di eksekusi saat terjadi AngkaSialException pada eksekusi ke 2 ketika input angka nya 13.