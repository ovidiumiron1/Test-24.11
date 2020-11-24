public class PretTotal {
    int phones=0;
    int chargers=0;
    int headphones=0;
    int nrBoxes=0;
    public void (Box b) {
        nrBoxes++;
    }
    public void (Charger c) {
        chargers=chargers+c.pret;
    }
    public void (Phone p) {
        phones=phones+p.pret;
    }
    public void (Headphones h) {
        headphones=headphones+h.pret;
    }
    public void afisare(){
        System.out.println("Pret total pe categoria telefoanelor: "+phones);
        System.out.println("Pret total pe categoria incarcatoarelor: "+chargers);
        System.out.println("Pret total pe categoria castilor: "+headphones);
    }
}