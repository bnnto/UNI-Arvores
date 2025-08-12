package UsoPilha;

import Stack.StackInt;

public class TestePilha {
    public static void main(String[] args) throws Exception {
        StackInt p1 = new StackInt();

        if(p1.isFull() == false){
            p1.push(20);
        }
        if(p1.isFull() == false){
            p1.push(35);
        }
        if(p1.isFull() == false){
            p1.push(50);
        }

        System.out.println("Topo: " + p1.top());

        while(p1.isEmpty() == false){
            System.out.println("Desempilhei: " + p1.pop());
        }
    }
}
