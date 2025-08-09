package app;

import LSE.StackInt;

public class App {
    public static void main(String[] args) throws Exception {
        StackInt pilha = new StackInt(10);

        pilha.push(8);
        pilha.push(9);
        pilha.push(10);

        System.out.println("Topo: " + pilha.top());

        while(!pilha.isEmpty()){
            int elemento = pilha.pop();
            System.out.println("Desempilhei: "+elemento);
        }

        pilha.pop();
        
        /*pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        pilha.push(6);
        pilha.push(7);
        pilha.push(8);
        pilha.push(9);
        pilha.push(10);
        pilha.push(11);
        */
    }
}
