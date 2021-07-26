public class Produto {
	String produto, descricao, valor, lucro;
	int estoque;
	
	public String getProduto() {
		return produto;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getValor() {
		return valor;
	}
	public String getLucro() {
		return lucro;
	}
	public int getEstoque() {
		return estoque;
	}
	
	public void setProduto(String produtoAlterado) {
		this.produto = produtoAlterado;
	}
	public void setDescricao(String descricaoAlterado) {
		this.descricao = descricaoAlterado;
	}
	public void setValor(String valorAlterado) {
		this.valor = valorAlterado;
	}
	public void setLucro(String lucroAlterado) {
		this.lucro = lucroAlterado;
	}
	public void setEstoque(int estoqueAlterado) {
		this.estoque = estoqueAlterado;
	}
	
}
