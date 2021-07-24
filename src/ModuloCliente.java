import java.util.ArrayList;
import java.util.Scanner;

public class ModuloCliente {
	int i;
	String buscaNome;
	Scanner ler = new Scanner(System.in);
	
	ArrayList<Cliente> dadosDoCliente = new ArrayList();
	
	public void bancoDeCliente() {
		Cliente antigo1 = new Cliente();
		antigo1.setNome("Nelson Tomás Martin Pinto");
		antigo1.setEndereco("Rua Anita Garibaldi");
		antigo1.setTelefone("47992960733");
		dadosDoCliente.add(antigo1);
		
		Cliente antigo2 = new Cliente();
		antigo2.setNome("Juliana Maria da Costa");
		antigo2.setEndereco("Rua Doutor Rubens Cavalcante Amorim");
		antigo2.setTelefone("82992543733");
		dadosDoCliente.add(antigo2);
		
		Cliente antigo3 = new Cliente();
		antigo3.setNome("Mirella Patrícia Costa");
		antigo3.setEndereco("Quadra 5 Conjunto L");
		antigo3.setTelefone("61989094910");
		dadosDoCliente.add(antigo3);
		
		Cliente antigo4 = new Cliente();
		antigo4.setNome("Heloisa Alice Rosa Martins");
		antigo4.setEndereco("Rua 20 de Novembro");
		antigo4.setTelefone("68981405915");
		dadosDoCliente.add(antigo4);
		
		Cliente antigo5 = new Cliente();
		antigo5.setNome("César Murilo da Costa");
		antigo5.setEndereco("Rua das Graças");
		antigo5.setTelefone("81983660580");
		dadosDoCliente.add(antigo5);
		
		Cliente antigo6 = new Cliente();
		antigo6.setNome("Miguel Roberto Caldeira");
		antigo6.setEndereco("Rua das Flores");
		antigo6.setTelefone("98994626748");
		dadosDoCliente.add(antigo6);
		
		Cliente antigo7 = new Cliente();
		antigo7.setNome("Sara Isabelle Figueiredo");
		antigo7.setEndereco("Travessa Pastor Martim Luther King");
		antigo7.setTelefone("79994069252");
		dadosDoCliente.add(antigo7);
		
		Cliente antigo8 = new Cliente();
		antigo8.setNome("Caleb Oliver Victor da Rosa");
		antigo8.setEndereco("Rua Rogério Paulo Cruz");
		antigo8.setTelefone("41983046808");
		dadosDoCliente.add(antigo8);
		
		Cliente antigo9 = new Cliente();
		antigo9.setNome("Murilo Daniel Carlos Eduardo Moura");
		antigo9.setEndereco("Rua Hugo da Cunha Machado");
		antigo9.setTelefone("98993059288");
		dadosDoCliente.add(antigo9);
		
		Cliente antigo10 = new Cliente();
		antigo10.setNome("Larissa Letícia Fátima da Paz");
		antigo10.setEndereco("Rua Professora Maria Batista de Oliveira");
		antigo10.setTelefone("83987157644");
		dadosDoCliente.add(antigo10);
		
	}
	
	public void cadastrarCliente() {
		Cliente novo = new Cliente();
		
		System.out.println("Nome:");  
	    novo.setNome(ler.nextLine());  
	    
	    System.out.println("Endereço:");  
	    novo.setEndereco(ler.nextLine());  
	         
	    System.out.println("Telefone:");  
	    novo.setTelefone(ler.nextLine());
	    
	    dadosDoCliente.add(novo);
	}
	
	public Cliente buscarCliente() {

		System.out.println("Qual cliente deseja buscar?");
		buscaNome = ler.nextLine();
		for(i=0;i<dadosDoCliente.size();i++) {
			 if(dadosDoCliente.get(i).getNome().equals(buscaNome)){  
				 return dadosDoCliente.get(i);
			 }
		}
		System.out.println("Cliente não encontrado!");
		return null;
	}
	
	public Cliente listaDeCliente(int index) {
		return dadosDoCliente.get(index);
	}
}
