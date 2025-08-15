package LDE;

import Dados.Produto;

public class LDE {
    private LDENode primeiro;
    private LDENode ultimo;
    private int qtd;

    public void inserir(Produto produto){
        LDENode novo;
        novo = new LDENode(produto);
        if(primeiro == null){
            primeiro = novo;
            ultimo = novo;
        } else if(produto.compareTo(primeiro.getInfo()) < 0){
            novo.setProx(primeiro);
            primeiro = novo;
        } else if(produto.compareTo(ultimo.getInfo()) >= 0){
            ultimo.setProx(novo);
            ultimo = novo;
        } else{
            LDENode anterior = primeiro;
            LDENode atual = primeiro.getProx();

            while (atual != null && produto.compareTo(atual.getInfo()) >= 0){
                anterior = atual;
                atual = atual.getProx();
            }

            anterior.setProx(novo);
            novo.setProx(atual);
        }   
        qtd++;
    }

    public boolean remover(String codigo){
        if(primeiro.getInfo().getCodigo().equals(codigo)){
            primeiro = primeiro.getProx();
            if(primeiro == null){
                ultimo = null;
            }
            qtd--;
            return true;
        }

        LDENode anterior = primeiro;
        LDENode atual = primeiro.getProx();

        while (atual != null) {
            if (atual.getInfo().getCodigo().equals(codigo)) {
                anterior.setProx(atual.getProx());
                if (atual == ultimo) ultimo = anterior;
                qtd--;
                return true;
            }
            anterior = atual;
            atual = atual.getProx();
        }

        return false;
    }

    public boolean isEmpty(){
        if (this.qtd == 0){
            return true;
        } else{
            return false;
        }
    }

    public Produto buscar(String codigo){
        LDENode atual = this.primeiro;
        Produto produtoTemp = new Produto(codigo);

        if(this.isEmpty() == true){
            return null;
        } 

        while(atual != null){
            if(atual.getInfo().compareTo(produtoTemp) == 0){
                return atual.getInfo();
            } else if(atual.getInfo().compareTo(produtoTemp) > 0){
                return null;
            } else{
                atual = atual.getProx();
            }
        }
        return null;
    }

    public void listar(){
        LDENode atual = primeiro;
        while(atual != null){
            System.out.println(atual.getInfo());
            atual = atual.getProx();
        }       
    }
}


