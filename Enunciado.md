# Tarea 4
Se han de crear dos listas: ArrayList y LinkedList.
Se pedirá por pantalla un tamaño ara ambas listas
Se realizarán las siguientes operaciones con cada lista:

1. Se insertará en cada una de la listas tantos elementos (números enteros) como su tamaño.
2. Recorreremos cada lista desde el final al principio.
3. Comprobar (contains()) que contiene todos los elementos.
4. Eliminar los elementos de la lsita:
    1. Comenzando por el principio.
    2. Comenzando por el final.

Mediremos el tiempo que se tarda en relizar cada operación (para todos los elementos).

**Nota:** Para medir los tiempos se recomienda usar 'LocalTime'.

```java
// Apunto el tiempo en este instante: t0
long t0 = System.nanoTime();
//ejecuto lo que quiero medir

//Apunto el tiempo en este instante: t1
long t1 = System.nanoTime();

//Calculo el tiempo transcurrito t1-t0
long tt = t1 - t0;