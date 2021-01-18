package u1reg;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class U1Reg {

    public static void main(String[] args) {

        int n;
        Scanner leer = new Scanner(System.in);

        System.out.println("De cuantos datos quieres tu arreglo?");
        n = leer.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inserta el dato: " + (i + 1));
            arr[i] = leer.next();
        }

        System.out.println("***** DATOS DEL ARREGLO *****");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("    " + arr[i]);
        }
        System.out.println("");
        System.out.println("\\n\\nConvertimos a la lista");
        List lista = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            lista.add(arr[i]);
        }
        System.out.println("");

        System.out.println("Los datos de la lista son: ");
        System.out.println(lista.toString());

        int opc = 1;
        Object nuevo = "";

        while (opc == 1) {
            System.out.println("¿Deseas agregar mas elementos a la lista?");
            System.out.println("1. Si 2. No");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Elemento a insertar: ");
                    nuevo = leer.next();
                    lista.add(nuevo);
                    break;
                case 2:
                    System.out.println("Nuevos elementos de la lista: ");
                    System.out.println(lista.toString());
                    break;
                default:
                    System.out.println("Opciones no validas");
                    break;
            }

        }
    }

}
