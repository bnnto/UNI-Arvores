package app;

import LSE.QueueInt;

public class App {
    public static void main(String[] args) throws Exception {
        QueueInt fila = new QueueInt(6);

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);
        fila.enqueue(5);
        fila.enqueue(6);

        System.out.println("Head " + fila.head());

        System.out.println("Removido: " + fila.dequeue());

        fila.mostrarFila();

        while(!fila.isEmpty()){
            System.out.println("Removendo: "+ fila.dequeue());
        }

        fila.mostrarFila();

        fila.dequeue(); 
    }
}
