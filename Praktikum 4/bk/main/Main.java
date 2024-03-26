package bk.main;

import bk.bukuFiksi.bukuNovel;
import bk.bukunonFiksi.bukuAkademik;

public class Main {
    public static void main(String[] args) {
        bukuNovel novel = new bukuNovel("Laskar Pelangi", "Andrea Hirata", "2005", "Drama", 529, 80000);
        novel.view();

        bukuAkademik bukuAkademik = new bukuAkademik("Pemrograman Java", "Rinaldi Munir", "2019", "Pemrograman", 400, 120000);
        bukuAkademik.view();
    }

}
