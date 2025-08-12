package Stack;

class StackNode {
    private Integer info;
    private StackNode prox;

    StackNode(Integer valor){
        this.info = valor;
    }
    void setInfo(Integer valor) {
        this.info = valor;
    }
    Integer getInfo() {
        return this.info;
    }
    void setProx(StackNode novoProx) {
        this.prox = novoProx;
    }
    StackNode getProx() {
        return this.prox;
    }
}
