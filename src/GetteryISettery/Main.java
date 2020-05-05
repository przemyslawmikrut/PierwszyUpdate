package GetteryISettery;

public class Main {
    public static void main(String[] args)
    {
    Uczen u1 = new Uczen();
        u1.setNazwisko("Nowak");

        System.out.println(u1.getNazwisko());
        u1.setNazwisko("K");
        System.out.println(u1.getNazwisko());

        System.out.println(u1.getOcena());
        u1.setOcena(5);

        System.out.println(u1.getOcena());

        u1.setOcena(7);

        System.out.println(u1.getOcena());
    }
}
