import java.io.Console;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        final int SIZE;
        final int REPETICIONES;
        long[] tiempos;
        double media;

        Console c = System.console();

        ArrayList<Integer> arrList = new ArrayList<>();
        LinkedList<Integer> linList = new LinkedList<>();

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
            tiempos[i] = Herramientas.medirAccesos(arrList);
        // // calcular media:
        media = Herramientas.media(tiempos, REPETICIONES);
        tiempos = new long[REPETICIONES];
        // reporte:
        System.out.println("ArrayList - Media calculada al realizar " + SIZE + " accesos " + REPETICIONES + " veces: "
                + media + " nanosegundos.");

        // Pruebas: Acceso en sentido inverso con LinkedList
        for (int i = 0; i < REPETICIONES; i++)
            tiempos[i] = Herramientas.medirAccesos(linList);
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

        // Pruebas: contains() en ArrayList
        System.out.println("__________contains()__________");
        for (int i = 0; i < REPETICIONES; i++) {
            tiempos[i] = Herramientas.medirContains(arrList);
        }
        // // calcular media
        media = Herramientas.media(tiempos, REPETICIONES);
        tiempos = new long[REPETICIONES];
        // reporte:
        System.out.println("ArrayList - Media calculada al ejecutar contains() de todos los elementos " + REPETICIONES
                + " veces: " + media + " nanosegundos.");

        // Pruebas: contains() con LinkedList
        for (int i = 0; i < REPETICIONES; i++) {
            tiempos[i] = Herramientas.medirContains(linList);
        }
        // // calcular media
        media = Herramientas.media(tiempos, REPETICIONES);
        tiempos = new long[REPETICIONES];
        // reporte:
        System.out.println("LinkedList - Media calculada al ejecutar contains() de todos los elementos " + REPETICIONES
                + " veces: " + media + " nanosegundos.");

        // -------------------------------------------------------------------

        // -----------------------Pruebas de eliminación----------------------
        // Eliminar los elementos de la lsita comenzando por el principio y por el
        // final.

        System.out.println("__________ELIMINACIONES__________");
        
        // Pruebas: eleminacion empezando por el principio en ArrayList
        for (int i = 0; i < REPETICIONES; i++) {
            tiempos[i] = Herramientas.medirEliminaciones(arrList);
        }
        // // calcular media
        media = Herramientas.media(tiempos, REPETICIONES);
        tiempos = new long[REPETICIONES];
        // reporte:
        System.out.println("ArrayList - Media calculada al eliminar todos los elementos empezando por el principio: "
                + media + " nanosegundos.");

        // Pruebas: eleminacion empezando por el final en ArrayList
        Herramientas.medirInserciones(arrList, SIZE); // utilizo este método para volver a llenar el arrayList
        for (int i = 0; i < REPETICIONES; i++) {
            tiempos[i] = Herramientas.medirEliminacionesInversa(arrList);
        }
        // // calcular media
        media = Herramientas.media(tiempos, REPETICIONES);
        tiempos = new long[REPETICIONES];
        // reporte:
        System.out.println("ArrayList - Media calculada al eliminar todos los elementos empezando por el final: "
                + media + " nanosegundos.");

        
        // Pruebas: eleminacion empezando por el principio en LinkedList
        for (int i = 0; i < REPETICIONES; i++) {
            tiempos[i] = Herramientas.medirEliminaciones(linList);
        }
        // // calcular media
        media = Herramientas.media(tiempos, REPETICIONES);
        tiempos = new long[REPETICIONES];
        // reporte:
        System.out.println("LinkedList - Media calculada al eliminar todos los elementos empezando por el principio: "
                + media + " nanosegundos.");

        // Pruebas: eleminacion empezando por el final en LinkedList
        Herramientas.medirInserciones(linList, SIZE); // utilizo este método para volver a llenar la LinkedList
        for (int i = 0; i < REPETICIONES; i++) {
            tiempos[i] = Herramientas.medirEliminacionesInversa(linList);
        }
        // // calcular media
        media = Herramientas.media(tiempos, REPETICIONES);
        // reporte:
        System.out.println("LinkedList - Media calculada al eliminar todos los elementos empezando por el final: "
                + media + " nanosegundos.");

    }
}