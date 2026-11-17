public class Jugador {
    private String nameJugador;
    private Carta[] cartas;
    private int numCartas;


    public Jugador(String nameJugador) {
        this.nameJugador = nameJugador;
        numCartas = 0;
        cartas = new Carta[20];
        for (int i = 0; i < cartas.length; i++) {
            cartas[i] = null;
        }
    }

    public void recibirCartas(Carta carta) {
        cartas[numCartas] = carta;
        numCartas++;
    }

    public int getPuntuacion() {
        int puntuacion = 0;
        for (int i = 0; i < numCartas; i++) {
            int numero = cartas[i].getNumero();
            if (numero >= 2 && numero <= 10) {
                puntuacion += numero;
            } else {
                if (numero >= 11) {
                    puntuacion += 10;
                } else {
                    puntuacion += 11;
                    if (puntuacion > 21) {
                        puntuacion -= 10;
                    }
                }
            }
        }return puntuacion;
    }

    @Override
    public String toString() {
        String s = nameJugador + ": ";
        boolean first = true;
        for (int i = 0; i < numCartas; i++) {
            if (first) {
                s += cartas[i];
                first = false;
            } else {
                s += ", " + cartas[i];
            }
        }
        return s;
    }
}
