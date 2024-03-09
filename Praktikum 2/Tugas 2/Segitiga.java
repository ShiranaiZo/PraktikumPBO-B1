/**
 * Segitiga
 */
public class Segitiga {

    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas(){
        return this.alas;
    }

    public double getTinggiSegitiga(){
        return this.tinggi;
    }

    public double hitungLuas(){
        return 0.5 * this.alas * this.tinggi;
    }
}