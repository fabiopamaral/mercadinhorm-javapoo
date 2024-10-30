import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mercadinho mercadinho = new Mercadinho();
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
    

        while (opcao != 4) {
            System.out.println();
            System.out.println("************** MERCADINHO *******************");
            System.out.println();
            System.out.println("Escolha uma opção:");
            System.out.println("1 - ÁREA DE CLIENTES");
            System.out.println("2 - ÁREA DE PRODUTOS");
            System.out.println("3 - ESTATÍSTICA");
            System.out.println("4 - Sair");
            System.out.println();

            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1 -> gerenciarClientes(mercadinho, scanner);
                case 2 -> gerenciarProdutos(mercadinho, scanner);
                case 3 -> exibirEstatisticas(mercadinho);
                case 4 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida. Informe uma opção de 1 a 4!");
            }
        }
        scanner.close();
    }

    private static void gerenciarClientes(Mercadinho mercadinho, Scanner scanner) {
        int opcaoCliente = 0;
        
        while (opcaoCliente != 5) {
            System.out.println();
            System.out.println("ÁREA DE CLIENTES:");
            System.out.println("1 - Novo cadastro");
            System.out.println("2 - Visualizar cadastros");
            System.out.println("3 - Editar cadastros");
            System.out.println("4 - Excluir cadastros");
            System.out.println("5 - Voltar");
            System.out.println();
            
            opcaoCliente = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            switch (opcaoCliente) {
                case 1 -> mercadinho.cadastrarCliente(scanner);
                case 2 -> mercadinho.visualizarClientes();
                case 3 -> mercadinho.editarCliente(scanner);
                case 4 -> mercadinho.excluirCliente(scanner);
                case 5 -> System.out.println("Voltando ao menu principal.");
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private static void gerenciarProdutos(Mercadinho mercadinho, Scanner scanner) {
        int opcaoProduto = 0;
        
        while (opcaoProduto != 5) {
            System.out.println();
            System.out.println("ÁREA DE PRODUTOS:");
            System.out.println("1 - Cadastrar um produto novo");
            System.out.println("2 - Visualizar produtos");
            System.out.println("3 - Editar lista de produtos");
            System.out.println("4 - Excluir produtos");
            System.out.println("5 - Voltar");
            System.out.println();

            opcaoProduto = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha
            
            switch (opcaoProduto) {
                case 1 -> mercadinho.cadastrarProduto(scanner);
                case 2 -> mercadinho.visualizarProdutos();
                case 3 -> mercadinho.editarProduto(scanner);
                case 4 -> mercadinho.excluirProduto(scanner);
                case 5 -> System.out.println("Voltando ao menu principal.");
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private static void exibirEstatisticas(Mercadinho mercadinho) {
        System.out.println("ESTATÍSTICAS:");
        mercadinho.exibirLucroDosProdutos();
        mercadinho.compararProdutosPorSetor();
    }
}
