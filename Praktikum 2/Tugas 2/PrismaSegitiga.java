public class PrismaSegitiga {
    private Segitiga alas;
    private double tinggiPrisma;

    public PrismaSegitiga(Segitiga alas, double tinggiPrisma) {
        this.alas = alas;
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume(){
        return this.alas.hitungLuas() * this.tinggiPrisma;
    }

    public double hitungLuasPermukaan(){
        return 2 * this.alas.hitungLuas() + (this.alas.getAlas() + this.alas.getTinggiSegitiga() + (Math.pow(Math.pow(this.alas.getAlas(), 2) + Math.pow(this.alas.getTinggiSegitiga(), 2), 0.5))) * this.tinggiPrisma;
    }
}
