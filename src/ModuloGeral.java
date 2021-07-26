import java.util.Scanner;

public class ModuloGeral {

    ModuloCliente dadosCliente = new ModuloCliente();
    ModuloProduto dadosProduto = new ModuloProduto();

    Scanner ler;

    public ModuloGeral(Scanner ler) {
        dadosCliente.bancoDeCliente();
        dadosProduto.bancoDeProdutos();

        this.ler = ler;
    }

    public void cadastrarCliente() {

        int aux = 0;
        int qntdClientes;

        System.out.println("Quantos clientes deseja cadastar?");
        qntdClientes = ler.nextInt();

        while (aux < qntdClientes) {
            dadosCliente.cadastrarCliente();
            aux++;
        }
        aux = 0;
        System.out.println("Clientes cadastrados com sucesso!");
    }

    public void buscarCliente() {

        int acao;
        String alterar;

        Cliente buscaCliente = dadosCliente.buscarCliente();
        if (buscaCliente != null) {
            System.out.println("Nome: " + buscaCliente.getNome() + "\n"
                    + "Endereco: " + buscaCliente.getEndereco() + "\n"
                    + "Teleone: " + buscaCliente.getTelefone() + "\n"); //mostra os dados dos cliente
            System.out.println("Deseja alterar os dados do cliente?\n"
                    + "0-Sim\n"
                    + "1-N�o\n");
            acao = ler.nextInt();
            //para alterar dados do cliente
            if (acao == 0) {
                acao = 0;
                //para alterar o nome
                System.out.println("Deseja alterar o nome?\n"
                        + "0-Sim\n"
                        + "1-N�o\n");
                acao = ler.nextInt();
                if (acao == 0) {
                    System.out.println("Qual nome deseja colocar?\n");
                    ler.nextLine();
                    alterar = ler.nextLine();
                    buscaCliente.setNome(alterar);
                    acao = 0;
                    alterar = null;
                }
                //para alterar o endere�o
                System.out.println("Deseja alterar o endere�o?\n"
                        + "0-Sim\n"
                        + "1-N�o\n");
                acao = ler.nextInt();
                if (acao == 0) {
                    System.out.println("Qual endere�o deseja colocar?\n");
                    ler.nextLine();
                    alterar = ler.nextLine();
                    buscaCliente.setEndereco(alterar);
                    acao = 0;
                    alterar = null;
                }
                //para alterar o telefone
                System.out.println("Deseja alterar o telefone?\n"
                        + "0-Sim\n"
                        + "1-N�o\n");
                acao = ler.nextInt();
                if (acao == 0) {
                    System.out.println("Qual telefone deseja colocar?\n");
                    ler.nextLine();
                    alterar = ler.nextLine();
                    buscaCliente.setTelefone(alterar);
                    acao = 0;
                    alterar = null;
                }
                //mostra os novos dados do cliente
                System.out.println("\nNome: " + buscaCliente.getNome() + "\n"
                        + "Endereco: " + buscaCliente.getEndereco() + "\n"
                        + "Teleone: " + buscaCliente.getTelefone() + "\n");
            }
        }
    }

    public void cadastrarProduto() {

        int aux = 0;
        int qntdProdutos;

        System.out.println("Quantos produtos deseja cadastar?");
        qntdProdutos = ler.nextInt();

        while (aux < qntdProdutos) {
            dadosProduto.cadastrarProduto();
            aux++;
        }
        System.out.println("Produtos cadastrados com sucesso!");
        aux = 0;
    }

    public void buscarProduto() {

        int acao;
        int alterarEstoque;
        String alterar;

        Produto buscaProduto = dadosProduto.buscarProduto();
        if (buscaProduto != null) {
            System.out.println("Produto: " + buscaProduto.getProduto() + "\n"
                    + "Descri��o: " + buscaProduto.getDescricao() + "\n"
                    + "Valor: R$" + buscaProduto.getValor() + "\n"
                    + "Porcentagem de lucro: " + buscaProduto.getLucro() + "%\n"
                    + "Quantidade em estoque: " + buscaProduto.getEstoque() + "\n");
            //para alterar os dados do produto
            System.out.println("Deseja alterar os dados do produto?\n"
                    + "0-Sim\n"
                    + "1-N�o\n");
            acao = ler.nextInt();

            if (acao == 0) {
                acao = 0;
                //para alterar o nome
                System.out.println("Deseja alterar o nome do produto?\n"
                        + "0-Sim\n"
                        + "1-N�o\n");
                acao = ler.nextInt();
                if (acao == 0) {
                    System.out.println("Qual nome deseja colocar?");
                    ler.nextLine();
                    alterar = ler.nextLine();
                    buscaProduto.setProduto(alterar);
                    acao = 0;
                    alterar = null;
                }
                //para alterar a descri��o
                System.out.println("Deseja alterar a descri��o do produto?\n"
                        + "0-Sim\n"
                        + "1-N�o\n");
                acao = ler.nextInt();
                if (acao == 0) {
                    System.out.println("Qual descri��o deseja colocar?");
                    ler.nextLine();
                    alterar = ler.nextLine();
                    buscaProduto.setDescricao(alterar);
                    acao = 0;
                    alterar = null;
                }
                //para alterar o valor
                System.out.println("Deseja alterar o valor do produto?\n"
                        + "0-Sim\n"
                        + "1-N�o\n");
                acao = ler.nextInt();
                if (acao == 0) {
                    System.out.println("Qual valor deseja colocar?");
                    ler.nextLine();
                    alterar = ler.nextLine();
                    buscaProduto.setValor(alterar);
                    acao = 0;
                    alterar = null;
                }
                //para alterar o lucro
                System.out.println("Deseja alterar a porcentagem de lucro do produto?\n"
                        + "0-Sim\n"
                        + "1-N�o\n");
                acao = ler.nextInt();
                if (acao == 0) {
                    System.out.println("Qual porcentagem deseja colocar?");
                    ler.nextLine();
                    alterar = ler.nextLine();
                    buscaProduto.setLucro(alterar);
                    acao = 0;
                    alterar = null;
                }
                //para alterar o estoque
                System.out.println("Deseja alterar a quantidade em estoque do produto?\n"
                        + "0-Sim\n"
                        + "1-N�o\n");
                acao = ler.nextInt();
                if (acao == 0) {
                    System.out.println("Qual quantidade deseja colocar?");
                    alterarEstoque = ler.nextInt();
                    buscaProduto.setEstoque(alterarEstoque);
                    acao = 0;
                }
                System.out.println("Produto: " + buscaProduto.getProduto() + "\n"
                        + "Descri��o: " + buscaProduto.getDescricao() + "\n"
                        + "Valor: R$" + buscaProduto.getValor() + "\n"
                        + "Porcentagem de lucro: " + buscaProduto.getLucro() + "%\n"
                        + "Quantidade em estoque: " + buscaProduto.getEstoque() + "\n");
            }
        }
    }

    public void cadastrarVenda() {

        int aux = 0, acao, qntdVendas;

        System.out.println("Escolha um cliente:");
        for (int i = 0; i < dadosCliente.dadosDoCliente.size(); i++) {
            Cliente listaClientes = dadosCliente.listaDeCliente(i);
            System.out.println(i + "-" + listaClientes.getNome());
        }
        ler.nextInt();

        while (true) {
            System.out.println("Escolha um produto ou aperte -1 para sair:");
            for (int i = 0; i < dadosProduto.dadosDoProduto.size(); i++) {
                Produto listaProdutos = dadosProduto.listaDeProdutos(i);
                System.out.println(i + "-" + listaProdutos.getProduto());
            }
            acao = ler.nextInt();
            if (acao == -1) {
                break;
            }
            for (int i = 0; i <= acao; i++) {
                Produto listaProdutos = dadosProduto.listaDeProdutos(i);
                if (i == acao) {
                    aux = listaProdutos.getEstoque();

                }
            }
            System.out.println("Quantidade:");
            qntdVendas = ler.nextInt();

            if (dadosProduto.venderProduto(acao, qntdVendas)) {
                return;
            }
        }
    }

    public void mostrarProdutosEmEstoque() {

        System.out.println("NOME/QUANTIDADE EM ESTOQUE");
        for (int i = 0; i < 10; i++) {
            Produto listaProdutos = dadosProduto.listaDeProdutos(i);
            System.out.println(listaProdutos.getProduto() + "/" + listaProdutos.getEstoque());
        }
    }
}
