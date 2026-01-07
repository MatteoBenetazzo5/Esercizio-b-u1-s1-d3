package Es1;

public class Main {

    public static void main(String[] args) {

        String parola = "pasta";
        boolean pari = stringaPariDispari(parola);
        System.out.println("La stringa è pari? " + pari);

        int anno = 2037;
        boolean bisestile = annoBisestile(anno);
        System.out.println("L'anno è bisestile? " + bisestile);
    }

    public static boolean stringaPariDispari(String s) {
        if (s.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 400 == 0) {
            return true;
        } else if (anno % 100 == 0) {
            return false;
        } else if (anno % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

