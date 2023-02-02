import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Herramientas {

    /**
     * Mide en nanosegundos el tiempo que se tarda en insertar @param size elementos
     * en un ArrayList.
     * 
     * @param inicioTimer
     * @param finTimer
     * @param arrayList
     * @param size
     * @return el tiempo que se ha tardado.
     */
    public static long medirInserciones(ArrayList<Integer> arrayList, int size) {
        long inicioTimer;
        long finTimer;
        long acumulado = 0;
        for (int i = 0; i < size; i++) {
            inicioTimer = System.nanoTime();
            arrayList.add(i);
            finTimer = System.nanoTime();
            acumulado = acumulado + (finTimer - inicioTimer);
        }
        return acumulado;
    }

    /**
     * Mide en nanosegundos el tiempo que se tarda en insertar @param size elementos
     * en una lista enlazada.
     * 
     * @param inicioTimer
     * @param finTimer
     * @param lList
     * @param size
     * @return el tiempo que se ha tardado.
     */
    public static long medirInserciones(LinkedList<Integer> lList, int size) {
        long inicioTimer;
        long finTimer;
        long acumulado = 0;

        for (int i = 0; i < size; i++) {
            inicioTimer = System.nanoTime();
            lList.add(i);
            finTimer = System.nanoTime();
            acumulado = acumulado + (finTimer - inicioTimer);
        }
        return acumulado;
    }

    /**
     * Mide en nanosegundos el tiempo que se tarda en acceder a los elementos en un
     * ArrayList.
     * 
     * @param arrayList
     * @param size
     * @return el tiempo que se ha tardado.
     */
    public static long medirAccesos(ArrayList<Integer> arrayList) {
        long inicioTimer;
        long finTimer;
        long acumulado = 0;
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            inicioTimer = System.nanoTime();
            arrayList.get(i);
            finTimer = System.nanoTime();
            acumulado = acumulado + (finTimer - inicioTimer);
        }
        return acumulado;
    }

    /**
     * Mide en nanosegundos el tiempo que se tarda en acceder a los elementos en una
     * lista enlazada.
     * 
     * @param lList
     * @return el tiempo que se ha tardado.
     */
    public static long medirAccesos(LinkedList<Integer> lList) {
        long inicioTimer;
        long finTimer;
        long acumulado = 0;
        ListIterator<Integer> iterador = lList.listIterator();
        while (iterador.hasNext()) {
            inicioTimer = System.nanoTime();
            iterador.next();
            finTimer = System.nanoTime();
            acumulado = acumulado + (finTimer - inicioTimer);
        }
        while (iterador.hasPrevious()) {
            inicioTimer = System.nanoTime();
            iterador.previous();
            finTimer = System.nanoTime();
            acumulado = acumulado + (finTimer - inicioTimer);
        }
        return acumulado;
    }

    /**
     * Devuelve en nanosegundos el tiempo que se tarda en ejecutar el método
     * contains sobre todos los elementos de un ArrayList.
     * 
     * @param arrayList
     * @return el tiempo que se ha tardado.
     */
    public static long medirContains(ArrayList<Integer> arrayList) {
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
     * @return el tiempo que se ha tardado.
     */
    public static long medirContains(LinkedList<Integer> lList) {
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
     * Mide en nanosegundos el tiempo que se tarda en eliminar todos los elementos
     * de un ArrayList utilizando remove() y empezando por el principio.
     * 
     * @param arrayList
     * @return el tiempo que se ha tardado.
     */
    public static long medirEliminaciones(ArrayList<Integer> arrayList) {
        long acumulado = 0;
        long inicioTimer;
        long finTimer;
        for (int i = 0; i < arrayList.size(); i++) {
            inicioTimer = System.nanoTime();
            arrayList.remove(0);
            finTimer = System.nanoTime();
            acumulado = acumulado + (finTimer - inicioTimer);
        }
        return acumulado;
    }

    /**
     * Mide en nanosegundos el tiempo que se tarda en eliminar todos los elementos
     * de una lista enlazada utilizando removeFirst().
     * 
     * @param arrayList
     * @return el tiempo que se ha tardado.
     */
    public static long medirEliminaciones(LinkedList<Integer> lList) {
        long acumulado = 0;
        long inicioTimer;
        long finTimer;
        for (int i = 0; i < lList.size(); i++) {
            inicioTimer = System.nanoTime();
            lList.removeFirst();
            finTimer = System.nanoTime();
            acumulado = acumulado + (finTimer - inicioTimer);
        }
        return acumulado;
    }

    /**
     * Mide en nanosegundos el tiempo que se tarda en eliminar todos los elementos
     * de un ArrayList utilizando remove() y empezando por el final.
     * 
     * @param arrayList
     * @return el tiempo que se ha tardado.
     */
    public static long medirEliminacionesInversa(ArrayList<Integer> arrayList) {
        long acumulado = 0;
        long inicioTimer;
        long finTimer;
        for (int i = arrayList.size()-1; i >= 0; i--) {
            inicioTimer = System.nanoTime();
            arrayList.remove(i);
            finTimer = System.nanoTime();
            acumulado = acumulado + (finTimer - inicioTimer);
        }
        return acumulado;
    }

    /**
     * Mide en nanosegundos el tiempo que se tarda en eliminar todos los elementos
     * de una lista enlazada utilizando removeLast().
     * 
     * @param arrayList
     * @return el tiempo que se ha tardado.
     */
    public static long medirEliminacionesInversa(LinkedList<Integer> lList) {
        long acumulado = 0;
        long inicioTimer;
        long finTimer;
        for (int i = 0; i < lList.size(); i++) {
            inicioTimer = System.nanoTime();
            lList.removeLast();
            finTimer = System.nanoTime();
            acumulado = acumulado + (finTimer - inicioTimer);
        }
        return acumulado;
    }

    /**
     * Calcula la media de los valores guardados en el array @param tiempos .
     * 
     * @param tiempos
     * @param repeticiones
     * @return la media de los valores.
     */
    public static double media(long[] tiempos, int repeticiones) {
        long tiempoAcumulado = 0;
        for (int i = 0; i < repeticiones; i++) {
            tiempoAcumulado = tiempoAcumulado + tiempos[i];
        }
        return ((1f * tiempoAcumulado) / repeticiones);
    }
}
