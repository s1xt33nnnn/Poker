public class Mazo {
    public Carta[] cartas;

    public Mazo(int numBarajas) {
        cartas = new Carta[52*numBarajas];
        int counter = 0;
        for (int i = 1; i < numBarajas; i++) {
            for (int j = 0; j < Carta.palos.length; j++) {
                for (int k = 1; k < 13; k++) {
                    cartas[counter] = new Carta(k,Carta.palos[j]);
                    counter++;
                }
            }
        }
    }

    public void barajar(int barajados){
        for (int i = 0; i < cartas.length * 5; i++) {
            int n1 = (int) (Math.random() * cartas.length);
            int n2 = (int) (Math.random() * cartas.length);
            Carta temp = cartas[n1];
            cartas[n1] = cartas[n2];
            cartas[n2] = temp;
        }
    }

    public void extraerCarta(){

    }


    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < cartas.length; i++) {
            s += cartas[i];
        }
        return s;
    }
}
