class Titik {
    private double absis;
    private double ordinat;

    private static int counterTitik;

    public Titik() {
        absis = 0;
        ordinat = 0;
        Titik.counterTitik++;
    }

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        Titik.counterTitik++;
    }

    public void setAbsis(double a){
        absis = a;
    }

    public void setOrdinat(double o){
        ordinat = o;
    }
    
    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public int getCounterTitik(){
        return counterTitik;
    }
    


}
