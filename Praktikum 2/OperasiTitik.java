class OperasiTitik {
    private void refleksiSumbuX(Titik titik){
        titik.setOrdinat(-(titik.getOrdinat()));
    }
    private void refleksiSumbuY(Titik titik){
        titik.setAbsis(-(titik.getAbsis()));
    }
    public Titik refleksiX(Titik titik){
        this.refleksiSumbuX(titik);

        return titik;
    }
    public Titik refleksiY(Titik titik){
        this.refleksiSumbuY(titik);

        return titik;
    }
}
