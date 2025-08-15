package LDE;

import Dados.Produto;

class LDENode {
    private Produto info;
    private LDENode prox;
    private LDENode ant;

    LDENode(Produto info){
        this.info = info;
    }
    public void setProx(LDENode novoProx){
        this.prox = novoProx;
    }
    public void setAnt(LDENode novoAnt){
        this.ant = novoAnt;
    }
    public void setInfo(Produto info){
        this.info = info;
    }
    LDENode getProx(){
        return this.prox;
    }
    Produto getInfo(){
       return this.info;
    }
    LDENode getAnt(){
        return this.ant;
    }
}
