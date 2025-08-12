package Stack;

public class StackInt {
    private StackNode topo;

    public void push(Integer valor){
        StackNode novo;
        novo = new StackNode(valor);
        novo.setProx(this.topo);
        this.topo = novo;
    }

    public Integer pop(){
        StackNode aux;
        aux = this.topo;
        this.topo = this.topo.getProx();
        return aux.getInfo();
    }   

    public boolean isEmpty(){
        return this.topo == null;
    }

    public boolean isFull(){
        return false;
    }

    public int top(){
        return this.topo.getInfo();
    }
}