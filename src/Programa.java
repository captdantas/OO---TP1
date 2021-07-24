import java.util.Scanner;

class Programa {
	public static void main(String[] args) {
		int acaoMenu, aux=0, acao, qntdVendas; 
		int qntdClientes;
		int qntdProdutos;
		String alterar;
		Scanner ler = new Scanner(System.in);
		ModuloCliente dadosCliente = new ModuloCliente();
		ModuloProduto dadosProduto = new ModuloProduto();
		dadosCliente.bancoDeCliente();
		dadosProduto.bancoDeProdutos();
		
		System.out.println("Escolha a ação desejada:\n"
				+ "1-Cadastrar novo cliente\n"
				+ "2-Buscar por cliente\n"
				+ "3-Cadastrar novo produto\n"
				+ "4-Buscar por produto\n"
				+ "5-Cadastrar venda\n"
				+ "6-Mostrar produtos em estoque\n"
				+ "7-Sair");
		acaoMenu = ler.nextInt();
		
		switch(acaoMenu) {
		case 1: //cadastro de cliente
			System.out.println("Quantos clientes deseja cadastar?");
			qntdClientes = ler.nextInt();
			
			while(aux<qntdClientes) {
				dadosCliente.cadastrarCliente();
				aux++;
			}
			System.out.println("Clientes cadastrados com sucesso!");
			break;
			
		case 2: //busca de cliente
			Cliente buscaCliente = dadosCliente.buscarCliente();
			if(buscaCliente!=null) {
				System.out.println("Nome: " + buscaCliente.getNome() + "\n"
						+ "Endereco: " + buscaCliente.getEndereco() + "\n"
								+ "Teleone: " + buscaCliente.getTelefone()+ "\n"); //mostra os dados dos cliente
				System.out.println("Deseja alterar os dados do cliente?\n"
						+ "1-Sim\n"
						+ "2-Não\n");
				acao = ler.nextInt();
				//para alterar dados do cliente
				if(acao==1) {
					acao = 0;
					//para alterar o nome
					System.out.println("Deseja alterar o nome?\n"
							+ "1-Sim\n"
							+ "2-Não\n");
					acao = ler.nextInt();
					if(acao == 1) {
						System.out.println("Qual nome deseja colocar?\n");
						alterar = ler.next();
						buscaCliente.setNome(alterar);
						acao = 0;
						alterar = null;
					}
					//para alterar o endereço
					System.out.println("Deseja alterar o endereço?\n"
							+ "1-Sim\n"
							+ "2-Não\n");
					acao = ler.nextInt();
					if(acao == 1) {
						System.out.println("Qual endereço deseja colocar?\n");
						alterar = ler.next();
						buscaCliente.setEndereco(alterar);
						acao = 0;
						alterar = null;
					}
					//para alterar o telefone
					System.out.println("Deseja alterar o telefone?\n"
							+ "1-Sim\n"
							+ "2-Não\n");
					acao = ler.nextInt();
					if(acao == 1) {
						System.out.println("Qual telefone deseja colocar?\n");
						alterar = ler.next();
						buscaCliente.setTelefone(alterar);
						acao = 0;
						alterar = null;
					}
					//mostra os novos dados do cliente
					System.out.println("\nNome: " + buscaCliente.getNome() + "\n"
							+ "Endereco: " + buscaCliente.getEndereco() + "\n"
									+ "Teleone: " + buscaCliente.getTelefone()+ "\n");
				} 
			}
			
			break;
			
		case 3:
			System.out.println("Quantos produtos deseja cadastar?");
			qntdProdutos = ler.nextInt();
			
			while(aux<qntdProdutos) {
				dadosProduto.cadastrarProduto();
				aux++;
			}
			System.out.println("Produtos cadastrados com sucesso!");
			break;
			
		case 4:
			Produto buscaProduto = dadosProduto.buscarProduto();
			if(buscaProduto!=null) {
				System.out.println("Produto: " + buscaProduto.getProduto() + "\n"
						+ "Descrição: " + buscaProduto.getDescricao() + "\n"
								+ "Valor: R$" + buscaProduto.getValor() + "\n"
										+ "Porcentagem de lucro: " + buscaProduto.getLucro() + "%\n"
												+ "Quantidade em estoque: " + buscaProduto.getEstoque() + "\n");
				//para alterar os dados do produto
				System.out.println("Deseja alterar os dados do produto?\n"
						+ "1-Sim\n"
						+ "2-Não\n");
				acao = ler.nextInt();
				
				if(acao == 1) {
					acao = 0;
					//para alterar o nome
					System.out.println("Deseja alterar o nome do produto?\n"
							+ "1-Sim\n"
							+ "2-Não\n");
					acao = ler.nextInt();
					if(acao == 1) {
						System.out.println("Qual nome deseja colocar?");
						alterar = ler.next();
						buscaProduto.setProduto(alterar);
						acao = 0;
						alterar = null;
					}
					//para alterar a descrição
					System.out.println("Deseja alterar a descrição do produto?\n"
							+ "1-Sim\n"
							+ "2-Não\n");
					acao = ler.nextInt();
					if(acao == 1) {
						System.out.println("Qual descrição deseja colocar?");
						alterar = ler.next();
						buscaProduto.setDescricao(alterar);
						acao = 0;
						alterar = null;
					}
					//para alterar o valor
					System.out.println("Deseja alterar o valor do produto?\n"
							+ "1-Sim\n"
							+ "2-Não\n");
					acao = ler.nextInt();
					if(acao == 1) {
						System.out.println("Qual valor deseja colocar?");
						alterar = ler.next();
						buscaProduto.setValor(alterar);
						acao = 0;
						alterar = null;
					}
					//para alterar o lucro
					System.out.println("Deseja alterar a porcentagem de lucro do produto?\n"
							+ "1-Sim\n"
							+ "2-Não\n");
					acao = ler.nextInt();
					if(acao == 1) {
						System.out.println("Qual porcentagem deseja colocar?");
						alterar = ler.next();
						buscaProduto.setLucro(alterar);
						acao = 0;
						alterar = null;
					}
					//para alterar o estoque
					System.out.println("Deseja alterar a quantidade em estoque do produto?\n"
							+ "1-Sim\n"
							+ "2-Não\n");
					acao = ler.nextInt();
					if(acao == 1) {
						System.out.println("Qual quantidade deseja colocar?");
						alterar = ler.next();
						buscaProduto.setEstoque(alterar);
						acao = 0;
						alterar = null;
					}
					System.out.println("Produto: " + buscaProduto.getProduto() + "\n"
							+ "Descrição: " + buscaProduto.getDescricao() + "\n"
									+ "Valor: R$" + buscaProduto.getValor() + "\n"
											+ "Porcentagem de lucro: " + buscaProduto.getLucro() + "%\n"
													+ "Quantidade em estoque: " + buscaProduto.getEstoque() + "\n");
				}
			}
			
			break;
			
		case 5:
			System.out.println("ESCOLHA UM CLIENTE");
			for(int i = 0; i < 10; i++) {
				Cliente listaClientes = dadosCliente.listaDeCliente(i);
				System.out.println(i+"-"+listaClientes.getNome());
			}
			acao = ler.nextInt();
			acao = 0;
			while(true) {
				System.out.println("ESCOLHA UM PRODUTO OU ESCREVA -1 CASO NÃO QUEIRA MAIS CADASTRAR VENDAS");
				for(int i = 0; i < 10; i++) {
					Produto listaProdutos = dadosProduto.listaDeProdutos(i);
					System.out.println(i+"-"+listaProdutos.getProduto()+", "+listaProdutos.getDescricao());
				}	
				acao = ler.nextInt();
				if(acao == -1) {
					break;
				}
				acao = 0;
				System.out.println("QUANTIDADE:");
				qntdVendas = ler.nextInt();
			}
			System.out.println("Vendas cadastradas com sucesso!");
			break;
			
		case 6:
			System.out.println("Nome/Quantidade em estoque");
			for(int i = 0; i < 10; i++) {
				Produto listaProdutos = dadosProduto.listaDeProdutos(i);
				System.out.println(listaProdutos.getProduto()+"/"+listaProdutos.getEstoque());
			}
			break;
		default:
			break;
		} //termino switch
		ler.close();
	}
}
