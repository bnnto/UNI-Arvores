package Dados;

public class Produto implements Comparable<Produto>{
    private String codigo;
    private String descr;
    private Double preco;
    private Integer estoque;

    public Produto(String codigo){
        this.codigo = codigo;
        this.descr = "";
        this.preco = 0.0;
        this.estoque = 0;
    }
    public void setDescr(String descr){
        this.descr = descr;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }
    public void setEstoque(Integer estoque){
        this.estoque = estoque;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public String getDescr(){
        return this.descr;
    }
    public Double getPreco(){
        return this.preco;
    }
    public Integer getEstoque(){
        return this.estoque;
    }
    public String toString(){
        return "Codigo: " + codigo +
               ", Descricao: " + descr +
               ", Preco: R$ " + preco +
               ", Estoque: " + estoque;
    }
    @Override
    public int compareTo(Produto outro){
        return this.codigo.compareTo(outro.getCodigo());
    }
}
