public class Main {
    public static void main(String[] args) {
        Osoba osoba=new Uczen();
        System.out.println(osoba.Imie);
        osoba.Imie="jas";
        System.out.println(osoba.Imie);
        osoba.setWiek(12);
        System.out.println("wiek"+osoba.getWiek());
        System.out.println(osoba);
        Uczen uczen =new Uczen("jadwiga",15,123);
        System.out.println(uczen);
        System.out.println("Liczba uczniow"+ uczen.getLiczbauczniow());

    }
}