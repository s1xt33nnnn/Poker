public class Carta {
    public int numero;
    public String palo;
    static final public String[] palos = {"♠", "♥", "♦", "♣"};

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }


    @Override
    public String toString() {
        String s = "";
        if (numero == 11) {
            return ("J" + " de " + palo);
        } else if (numero == 12) {
            return ("Q" + " de " + palo);
        } else if (numero == 13) {
            return ("K" + " de " + palo);
        } else if (numero == 1) {
            return ("A" + " de " + palo);
        } else {
            return numero + " de " + palo;
        }
    }
}
