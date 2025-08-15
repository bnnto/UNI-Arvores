package Dados;

public class Produto implements Comparable<Produto>{
    private String codigo;
    private String descr;
    private double preco;
    private int estoque;

    public Produto(String codigo){
        this.codigo = codigo;
    }
    public void setDescr(String descr){
        this.descr = descr;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public String getDescr(){
        return this.descr;
    }
    public double getPreco(){
        return this.preco;
    }
    public int getEstoque(){
        return this.estoque;
    }
    public String toString(){
        return "Codigo: " + this.codigo +
               ", Descricao: " + this.descr +
               ", Preco: R$ " + this.preco +
               ", Estoque: " + this.estoque;
    }
    @Override
    public int compareTo(Produto p){
        return this.codigo.compareTo(p.codigo);
    }
}
