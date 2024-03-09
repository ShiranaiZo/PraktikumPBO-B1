public class MPrismaSegitiga {
    public static void main(String[] args) {
        Segitiga s = new Segitiga(3, 4);
        PrismaSegitiga p = new PrismaSegitiga(s, 5);
        
        System.out.println("Volume prisma segitiga: " + p.hitungVolume());
        System.out.println("Luas permukaan prisma segitiga: " + p.hitungLuasPermukaan());
    }
}
