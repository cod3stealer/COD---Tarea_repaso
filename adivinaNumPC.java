package boletin11;

import javax.swing.JOptionPane;
import java.util.Random;

public class adivinaNumPC {
    public static void main(String[] args) {
        Random rand = new Random();
        //Genero numero random entre 1 y 50
        int numeroAdivinar = rand.nextInt(50) + 1;

        int intentos = 0;
        int numeroTecleado = 0;

        while (true) {
            numeroTecleado = Integer.parseInt(JOptionPane.showInputDialog("Adiviña o número (entre 1 e 50):"));

            if (numeroTecleado < 1 || numeroTecleado > 50) {
                JOptionPane.showMessageDialog(null, "Por favor, introduce un número válido entre 1 e 50.");
                continue;
            }

            int distancia = Math.abs(numeroAdivinar - numeroTecleado);

            if (distancia > 20) {
                JOptionPane.showMessageDialog(null, "Moito lonxe. Intenta de novo.");
            } else if (distancia >= 10 && distancia <= 20) {
                JOptionPane.showMessageDialog(null, "Lonxe. Intenta de novo.");
            } else if (distancia > 5 && distancia < 10) {
                JOptionPane.showMessageDialog(null, "Preto. Intenta de novo.");
            } else if (distancia <= 5) {
                JOptionPane.showMessageDialog(null, "Moito preto. Intenta de novo.");
            }

            intentos++;

            if (numeroTecleado == numeroAdivinar) {
                JOptionPane.showMessageDialog(null, "Parabéns! Adiviñaches o número en " + intentos + " intentos.");
                break;
            }
        }
    }
}
