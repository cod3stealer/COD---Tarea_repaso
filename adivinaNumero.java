package boletin11;

import javax.swing.JOptionPane;

public class adivinaNumero {
    public static void main(String[] args) {
        // Declaro una variable de tipo INT que recoge un valor pasado por pantalla con
        // JOptionPane el cual es String por defecto así que lo paso a INT con Integer.parseInt
        /*
         * modificacion
         */
        int numeroAdivinar = Integer.parseInt(JOptionPane.showInputDialog("Xogador 1: Teclea o número a adiviñar (entre 1 e 50):"));
        while (numeroAdivinar < 1 || numeroAdivinar > 50) {
            numeroAdivinar = Integer.parseInt(JOptionPane.showInputDialog("Xogador 1: Teclea o número a adiviñar (entre 1 e 50):"));
        }
        int maxIntentos = Integer.parseInt(JOptionPane.showInputDialog("modasdaisdia: Introduce o número máximo de intentos:"));
        while (maxIntentos < 1 || maxIntentos > 50) {
            maxIntentos = Integer.parseInt(JOptionPane.showInputDialog("Xogador 1: Introduce o número máximo de intentos:"));
        }

        // declaracion de atributos
        int intentos = 0;
        int numeroTecleado = 0;

        // Mientras que el numero de intentos sea menos al máximo Y el numero tecleado sea diferente al que hay que adivinar:
        while (intentos < maxIntentos && numeroTecleado != numeroAdivinar) {
            numeroTecleado = Integer.parseInt(JOptionPane.showInputDialog("Xogador 2: Adiviña o número (entre 1 e 50):"));
            while (numeroTecleado < 1 || numeroTecleado > 50) {
                numeroTecleado = Integer.parseInt(JOptionPane.showInputDialog("Xogador 2: Adiviña o número (entre 1 e 50):"));
            }

            if (numeroTecleado < numeroAdivinar)
                JOptionPane.showMessageDialog(null, "O número é maior. Intenta de novo.");
            else if (numeroTecleado > numeroAdivinar)
                JOptionPane.showMessageDialog(null, "O número é menor. Intenta de novo.");
            else
                JOptionPane.showMessageDialog(null, "Parabéns! Adiviñaches o número.");

            intentos++;
        }

        if (intentos == maxIntentos && numeroTecleado != numeroAdivinar) {
            JOptionPane.showMessageDialog(null, "Non adiviñaches o número en " + maxIntentos + " intentos. O número era " + numeroAdivinar + ".");
        }
    }
}

