public class Charger {
    String nume;
    int pret;
    public Charger(String n, int p){
        nume=n;
        pret=p;
    }
    public void print() {
        System.out.println("Incarcatorul "+nume+" cu pretul "+pret+ " lei.");
    }
}