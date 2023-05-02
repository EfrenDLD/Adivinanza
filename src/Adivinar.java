import java.util.Random;
import java.util.Scanner;

public class Adivinar{
    public void Adivinador() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int puntos = 0;
        int errores = 0;
        int nivel = 1;

        while (nivel <= 4 && errores < 3) {
            switch (nivel){
                case 1:
                    char letra = (char) (random.nextInt(26) + 'a');
                    System.out.println("Adivina la letra entre a y z");
                    char intentoLetra = scanner.next().charAt(0);
                    if (intentoLetra == letra) {
                        puntos += 10;
                        nivel++;
                        errores = 0;
                        System.out.println("¡Correcto!");
                    } else {
                        errores++;
                        System.out.println("Incorrecto.\nLa letra correcta era " + letra);
                    }
                    break;
                case 2:
                    int numero = random.nextInt(1000) + 1;
                    System.out.println("Adivina el número entre 1 y 1000");
                    int intentoNumero = scanner.nextInt();
                    if (intentoNumero == numero) {
                        puntos += 20;
                        nivel++;
                        errores = 0;
                        System.out.println("¡Correcto!");
                    } else {
                        errores++;
                        System.out.println("Incorrecto. \nEl número correcto era " + numero);
                    }
                    break;
                case 3:
                    int numeroPar = random.nextInt(500) * 2;
                    System.out.println("Adivina el número par entre 0 y 1000");
                    int intentoPar = scanner.nextInt();
                    if (intentoPar == numeroPar) {
                        puntos += 30;
                        nivel++;
                        errores = 0;
                        System.out.println("¡Correcto!");
                    } else {
                        errores++;
                        System.out.println("Incorrecto.\nEl número par correcto era " + numeroPar);
                    }
                    break;
                case 4:
                    int numeroImpar = random.nextInt(500) * 2 + 1;
                    System.out.println("Adivina el número impar entre 1 y 1000");
                    int intentoImpar = scanner.nextInt();
                    if (intentoImpar == numeroImpar) {
                        puntos += 40;
                        nivel++;
                        errores = 0;
                        System.out.println("¡Correcto!");
                    } else {
                        errores++;
                        System.out.println("Incorrecto. \nEl número impar correcto era " + numeroImpar);
                    }
                    break;
                default:
                    System.out.println("Error: nivel inválido");
                    return;
            }
        }
        System.out.println("Puntos totales: " + puntos);
        System.out.println("Perdió " + errores + " veces");
    }
}

