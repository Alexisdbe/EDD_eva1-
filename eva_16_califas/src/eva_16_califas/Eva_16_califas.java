/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_16_califas;

import java.util.Scanner;

/**
 *
 * @author burci
 */
public class Eva_16_califas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] grupos;//No se sabe el numero de grupos pq el usuario los pone
        System.out.println("¿Cuantos grupos tiene la escuela?");
        int cant = input.nextInt();
        input.nextLine();
        grupos = new int[cant][];
       for(int i = 0; i < grupos.length; i++){
           System.out.println("¿Cuantos estudiantes tiene el grupo?" + (i + 1) + "?");
           int estudiantes = input.nextInt();
           input.nextLine();
           grupos[i] = new int[estudiantes];
           
       }
       for(int i = 0; i < grupos.length; i++){
           System.out.println("+++++++ grupo" + (i + 1) + "++++++++");
           for(int j = 0; j < grupos[i].length; j++){
               System.out.println("Calificacion del estudiantes" + (j + 1) + ":");
               int califa = input.nextInt();
               grupos[i][j] = califa;
               input.nextLine();
           }
       }
      // imprimir calificaciones y promedio
for (int i = 0; i < grupos.length; i++) {
    int suma = 0;
    System.out.println("Grupo " + (i + 1));

    for (int j = 0; j < grupos[i].length; j++) {
        System.out.println("Alumno " + (j + 1) + ": " + grupos[i][j]);
        suma += grupos[i][j];
    }

    double promedio = (double) suma / grupos[i].length;
    System.out.println("Promedio del grupo: " + promedio);
    System.out.println();
}

    }
    
}
