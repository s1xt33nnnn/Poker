import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mazo mazo = new Mazo(1);
        mazo.barajar();
        boolean gameOver = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Tell me your name: ");
        Jugador jugadorGame = new Jugador(input.next());
        for (int i = 1; i <= 2; i++) {
            jugadorGame.recibirCartas(mazo.extraerCarta());
        }
        System.out.println(jugadorGame);
        System.out.println(jugadorGame.getPuntuacion());
        while (!gameOver) {

            if (jugadorGame.getPuntuacion() >= 21) {
                gameOver = true;
                System.out.println();
            } else {
                Scanner input1 = new Scanner(System.in);
                System.out.println("¿ Quieres otra carta ? S / N");
                String respuesta = input1.nextLine().toUpperCase();
                if (respuesta.equals("S")) {
                    jugadorGame.recibirCartas(mazo.extraerCarta());
                    System.out.println(jugadorGame);
                    System.out.println(jugadorGame.getPuntuacion());
                } else if (respuesta.equals("N")){
                    System.out.println("Cagon");
                    gameOver = true;
                }
            }

        }
    }
}
