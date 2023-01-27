import java.io.Console;
import java.util.ArrayList;
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
        // Se insertará en cada una de las listas tantos elementos (números enteros) como su tamaño.
        // Pruebas: inserciones en ArrayList
        for (int i = 0; i < REPETICIONES; i++)
            tiempos[i] = medirInserciones(inicioTimer, finTimer, arrList, SIZE);
        // //calcular la media
        media = media(tiempos, REPETICIONES);
        // reporte:
        System.out.println(
                "ArrayList - Media calculada al realizar " + SIZE + " inserciones " + REPETICIONES + " veces: " + media
                        + " nanosegundos.");

        // Pruebas: inserciones en Linked List
        for (int i = 0; i < REPETICIONES; i++)
            tiempos[i] = medirInserciones(inicioTimer, finTimer, linList, SIZE);
        // // calcular media
        media = media(tiempos, REPETICIONES);
        // reporte:
        System.out.println(
                "LinkedList - Media calculada al realizar " + SIZE + " inserciones " + REPETICIONES + " veces: " + media
                        + " nanosegundos.");
        // -------------------------------------------------------------------

        // -------------------------Pruebas de acceso-------------------------

        ListIterator<Integer> iterador = linList.listIterator();
        while (iterador.hasNext())
            iterador.next();

        inicioTimer = System.nanoTime();
        while (iterador.hasPrevious())
            iterador.previous();
        finTimer = System.nanoTime();
        System.out.println("Acceso inverso Linked List = " + (finTimer - inicioTimer) + " nanosegundos.");
    }
    private static double medirAccesos(){
        return (Double) null;
    }

    private static void accesosInverso(ArrayList<Integer> arr, int size){
        for (int i=size ; i>=0 ; i--){
            arr.get(i);
        }
    }

    private static long medirInserciones(long inicioTimer, long finTimer, ArrayList<Integer> arrList, int size) {
        inicioTimer = System.nanoTime();
        inserciones(arrList, size);
        finTimer = System.nanoTime();
        return (finTimer - inicioTimer);
    }

    private static double media(long[] tiempos, int repeticiones) {
        long tiempoAcumulado = 0;
        for (int i = 0; i < repeticiones; i++) {
            tiempoAcumulado = tiempoAcumulado + tiempos[i];
        }
        return ((1f * tiempoAcumulado) / repeticiones);
    }

    private static long medirInserciones(long inicioTimer, long finTimer, LinkedList<Integer> lList, int size) {
        inicioTimer = System.nanoTime();
        inserciones(lList, size);
        finTimer = System.nanoTime();
        return (finTimer - inicioTimer);
    }

    private static void inserciones(ArrayList<Integer> arr, int size) {
        for (int i = 0; i < size; i++) {
            arr.add(i);
        }
    }

    private static void inserciones(LinkedList<Integer> lList, int size) {
        for (int i = 0; i < size; i++) {
            lList.add(i);
        }
    }

}