import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int intentos = 0;

        while (intentos < 5) {

            System.out.println("Coloca un número entre 1 y 100");
            int numeroUsuario = sc.nextInt();
            intentos++;
            if (numeroUsuario == numeroSecreto) {
                System.out.println("Felicidades, el número era " + numeroSecreto);
                break;
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El número es menor, intenta de nuevo");
            } else  {
                System.out.println("El número es mayor, intenta de nuevo");
            }

        }

        if (intentos == 5) {
            System.out.println("Límite de intentos alcanzado, el número era " + numeroSecreto);
        }

    }
}