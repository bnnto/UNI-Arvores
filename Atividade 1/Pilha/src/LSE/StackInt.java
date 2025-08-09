package LSE;

public class StackInt {
    private StackNode topo;
    private int qntd;
    private int capacidade;

    public StackInt(int capacidade){
        this.topo = null;
        this.qntd = 0;
        this.capacidade = capacidade;
    }

    public void push(int e){
        if(isFull()){
            System.out.println("Stack Cheia!");
            return;
        }

        StackNode novo = new StackNode(e);
        novo.prox = topo;
        topo = novo;

        qntd++;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Pilha Vazia! Impossivel desempilhar.");
            return -1;
        }

        int e = topo.elemento;
        topo = topo.prox;
        qntd--;
        
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

        return topo.elemento;
    }

    public void mostrar() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!!");
            return;
        }

        System.out.print("Pilha: ");
        StackNode aux = topo;
        while (aux != null) {
            System.out.print(aux.elemento + " ");
            aux = aux.prox;
        }
        System.out.println();
    }
}