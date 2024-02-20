class Titik {
    double absis;
    double ordinat;

    static int counterTitik;

    Titik() {
        absis = 0;
        ordinat = 0;
        Titik.counterTitik++;
    }

    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        Titik.counterTitik++;
    }

    void setAbsis(double a){
        absis = a;
    }

    void setOrdinat(double o){
        ordinat = o;
    }
    
    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    int getCounterTitik(){
        return counterTitik;
    }

}
