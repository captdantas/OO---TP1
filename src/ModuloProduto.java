import java.util.ArrayList;
import java.util.Scanner;

public class ModuloProduto {
	int i;
	String buscaProduto;
	Scanner ler = new Scanner(System.in);
	
	ArrayList<Produto> dadosDoProduto = new ArrayList();
	
	public void bancoDeProdutos() {
		Produto produto1 = new Produto();
		produto1.setProduto("Depois a louca sou eu");
		produto1.setDescricao("por Tati Bernardi");
		produto1.setValor("42.90");
		produto1.setLucro("50");
		produto1.setEstoque(65);
		dadosDoProduto.add(produto1);
		
		Produto produto2 = new Produto();
		produto2.setProduto("Liderança");
		produto2.setDescricao("por Daniel Goleman e Ivo Korytowski");
		produto2.setValor("44.90");
		produto2.setLucro("55");
		produto2.setEstoque(100);
		dadosDoProduto.add(produto2);
		
		Produto produto3 = new Produto();
		produto3.setProduto("Retrato de um viciado quando jovem");
		produto3.setDescricao("por Bill Clegg e Julia Romeu");
		produto3.setValor("54.90");
		produto3.setLucro("40");
		produto3.setEstoque(4);
		dadosDoProduto.add(produto3);
		
		Produto produto4 = new Produto();
		produto4.setProduto("Legenda áurea");
		produto4.setDescricao("por Jacopo de Varazze e Hilário Franco Júnior");
		produto4.setValor("117.90");
		produto4.setLucro("45");
		produto4.setEstoque(12);
		dadosDoProduto.add(produto4);
		
		Produto produto5 = new Produto();
		produto5.setProduto("O poder do hábito");
		produto5.setDescricao("por Charles Duhigg e Rafael Mantovani");
		produto5.setValor("69.90");
		produto5.setLucro("60");
		produto5.setEstoque(94);
		dadosDoProduto.add(produto5);
		
		Produto produto6 = new Produto();
		produto6.setProduto("Mindset: A nova psicologia do sucesso");
		produto6.setDescricao("por Carol S. Dweck e S. Duarte");
		produto6.setValor("24.90");
		produto6.setLucro("50");
		produto6.setEstoque(91);
		dadosDoProduto.add(produto6);
		
		Produto produto7 = new Produto();
		produto7.setProduto("Mulheres que correm com os lobos");
		produto7.setDescricao("por Clarissa Pinkola Estés");
		produto7.setValor("69.90");
		produto7.setLucro("30");
		produto7.setEstoque(33);
		dadosDoProduto.add(produto7);
		
		Produto produto8 = new Produto();
		produto8.setProduto("O andar do bêbado: Como o acaso determina nossas vidas");
		produto8.setDescricao("por Leonard Mlodinow, Diego Alfaro, e outros.");
		produto8.setValor("39.90");
		produto8.setLucro("15");
		produto8.setEstoque(92);
		dadosDoProduto.add(produto8);
		
		Produto produto9 = new Produto();
		produto9.setProduto("O homem mais rico da Babilônia");
		produto9.setDescricao("por George S Clason");
		produto9.setValor("29.90");
		produto9.setLucro("45");
		produto9.setEstoque(74);
		dadosDoProduto.add(produto9);
		
		Produto produto10 = new Produto();
		produto10.setProduto("O Homem de Giz");
		produto10.setDescricao("por C. J. Tudor e Alexandre Raposo");
		produto10.setValor("49.90");
		produto10.setLucro("10");
		produto10.setEstoque(70);
		dadosDoProduto.add(produto10);
	}

	public void cadastrarProduto() {
		Produto novo = new Produto();
		
		System.out.println("Nome do produto:");  
	    novo.setProduto(ler.nextLine());  
	    
	    System.out.println("Descriçao:");  
	    novo.setDescricao(ler.nextLine());  
	         
	    System.out.println("Preço Unitário:");  
	    novo.setValor(ler.nextLine());
	    
	    System.out.println("Porcentagem de lucro:");  
	    novo.setLucro(ler.nextLine());
	    
	    System.out.println("Quantidade em estoque:");  
	    novo.setEstoque(ler.nextInt());
	    
	    dadosDoProduto.add(novo);
	}

	public Produto buscarProduto() {

		System.out.println("Qual produto deseja buscar?");
		buscaProduto = ler.nextLine();
		for(i=0;i<dadosDoProduto.size();i++) {
			 if(dadosDoProduto.get(i).getProduto().equals(buscaProduto)){  
				 return dadosDoProduto.get(i);
			 }
		}
		System.out.println("Produto não encontrado!");
		return null;
	}
	
	public Produto listaDeProdutos(int index) {
		return dadosDoProduto.get(index);
	}
}
