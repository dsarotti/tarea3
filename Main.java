import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        final int SIZE;
        final int REPETICIONES;
        long[] tiempos;
        double media;

        Console c = System.console();

        ArrayList<Integer> arrList = new ArrayList<>();
        LinkedList<Integer> linList = new LinkedList<>();

        long inicioTimer = 0;
        long finTimer = 0;

        // pedir tamaño de las listas con el que se va a trabajar.
        System.out.print("Indica el tamaño de las listas: ");
        SIZE = Integer.parseInt(c.readLine());

        // pedir el numero de repeticiones de las pruebas
        System.out.print("Indica el numero de veces que se han de repetir las pruebas: ");
        REPETICIONES = Integer.parseInt(c.readLine());
        tiempos = new long[REPETICIONES];

        // -----------------------Pruebas de inserción------------------------
        // Se insertará en cada una de las listas tantos elementos (números enteros)
        // como su tamaño.
        // Pruebas: inserciones en ArrayList
        System.out.println("__________INSERCIONES__________");
        for (int i = 0; i < REPETICIONES; i++)
            tiempos[i] = Herramientas.medirInserciones(arrList, SIZE);
        // //calcular la media
        media = Herramientas.media(tiempos, REPETICIONES);
        tiempos = new long[REPETICIONES];
        // reporte:
        System.out.println(
                "ArrayList - Media calculada al realizar " + SIZE + " inserciones " + REPETICIONES + " veces: " + media
                        + " nanosegundos.");

        // Pruebas: inserciones en Linked List
        for (int i = 0; i < REPETICIONES; i++)
            tiempos[i] = Herramientas.medirInserciones(linList, SIZE);
        // // calcular media
        media = Herramientas.media(tiempos, REPETICIONES);
        tiempos = new long[REPETICIONES];
        // reporte:
        System.out.println(
                "LinkedList - Media calculada al realizar " + SIZE + " inserciones " + REPETICIONES + " veces: " + media
                        + " nanosegundos.");
        // -------------------------------------------------------------------

        // -------------------------Pruebas de acceso-------------------------
        // Recorreremos cada lista desde el final al principio.
        // Pruebas: Acceso en sentido inverso con ArrayList
        System.out.println("__________ACCESOS__________");
        for (int i = 0; i < REPETICIONES; i++)
            tiempos[i] = Herramientas.medirAccesos(arrList, SIZE);
        // // calcular media:
        media = Herramientas.media(tiempos, REPETICIONES);
        tiempos = new long[REPETICIONES];
        // reporte:
        System.out.println("ArrayList - Media calculada al realizar " + SIZE + " accesos " + REPETICIONES + " veces: "
                + media + " nanosegundos.");

        // Pruebas: Acceso en sentido inverso con LinkedList
        for (int i = 0; i < REPETICIONES; i++)
            tiempos[i] = Herramientas.medirAccesos(linList, SIZE);
        // // calcular media
        media = Herramientas.media(tiempos, REPETICIONES);
        tiempos = new long[REPETICIONES];
        // reporte:
        System.out.println("LinkedList - Media calculada al realizar " + SIZE + " accesos " + REPETICIONES + " veces: "
                + media + " nanosegundos.");
        // -------------------------------------------------------------------

        // -------------------------Prueba contains()-------------------------
        // Comprobar (contains()) que contiene todos los elementos.
        // Para esta prueba utilizaremos un valor incremental para cada iteración, que
        // es el elemento que debería haber en cada iteración.

        // Pruebas: contains() en con ArrayList
        System.out.println("__________contains()__________");
        for (int i = 0; i < REPETICIONES; i++) {
            tiempos[i] = Herramientas.pruebaContains(arrList);
        }
        // // calcular media
        media = Herramientas.media(tiempos, REPETICIONES);
        tiempos = new long[REPETICIONES];
        // reporte:
        System.out.println("ArrayList - Media calculada al ejecutar contains() de todos los elementos " + REPETICIONES
                + " veces: " + media + " nanosegundos.");

        // Pruebas: contains() en con LinkedList
        System.out.println("__________contains()__________");
        for (int i = 0; i < REPETICIONES; i++) {
            tiempos[i] = Herramientas.pruebaContains(linList);
        }
        // // calcular media
        media = Herramientas.media(tiempos, REPETICIONES);
        tiempos = new long[REPETICIONES];
        // reporte:
        System.out.println("LinkedList - Media calculada al ejecutar contains() de todos los elementos " + REPETICIONES
                + " veces: " + media + " nanosegundos.");

        
    }
}