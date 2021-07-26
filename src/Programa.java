import java.util.Scanner;

class Programa {

    public static void main(String[] args) {
        int acaoMenu = 0;

        Scanner ler = new Scanner(System.in);

        ModuloCliente dadosCliente = new ModuloCliente();
        ModuloProduto dadosProduto = new ModuloProduto();
        dadosCliente.bancoDeCliente();
        dadosProduto.bancoDeProdutos();

        ModuloGeral moduloGeral = new ModuloGeral(ler);

        while (acaoMenu != 7) {
            System.out.println("Escolha a a��o desejada:\n"
                    + "1-Cadastrar novo cliente\n"
                    + "2-Buscar por cliente\n"
                    + "3-Cadastrar novo produto\n"
                    + "4-Buscar por produto\n"
                    + "5-Cadastrar venda\n"
                    + "6-Mostrar produtos em estoque\n"
                    + "7-Sair");
            acaoMenu = ler.nextInt();

            switch (acaoMenu) {
                case 1:
                    moduloGeral.cadastrarCliente();
                    break;

                case 2:
                    moduloGeral.buscarCliente();
                    break;

                case 3:
                    moduloGeral.cadastrarProduto();
                    break;

                case 4:
                    moduloGeral.buscarProduto();
                    break;

                case 5:
                    moduloGeral.cadastrarVenda();
                    break;

                case 6:
                    moduloGeral.mostrarProdutosEmEstoque();
                    break;

                case 7:
                    System.out.println("Programa Fechado.");
                    return;

                default:
                    break;
            }
        }

        ler.close();
    }
}
