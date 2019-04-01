package sample;

public class Artikal {
    public void setSifra( String sifra) {
        this.sifra= sifra;
        if(sifra== null) {
            throw new IllegalArgumentException();
        }
    }
    public void setNaziv(String naziv) {
        this.naziv=naziv;
        if(naziv== null) {
            throw new IllegalAccessException();
        }
    }
    public void setCijena( double cijena) {
        this.cijena = cijena;
        if(cijena<=0) {
            throw new IllegalAccessException();
        }
    }
    public String getSifra() {
        return sifra;
    }
    public String getNaziv(){
        return naziv;
    }
    public double getCijena() {
        return cijena;
    }
    private String sifra;
    private String naziv;
    private double cijena;
     public Artikal() {

     }
     public Artikal (String ulaz) {
         String[] ulazi= ulaz.split(regex ",");
         setSifra(ulazi[0]);
         setNaziv(ulazi[1]);
         setCijena(Double.parseDouble(ulazi [2]));
     }

    public String toString() {
        return sifra + ", " + naziv + ", " + cijena;
    }
    public Artikal( String unos) {

    }
    public boolean equals (Object o) {
        Artikal artikal = (Artikal) o;
        if(!this.sifra.equals(artikal.getSifra())) return false;
        if(!this.naziv.equals(artikal.getNaziv())) return false;
        if(this.cijena != artikal.getCijena()) return false;
        return true;
    }
}
