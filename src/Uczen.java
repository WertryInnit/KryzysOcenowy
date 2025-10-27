public class Uczen extends Osoba {
    private int NrUcznia;
    private  static int liczbauczniow=0;
//uczen jest klasa potomna klasy osoba
    //dzidziciczenie pozderki
    public Uczen(String Imie, Integer wiek, int nrUcznia) {
        super(Imie, wiek);//wywoływanie klasy
        NrUcznia = nrUcznia;
        liczbauczniow++;
        NrUcznia=liczbauczniow;
    }

    public Uczen() {liczbauczniow++;
        NrUcznia=liczbauczniow;
    }

    public void setNrUcznia(int nrUcznia) {
        NrUcznia = nrUcznia;

    }

    public static void setLiczbauczniow(int liczbauczniow) {
        Uczen.liczbauczniow = liczbauczniow;

    }

    public int getNrUcznia() {
        return NrUcznia;
    }

    public static int getLiczbauczniow() {
        return liczbauczniow;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "NrUcznia=" + NrUcznia +
                ", Imie='" + Imie + '\'' +
                ",wiek = "+getWiek();
    }
}
