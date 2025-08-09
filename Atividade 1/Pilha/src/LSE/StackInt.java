package LSE;

public class StackInt {
    private StackNode inicio;
    private StackNode fim;
    private int qntd;
    private int capacidade;

    public StackInt(int capacidade){
        this.inicio = null;
        this.fim = null;
        this.qntd = 0;
        this.capacidade = capacidade;
    }

    public void push(int e){
        if(isFull()){
            System.out.println("Stack Cheia!");
            return;
        }

        StackNode novo = new StackNode(e);
        novo.prox = inicio;
        inicio = novo;

        if(qntd == 0){
            fim = novo;
        }

        qntd++;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Pilha Vazia! Impossivel desempilhar.");
            return -1;
        }

        int e = inicio.elemento;
        inicio = inicio.prox;
        qntd--;
        
        if(qntd == 0){  
            fim = null;
        }

        return e;
    }   

    public boolean isEmpty(){
        return qntd == 0;
    }

    public boolean isFull(){
        return qntd == capacidade;

    }

    public int top(){
        if(isEmpty()){
            System.out.println("Pilha Vazia!!");
            return -1;
        }

        return inicio.elemento;
    }
}