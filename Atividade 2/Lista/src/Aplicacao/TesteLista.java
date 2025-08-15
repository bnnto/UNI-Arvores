package Aplicacao;

import java.util.Scanner;
import Cadastro.Cadastro;

public class TesteLista {
    public static void main(String[] args) throws Exception {
        Cadastro cadastro = new Cadastro();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMENU");
            System.out.println("1- Cadastrar um novo produto.");
            System.out.println("2- Exibir todos os produtos.");
            System.out.println("3- Exibir os dados de um produto.");
            System.out.println("4- Alterar os dados de um produto.");
            System.out.println("5- Realizar a venda de um produto.");
            System.out.println("6- Remover um produto.");
            System.out.println("0- Sair.");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    System.out.print("Digite o codigo: ");
                    String codigo = scanner.nextLine();
                    if(cadastro.procurar(codigo) != null){
                        System.out.println("Ja existe um produto com este codigo.");
                    }else {
                        System.out.print("Digite a descrição: ");
                        String descr = scanner.nextLine();

                        System.out.print("Digite o preço: ");
                        Double preco = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.print("Digite o estoque: ");
                        Integer estoque = scanner.nextInt();
                        scanner.nextLine();

                        cadastro.cadastrar(codigo);
                        cadastro.alterar(codigo, descr, preco, estoque);
                    }
                    break;
                case 2:
                    cadastro.exibirTodos();
                    break;
                case 3:
                    System.out.print("Digite o codigo: ");
                    codigo = scanner.nextLine();
                    if(cadastro.procurar(codigo) != null){
                        cadastro.consultar(codigo);
                    }else {
                        System.out.println("Produto nao encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o codigo do produto a ser alterado: ");
                    codigo = scanner.nextLine();
                    if(cadastro.procurar(codigo) != null){
                        System.out.println("\nAlterar:");
                        System.out.println("1- Descrição");
                        System.out.println("2- Preço");
                        System.out.println("3- Estoque");
                        System.out.println("0- Cancelar");
                        System.out.print("Escolha: ");
                        int opcaoAlterar = scanner.nextInt();
                        scanner.nextLine();

                        String novaDescr = null;
                        Double novoPreco = null;
                        Integer novoEstoque = null;

                        switch (opcaoAlterar) {
                            case 1:
                                System.out.print("Nova descricao: ");
                                novaDescr = scanner.nextLine();
                                break;
                            case 2:
                                System.out.print("Novo preco: ");
                                novoPreco = scanner.nextDouble();
                                scanner.nextLine();
                                break;
                            case 3:
                                System.out.print("Novo estoque: ");
                                novoEstoque = scanner.nextInt();
                                scanner.nextLine();
                                break;
                            case 0:
                                System.out.println("Alteracao cancelada.");
                                break;
                            default:
                                System.out.println("Opcao invalida!");
                        }
                        
                        if (opcaoAlterar > 0 && opcaoAlterar < 4) {
                            cadastro.alterar(codigo, novaDescr, novoPreco, novoEstoque);
                        }
                    } else {
                        System.out.println("Produto nao encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("Digite o codigo do produto a ser vendido: ");
                    codigo = scanner.nextLine();
                    
                    if (cadastro.procurar(codigo) == null) {
                        System.out.println("Produto nao encontrado.");
                    } else {
                        System.out.print("Quantidade vendida: ");
                        int qtd = scanner.nextInt();
                        scanner.nextLine(); 
                        
                        if (qtd <= 0) {
                            System.out.println("Quantidade invalida.");
                        } else if (qtd > cadastro.procurar(codigo).getEstoque()) {
                            System.out.println("Estoque insuficiente.");
                        } else {
                            cadastro.vender(codigo, qtd);
                        }
                    }
                    break;
                case 6:
                    System.out.print("Digite o código do produto a remover: ");
                    codigo = scanner.nextLine();
                    if(cadastro.procurar(codigo) != null){
                        cadastro.remover(codigo);
                    }else {
                        System.out.println("Produto nao encontrado.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo..");
                    break;
                default:
                    System.out.println("Opcao invalida.");    
            }
        }while(opcao != 0);

        scanner.close();
    }
}
