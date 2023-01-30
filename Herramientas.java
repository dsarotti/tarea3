import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Herramientas {

    /**
     * @return
     */
    public static long medirAccesos(ArrayList<Integer> arrayList, int size) {
        long inicioTimer = System.nanoTime();
        accesosInverso(arrayList, size);
        long finTimer = System.nanoTime();
        return (finTimer - inicioTimer);
    }

    public static long medirAccesos(LinkedList<Integer> lList, int size) {
        long inicioTimer = System.nanoTime();
        accesosInverso(lList);
        long finTimer = System.nanoTime();
        return (finTimer - inicioTimer);
    }

    /**
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
     * @param arrayList
     * @param size
     */
    public static void inserciones(ArrayList<Integer> arrayList, int size) {
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
    }

    /**
     * @param lList
     * @param size
     */
    public static void inserciones(LinkedList<Integer> lList, int size) {
        for (int i = 0; i < size; i++) {
            lList.add(i);
        }
    }

    /**
     * @param arrayList
     * @param size
     */
    public static void accesosInverso(ArrayList<Integer> arrayList, int size) {
        for (int i = size; i >= 0; i--) {
            arrayList.get(i);
        }
    }

    public static void accesosInverso(LinkedList<Integer> lList) {
        ListIterator<Integer> iterador = lList.listIterator();
        while (iterador.hasNext())
            iterador.next();
        while (iterador.hasPrevious())
            iterador.previous();
    }

    /**
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
