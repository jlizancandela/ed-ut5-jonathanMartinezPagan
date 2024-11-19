package com.jonmarti.ed_ut5_proyecto;

/*
 * Programa que solicita al usuario día y mes del año y muestra si fecha correcta
 */
import java.util.Scanner;

public class edUt5JonathanMartinez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Llamamos a Scanner para entrada en teclado
        int mes;
        int numDias;
        // Se pide la entrada de datos desde teclado
        System.out.print("Introduzca día: ");
        numDias = sc.nextInt();

        System.out.print("Introduzca mes: ");
        mes = sc.nextInt();

        boolean fecha = false; // Se verifica si fecha correcta

        fecha = isFecha(mes, numDias, fecha);
        // Imprime en pantalla resultado
        if (fecha) {
            System.out.printf("Fecha ok %d/%d\n",numDias,mes);
        }
        else {
            System.out.println("Fecha incorrecta");
        }


    }

    private static boolean isFecha(int mes, int numDias, boolean fecha) {
        if (mes >= 1 && mes <= 12) {
            switch (mes) { //iniciamos la instruccion switch para múltiples alternativas
                case 4: case 6: case 9: case 11: // Asignamos los meses de 30 días
                    if (numDias >= 1 && numDias <= 30) {
                        fecha = true;
                    }
                    break;
                case 2: //Caso especial mes febrero con 28 días
                    if (numDias >= 1 && numDias <= 28) {
                        fecha = true;
                    }
                    break;
                default: // Resto de meses a 31 días
                    if (numDias >= 1 && numDias <= 31) {
                        fecha = true;
                    }
                    break;
            }
        }
        return fecha;
    }
}
