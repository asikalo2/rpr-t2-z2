package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    private double pocetna_tacka = 0;
    private double krajnja_tacka = 0;
    private boolean pripada_pocetna = false;
    private boolean pripada_krajnja = false;


/*konstruktor sa četiri parametra: početna tačka, krajnja tačka (obje tipa double),
boolean vrijednost koja označava da li početna tačka pripada intervalu ili ne,
te isto i za krajnju tačku; u slučaju da je početna tačka veća od krajnje treba baciti
izuzetak tipa IllegalArgumentException;*/

    public Interval(double poc_tacka, double kraj_tacka, boolean pripada_poc, boolean pripada_kraj) {
        pocetna_tacka = poc_tacka;
        krajnja_tacka = kraj_tacka;
        pripada_pocetna = pripada_poc;
        pripada_krajnja = pripada_kraj;
        if (pocetna_tacka > krajnja_tacka) {
            throw new IllegalArgumentException("Pocetna tacka veca od krajnje!");
        }
    }

/*konstruktor bez parametara koji kreira "null interval" kod kojeg su početna i
krajnja tačka 0 i niti jedna od njih ne pripada intervalu;*/

    public Interval() {
        pocetna_tacka = 0;
        krajnja_tacka = 0;
        pripada_pocetna = false;
        pripada_krajnja = false;
    }

    public boolean isNull() {
        if (!this.pripada_krajnja && !this.pripada_pocetna && this.pocetna_tacka == 0 && this.krajnja_tacka == 0)
            return true;

        return false;
    }


    public boolean isIn(double tacka) {

        if (tacka == krajnja_tacka && pripada_krajnja == false) return false;
        if ((tacka >= pocetna_tacka && pripada_pocetna == true) && tacka <= krajnja_tacka) return true;
        return false;
    }


    public String toString() {
        if (pocetna_tacka == 0.0 && krajnja_tacka == 0.0
                && !pripada_pocetna && !pripada_krajnja) return ("()");
        String str1 = Double.toString(pocetna_tacka);
        String str2 = Double.toString(krajnja_tacka);
        if (str1.equals("") && str2.equals("")) return ("()");
        String res = "";
        if (pripada_pocetna)
            res += "[";
        else res += "(";
        res += str1 + "," + str2;
        if (pripada_krajnja)
            res += "]";
        else res += ")";
        return res;
    }


    public boolean equals(Interval i_2) {

        if ((this.pocetna_tacka == i_2.pocetna_tacka) && (this.krajnja_tacka == i_2.krajnja_tacka) &&
                (this.pripada_pocetna == i_2.pripada_pocetna) && (this.pripada_krajnja == i_2.pripada_krajnja))
            return true;
        return false;
    }


    public static Interval intersect(Interval i, Interval i1) {
        Interval konacni = new Interval();

        if (i.pocetna_tacka >= i1.pocetna_tacka) {
            konacni.pocetna_tacka = i.pocetna_tacka;
            konacni.pripada_pocetna = true;
        }
        else {
            konacni.pocetna_tacka = i1.pocetna_tacka;
            konacni.pripada_pocetna = i1.pripada_pocetna;
        }
        if (i.krajnja_tacka <= i1.krajnja_tacka) {
            konacni.krajnja_tacka = i.krajnja_tacka;
            konacni.pripada_krajnja = i.pripada_krajnja;
        }
        else {
            konacni.krajnja_tacka = i1.krajnja_tacka;
            konacni.pripada_krajnja = i1.pripada_krajnja;
        }
        return konacni;
    }

    public Interval intersect(Interval i1) {
        Interval konacni = new Interval();

        if (this.pocetna_tacka >= i1.pocetna_tacka) {
            konacni.pocetna_tacka = this.pocetna_tacka;
            konacni.pripada_pocetna = true;
        }
        else {
            konacni.pocetna_tacka = i1.pocetna_tacka;
            konacni.pripada_pocetna = i1.pripada_pocetna;
        }
        if (this.krajnja_tacka <= i1.krajnja_tacka) {
            konacni.krajnja_tacka = this.krajnja_tacka;
            konacni.pripada_krajnja = this.pripada_krajnja;
        }
        else {
            konacni.krajnja_tacka = i1.krajnja_tacka;
            konacni.pripada_krajnja = i1.pripada_krajnja;
        }
        return konacni;
    }
/*
   public static Interval intersect(Interval i, Interval i1) {
        Interval konacni= new Interval(this.pocetna_tacka, this.krajnja_tacka, this.pripada_pocetna, this.pripada_krajnja);

        if(i.pocetna_tacka>=i1.pocetna_tacka && i.krajnja_tacka<=i1.krajnja_tacka) {
            konacni.pocetna_tacka=i.pocetna_tacka;
            konacni.krajnja_tacka=i1.krajnja_tacka;
        }
        else if (i1.pocetna_tacka>=i.pocetna_tacka && i.krajnja_tacka<=i1.krajnja_tacka) {
            konacni.pocetna_tacka=i1.pocetna_tacka;
            konacni.krajnja_tacka=i1.krajnja_tacka;
        }
        else if (i1.pocetna_tacka>=i.pocetna_tacka && i1.krajnja_tacka<=i.krajnja_tacka) {
            konacni.pocetna_tacka=i1.pocetna_tacka;
            konacni.krajnja_tacka=i.krajnja_tacka;
        }
        else if (i.pocetna_tacka>=i1.pocetna_tacka && i1.krajnja_tacka<=i.krajnja_tacka) {
            konacni.pocetna_tacka=i.pocetna_tacka;
            konacni.krajnja_tacka=i.krajnja_tacka;
        }
        return konacni;
    }*/
    /*metodu intersect koja vraća presjek dva intervala: metoda treba biti urađena kao klasična public metoda prima jedan interval)
i kao statička metoda (prima dva intervala);


također treba preklopiti metode klase Object a to su toString i equals, na način koji ima smisla za te metode.
*/
}
