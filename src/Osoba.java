public abstract class Osoba {
    public String Imie;//dostoepne wszedzie
    private Integer wiek;//hermetyzacja dostep tylko w klasie
    //protected w tej klasie i klasach potomnych(tylko w jave w ramach pakietu)
    //brak modyfikatora dostepu
    public Osoba() {
        Imie ="" ;
        wiek=0;
    }

    public Osoba(String Imie, Integer wiek) {
        this.Imie = Imie;
        this.wiek = wiek;
    }
    //metody dostepowe

    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        if (wiek<0|| wiek>110){
            this.wiek=0;
        }


        this.wiek = wiek;

    }

    @Override
    public String toString() {
        return "Osoba" +
                "Imie='" + Imie + '\'' +
                ", wiek=" + wiek

                ;
    }
}
