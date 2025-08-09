package LSE;

public class QueueInt {
    private QueueNode inicio;
    private QueueNode fim;
    private int qntd;
    private int capacidade;

    public QueueInt(int capacidade){
        this.inicio = null;
        this.fim = null;
        this.qntd = 0;
        this. capacidade = capacidade;
    }

    public void enqueue(int e){
        if(isFull()){
            System.out.println("Queue Cheia! Impossivel Enfileirar");
            return;
        }

        QueueNode novo = new QueueNode(e);
        
        if(isEmpty()){
            inicio = fim = novo;
        }else{
            fim.prox = novo;
            fim = novo;
        }
        qntd++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue Vazia! Impossivel Desenfileirar");
            return -1;
        }

        int e = inicio.elemento;
        inicio = inicio.prox;
        if(inicio == null){
            inicio = null;
        }
        qntd--;
        return e;
    }

    public boolean isEmpty(){
        return qntd == 0;
    }

    public boolean isFull(){
        return qntd >= capacidade;
    }

    public int head(){
        if(isEmpty()){
            System.out.println("Queue Vazia!");
            return -1;
        }

        return inicio.elemento;
    }

    public void mostrarFila(){
        if(isEmpty()){
            System.out.println("Queue Vazia!");
            return;
        }

        QueueNode atual = inicio;
        while(atual != null){
            System.out.println(atual.elemento + "");
            atual = atual.prox;
        }

        System.out.println();
    }

}
