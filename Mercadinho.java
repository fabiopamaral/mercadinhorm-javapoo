import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mercadinho {
    private List<Cliente> clientes;
    private List<Produto> produtos;
    private int proximoId;
    private int idProduto;

    public Mercadinho() {
        this.clientes = new ArrayList<>();
        this.produtos = new ArrayList<>();
        this.proximoId = 1;
        this.idProduto = 1;
    }

    public void cadastrarCliente(Scanner scanner) {
        System.out.println();
        System.out.println("Cadastro de novo cliente:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        Cliente cliente = new Cliente(proximoId++, nome, cpf, endereco);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void visualizarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado. Primeiro, adicione um cliente!");
        } else {
            System.out.println("Lista de clientes:");
            System.out.println();
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    public void editarCliente(Scanner scanner) {
        visualizarClientes();
        System.out.println("Informe o id do cliente que deseja editar as informações: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Cliente clienteEncontrado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado == null) {
            System.out.println("Cliente não encontrado");
            return;
        }

        System.out.println("Cliente encontrado: " + clienteEncontrado);
        System.out.println();
        System.out.println("Selecione o campo que deseja editar:");
        System.out.println("1 - Nome");
        System.out.println("2 - CPF");
        System.out.println("3 - Endereço");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Informe o novo nome: ");
                String novoNome = scanner.nextLine();
                clienteEncontrado.setNome(novoNome);
                break;
        
            case 2:
                System.out.println("Informe o novo CPF: ");
                String novoCpf = scanner.nextLine();
                clienteEncontrado.setCpf(novoCpf);
                break;
            
            case 3:
                System.err.println("Informe o novo endereço: ");
                String novoEndereco = scanner.nextLine();
                clienteEncontrado.setEndereco(novoEndereco);
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }

        System.out.println("Dados do cliente atualizados com sucesso!");
    }

    public void excluirCliente(Scanner scanner) {
        visualizarClientes();
        System.out.println("Informe o id do cliente que você deseja deletar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        Cliente clienteEncontrado = null;

            for (Cliente cliente : clientes) {
                if (cliente.getId() == id) {
                    clienteEncontrado = cliente;
                    break;
                }
            }

            if (clienteEncontrado == null) {
                System.out.println("Cliente não encontrado");
                return;
            }

            System.out.println("Cliente encontrado: " + clienteEncontrado);
            System.out.println("Confirma a exclusão? (S/N)");
            String confirmacao = scanner.nextLine().trim().toUpperCase();

            if (confirmacao.equals("S")) {
                clientes.remove(clienteEncontrado);
                System.out.println("Cliente deletado com sucesso!");
            } else {
                System.out.println("Exclusão cancelada!");
            }
    }

    public void cadastrarProduto(Scanner scanner) {
        System.out.println();
        System.out.println("Cadastro de novo produto:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Setor: ");
        String setor = scanner.nextLine();
        System.out.print("Preço de custo: ");
        double precoCusto = scanner.nextDouble();
        System.out.print("Preço de venda: ");
        double precoVenda = scanner.nextDouble();
        System.out.print("Número de vendas: ");
        int numeroVendas = scanner.nextInt();
        scanner.nextLine(); 
    
        Produto produto = new Produto(idProduto++, nome, marca, setor, precoCusto, precoVenda, numeroVendas);
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso.");
    }
    

    public void visualizarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Lista de produtos:");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    public void editarProduto(Scanner scanner) {
        System.out.println();
        visualizarProdutos();
        System.out.println();
        System.out.println("Informe o id do produto em que deseja editar as informações: ");
        int id = scanner.nextInt();
        scanner.nextLine();
    
        Produto produtoEncontrado = null;
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtoEncontrado = produto;
                break;
            }
        }
    
        if (produtoEncontrado == null) {
            System.out.println("Produto não encontrado!");
            return;
        }
    
        System.out.println("Produto encontrado: " + produtoEncontrado);
        System.out.println("Selecione o campo que deseja editar:");
        System.out.println("1 - Nome");
        System.out.println("2 - Setor");
        System.out.println("3 - Preço de Custo");
        System.out.println("4 - Preço de Venda");
        System.out.println("5 - Número de Vendas");
        System.out.println("6 - Marca");

        int opcao = scanner.nextInt();
        scanner.nextLine();
    
        switch (opcao) {
            case 1:
                System.out.println("Informe o novo nome do produto: ");
                String novoNome = scanner.nextLine();
                produtoEncontrado.setNome(novoNome);
                break;
    
            case 2:
                System.out.println("Informe o novo setor: ");
                String novoSetor = scanner.nextLine();
                produtoEncontrado.setSetor(novoSetor);
                break;
    
            case 3:
                System.out.println("Informe o novo preço de custo: ");
                double novoPrecoCusto = scanner.nextDouble();
                produtoEncontrado.setPrecoCusto(novoPrecoCusto);
                break;
    
            case 4:
                System.out.println("Informe o novo preço de venda: ");
                double novoPrecoVenda = scanner.nextDouble();
                produtoEncontrado.setPrecoVenda(novoPrecoVenda);
                break;
    
            case 5:
                System.out.println("Informe o novo número de vendas: ");
                int novoNumeroVendas = scanner.nextInt();
                produtoEncontrado.setNumeroVendas(novoNumeroVendas);
                break;

            case 6:
                System.out.println("Informe a nova marca: ");
                String novaMarca = scanner.nextLine();
                produtoEncontrado.setMarca(novaMarca);
    
            default:
                System.out.println("Opção inválida.");
                break;
        }
    
        System.out.println("Dados do produto atualizados com sucesso.");
        visualizarProdutos();
    }
    

    public void excluirProduto(Scanner scanner) {
        visualizarProdutos();
        System.out.println("Informe o id do produto em que você deseja deletar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        Produto produtoEncontrado = null;

            for (Produto produto : produtos) {
                if (produto.getId() == id) {
                    produtoEncontrado = produto;
                    break;
                }
            }

            if (produtoEncontrado == null) {
                System.out.println("Produto não encontrado");
                return;
            }

            System.out.println("Produto encontrado: " + produtoEncontrado);
            System.out.println("Confirma a exclusão? (S/N)");
            String confirmacao = scanner.nextLine().trim().toUpperCase();

            if (confirmacao.equals("S")) {
                produtos.remove(produtoEncontrado);
                System.out.println("produto deletado com sucesso!");
            } else {
                System.out.println("Exclusão cancelada!");
            }
    }

    public void exibirLucroDosProdutos() {
    if (produtos.isEmpty()) {
        System.out.println();
        System.out.println("Nenhum produto cadastrado. Não é possível calcular o lucro.");
        return;
    }

    double lucroTotal = 0;

    for (Produto produto : produtos) {
        double lucroProduto = (produto.getPrecoVenda() - produto.getPrecoCusto()) * produto.getNumeroVendas();
        lucroTotal += lucroProduto;
    }

    System.out.printf("Lucro total dos produtos cadastrados: R$ %.2f%n", lucroTotal);
}

public void exibirVendasPorMarca() {
    if (produtos.isEmpty()) {
        System.out.println("Nenhum produto cadastrado. Não é possível exibir vendas por marca.");
        return;
    }

    ArrayList<String> marcas = new ArrayList<>();
    ArrayList<Integer> vendasPorMarca = new ArrayList<>();

    for (Produto produto : produtos) {
        String marca = produto.getMarca();
        int vendas = produto.getNumeroVendas();

        int index = marcas.indexOf(marca);

        if (index != -1) {
            vendasPorMarca.set(index, vendasPorMarca.get(index) + vendas);
        } else {
            marcas.add(marca);
            vendasPorMarca.add(vendas);
        }
    }

    System.out.println("Vendas por marca:");
    for (int i = 0; i < marcas.size(); i++) {
        System.out.println("Marca: " + marcas.get(i) + " - Vendas: " + vendasPorMarca.get(i));
    }
}
}

