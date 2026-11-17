public class Main {
    public static void main(String[] args) {
        Carta c = new Carta(13, "♠" );
        System.out.println(c);

        Mazo mazo = new Mazo(1);
        System.out.println("Mazo sin barajar: " + mazo);
        mazo.barajar();
        System.out.println("Mazo barajado: " + mazo);
        System.out.println("Esta carta es la extraída: "+mazo.extraerCarta());
    }
}
