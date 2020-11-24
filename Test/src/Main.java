import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        System.out.println("Punctul 1 ");
        Structura struct = new Structura();
        Box b1 = new Box("Phones");
        struct.add(b1);
        Phone p1 = new Phone("Iphone 11 PRO MAX",6700);
        struct.add(p1);
        Phone p2 = new Phone("Samsung Galaxy S20 Ultra",6000);
        struct.add(p2);
        Phone p3 = new Phone("Motorola Edge",2500);
        struct.add(p3);
        Box b2 = new Box("Accesorii telefon");
        struct.add(b2);
        Charger c1 = new Charger("220V",250);
        struct.add(c1);
        Charger c2 = new Charger("230V",260);
        struct.add(c2);
        Headphones h = new Headphones("Airpods",1100);
        struct.add(h);
        struct.print();

        System.out.println("\nPunctul 2 ");
        p1.setSOStrategy(new SistOpAndroid());
        p2.setSOStrategy(new SistOpIOS());
        p3.setSOStrategy(new SistOpWP());
        struct.print();

        System.out.println("\nPunctul 3 ");
        PretTotal pret = new PretTotal();
        struct.accept(pret);
        pret.afisare();

    }
}