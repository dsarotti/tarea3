import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main{
    public static void main(String[] args) {
        final int SIZE = 1000;

        ArrayList<Integer> arrList = new ArrayList<>();
        LinkedList<Integer> linList = new LinkedList<>();

        long inicio;
        long fin;

        // inserciones en ArrayList
        inicio=System.nanoTime();
        for (int i =0; i<SIZE;i++){
            arrList.add(i);        
        }
        fin = System.nanoTime();
        System.out.println("inserciones ArrayList = " + (fin-inicio) + " nanosegundos." );


        //inserciones en Linked List
        inicio=System.nanoTime();
        for (int i =0; i<SIZE;i++){
            linList.add(i);
        }
        fin = System.nanoTime();
        System.out.println("inserciones LinkedList = " + (fin-inicio) + " nanosegundos." );

        ListIterator<Integer> iterador= linList.listIterator();
        while (iterador.hasNext()) iterador.next();

        inicio = System.nanoTime();
        while (iterador.hasPrevious()) iterador.previous();
        fin = System.nanoTime();
        System.out.println("Acceso inverso Linked List = " + (fin-inicio) + " nanosegundos." );


    }   
}