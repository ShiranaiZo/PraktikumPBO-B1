




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
// 1. ketika eksepsi terjadi, baris ke 12 tidak akan di eksekusi di karenakan ketika terjadi eksepsi tidak akan menjalankan perintah selanjutnya alias langsung keluar dan lanjut ke catch
// 2. pada baris ke 21, di eksekusi saat terjadi eksepsi yang pada contoh tersebut terjadi pada eksekusi ke 2 ketika input angka nya 13.