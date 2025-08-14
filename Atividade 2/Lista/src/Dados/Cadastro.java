package Dados;

import LDE.LDE;

public class Cadastro {
    private LDE lista;

    public Cadastro(){
        this.lista = new LDE();
    }

    public void cadastrar(String codigo){
        Produto novoProduto = new Produto(codigo);
        lista.inserir(novoProduto);
        System.out.println("Produto cadastrado com sucesso!");
    }   

    public void remover(String codigo){
        if (lista.remover(codigo)) {
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }
    
    public void exibirTodos(){
        System.out.println("\nPRODUTOS CADASTRADOS");
        lista.listar();
    }

    public Produto procurar(String codigo){
        return lista.buscar(codigo);
    }
    
    public void alterar(String codigo, String novaDescr, Double novoPreco, Integer novoEstoque) {
        Produto produto = lista.buscar(codigo);
        if (produto != null) {
            if (novaDescr != null) {
                produto.setDescr(novaDescr);
            }
            if (novoPreco != null) {
                produto.setPreco(novoPreco);
            }
            if (novoEstoque != null) {
                produto.setEstoque(novoEstoque);
            }
        }
    }

    public void consultar(String codigo){
        Produto produto = lista.buscar(codigo);
        System.out.println(produto);
    }

    public void vender(String codigo, int quantidade){
        Produto produto = lista.buscar(codigo);
        produto.setEstoque(produto.getEstoque() - quantidade);
        System.out.println("Venda feita. Total: R$ " + (produto.getPreco() * quantidade));    
    }
}
