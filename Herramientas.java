import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Herramientas {

    /**
     * Inserta @param size elementos en un ArrayList.
     * 
     * @param arrayList
     * @param size
     */
    public static void inserciones(ArrayList<Integer> arrayList, int size) {
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
    }

    /**
     * Inserta @param size elementos en una lista enlazada.
     * 
     * @param lList
     * @param size
     */
    public static void inserciones(LinkedList<Integer> lList, int size) {
        for (int i = 0; i < size; i++) {
            lList.add(i);
        }
    }

    /**
     * Accede a todos los elementos de un ArrayList empezando por el final.
     * 
     * @param arrayList
     * @param size
     */
    public static void accesosInverso(ArrayList<Integer> arrayList, int size) {
        for (int i = size-1; i >= 0; i--) {
            arrayList.get(i);
        }
    }

    /**
     * Accede a todas los elementos de una lista enlazada empezando por el final.
     * 
     * @param lList
     */
    public static void accesosInverso(LinkedList<Integer> lList) {
        ListIterator<Integer> iterador = lList.listIterator();
        while (iterador.hasNext())
            iterador.next();
        while (iterador.hasPrevious())
            iterador.previous();
    }

    /**
     * Devuelve en nanosegundos el tiempo que se tarda en ejecutar el método
     * contains sobre todos los elementos de un ArrayList
     * 
     * @param arrayList
     * @return
     */
    public static long pruebaContains(ArrayList<Integer> arrayList) {
        long acumulado = 0;
        long inicioTimer;
        long finTimer;
        for (int i = 0; i < arrayList.size(); i++) {
            inicioTimer = System.nanoTime();
            arrayList.contains(i);
            finTimer = System.nanoTime();
            acumulado = acumulado + (finTimer - inicioTimer);
        }
        return acumulado;
    }

    /**
     * Devuelve en nanosegundos el tiempo que se tarda en ejecutar el método
     * contains sobre todos los elementos de una lista enlazada.
     * 
     * @param LList
     * @return
     */
    public static long pruebaContains(LinkedList<Integer> lList) {
        long acumulado = 0;
        long inicioTimer;
        long finTimer;
        for (int i = 0; i < lList.size(); i++) {
            inicioTimer = System.nanoTime();
            lList.contains(i);
            finTimer = System.nanoTime();
            acumulado = acumulado + (finTimer - inicioTimer);
        }
        return acumulado;
    }

    /**
     * Mide en nanosegundos el tiempo que se tarda en insertar @param size elementos
     * en un ArrayList.
     * 
     * @param inicioTimer
     * @param finTimer
     * @param arrayList
     * @param size
     * @return
     */
    public static long medirInserciones(ArrayList<Integer> arrayList, int size) {
        long inicioTimer;
        long finTimer;
        inicioTimer = System.nanoTime();
        inserciones(arrayList, size);
        finTimer = System.nanoTime();
        return (finTimer - inicioTimer);
    }

    /**
     * Mide en nanosegundos el tiempo que se tarda en insertar @param size elementos
     * en una lista enlazada.
     * 
     * @param inicioTimer
     * @param finTimer
     * @param lList
     * @param size
     * @return
     */
    public static long medirInserciones(LinkedList<Integer> lList, int size) {
        long inicioTimer;
        long finTimer;
        inicioTimer = System.nanoTime();
        inserciones(lList, size);
        finTimer = System.nanoTime();
        return (finTimer - inicioTimer);
    }

    /**
     * Mide en nanosegundos el tiempo que se tarda en acceder a los elementos en un
     * ArrayList.
     * 
     * @param arrayList
     * @param size
     * @return
     */
    public static long medirAccesos(ArrayList<Integer> arrayList, int size) {
        long inicioTimer = System.nanoTime();
        accesosInverso(arrayList, size);
        long finTimer = System.nanoTime();
        return (finTimer - inicioTimer);
    }

    /**
     * Mide en nanosegundos el tiempo que se tarda en acceder a los elementos en una
     * lista enlazada.
     * 
     * @param lList
     * @param size
     * @return
     */
    public static long medirAccesos(LinkedList<Integer> lList, int size) {
        long inicioTimer = System.nanoTime();
        accesosInverso(lList);
        long finTimer = System.nanoTime();
        return (finTimer - inicioTimer);
    }

    /**
     * Calcula la media de los valores guardados en el array @param tiempos .
     * 
     * @param tiempos
     * @param repeticiones
     * @return
     */
    public static double media(long[] tiempos, int repeticiones) {
        long tiempoAcumulado = 0;
        for (int i = 0; i < repeticiones; i++) {
            tiempoAcumulado = tiempoAcumulado + tiempos[i];
        }
        return ((1f * tiempoAcumulado) / repeticiones);
    }
}
