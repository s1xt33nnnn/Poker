public class Jugador {
    private String nameJugador;
    private Mazo[] numCartas;


    public Jugador(String nameJugador) {
        this.nameJugador = nameJugador;
        this.numCartas = new Mazo[20];
    }

    public int repartirCartas(int cartas){
        for (int i = 0; i < numCartas.length; i++) {

        }return cartas;
    }


    @Override
    public String toString() {
        return nameJugador + ": " + numCartas;
    }
}
