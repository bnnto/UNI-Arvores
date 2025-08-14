package LDE;

import Dados.Produto;

class LDENode {
    private Produto info;
    private LDENode prox;

    LDENode(Produto info){
        this.info = info;
    }
    void setProx(LDENode novoProx){
        this.prox = novoProx;
    }
    void setInfo(Produto info){
        this.info = info;
    }
    LDENode getProx(){
        return this.prox;
    }
    Produto getInfo(){
       return this.info;
    }
}
