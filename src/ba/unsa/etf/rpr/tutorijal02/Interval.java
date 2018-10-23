package ba.unsa.etf.rpr.tutorijal02;


/*konstruktor sa četiri parametra: početna tačka, krajnja tačka (obje tipa double), boolean vrijednost koja označava da li početna tačka pripada intervalu ili ne,
te isto i za krajnju tačku; u slučaju da je početna tačka veća od krajnje treba baciti izuzetak tipa IllegalArgumentException; */

public class Interval {

    private double pocetnaTacka, krajnjaTacka;
    private boolean pocetnaPripada, krajnjaPripada;

    public Interval(double pocetnaTacka,double krajnjaTacka,boolean pocetnaPripada,boolean krajnjaPripada){
    if(pocetnaTacka>krajnjaTacka) throw new IlegalArgumentException('Pocetna tacka je veca od kranje');
    this.krajnjaTacka=krajnjaTacka;
    this.pocetnaTacka=pocetnaTacka;
    this.krajnjaPripada=krajnjaPripada;
    this.pocetnaPripada=pocetnaPripada;
    }

    public Interval() {this (pocetnaTacka = 0, krajnjaTacka = 0, pocetnaPripada=false, krajnjaPripada=false)}


    public boolean isIn(double nova) {
        if (nova<pocetnaTacka || nova>krajnjaTacka)
            return false;
        else return true;
    }


    public boolean isNull() {
        if(pocetnaTacka == 0 && krajnjaTacka == 0 && pocetnaPripada==false && krajnjaPripada==false) return true;

        return false;
    }


    /*metodu intersect koja vraća presjek dva intervala: metoda treba biti urađena kao klasična public metoda (prima jedan interval) i kao statička metoda (prima dva intervala);*/

    public void intersect() {

    }

    /*također treba preklopiti metode klase Object a to su toString i equals, na način koji ima smisla za te metode.*/

    public void toString() {

    }

    public void equals() {

    }


}
