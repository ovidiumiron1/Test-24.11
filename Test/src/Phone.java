public class Phone {

    String nume;
    int pret;
    Strategy so;
    public Phone(String n, int p){
        nume=n;
        pret=p;
    }
    public void setSOStrategy(Strategy x) {
        so = x;
    }
    public void print() {
        if(so==null) {
            System.out.println("Telefonul " + nume + " cu pretul " + pret+ " lei.");
        }
        else {
            so.render(this, null);
        }
    }

    }
}