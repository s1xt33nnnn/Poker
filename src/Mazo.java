public class Mazo {
    public Carta[] cartas;
    private int numCartas;

    public Mazo(int numBarajas) {
        numCartas = 52 * numBarajas;
        cartas = new Carta[numCartas];
        int counter = 0;
        for (int i = 1; i <= numBarajas; i++) {
            for (int j = 0; j < Carta.palos.length; j++) {
                for (int k = 1; k <= 13; k++) {
                    cartas[counter] = new Carta(k,Carta.palos[j]);
                    counter++;
                }
            }
        }
    }

    public void barajar(){
        for (int i = 0; i < cartas.length * 5; i++) {
            int n1 = (int) (Math.random() * cartas.length);
            int n2 = (int) (Math.random() * cartas.length);
            Carta temp = cartas[n1];
            cartas[n1] = cartas[n2];
            cartas[n2] = temp;
        }
    }

    public Carta extraerCarta(){
        Carta carta = cartas[numCartas-1];
        numCartas--;
        return carta;
    }


    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < 3; i++) {
            boolean first = true;
            for (int j = 0; j < numCartas; j++) {
                if (cartas[j].getPalo() == Carta.palos[i]){
                    if (first){
                        s += cartas[j];
                        first = false;
                    }else {
                        s += ", " + cartas[j];
                    }
                }
            }
        }
        return s;
    }
}
