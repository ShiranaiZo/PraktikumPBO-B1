class MOperasiTitik {
    public static void main(String[] args) {
        Titik titik;
        OperasiTitik n = new OperasiTitik();

        titik = new Titik(4.0, 4.0);
        
        System.out.println("titik(" + titik.getAbsis() +", "+ titik.getOrdinat() +")");
        System.out.println("titik setelah refleksi sb X: titik(" + titik.getAbsis() +", "+ (n.refleksiX(titik)).getOrdinat() +")");
        System.out.println("titik setelah refleksi sb Y: titik(" + (n.refleksiY(titik)).getAbsis() +", "+ titik.getOrdinat() +")");
    }
}
