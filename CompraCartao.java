public class CompraCartao extends Compra {
	
	Conta conta;

	public CompraCartao(String idCompra, int data, float valor, Conta conta) {
		super(idCompra, data, valor);
		this.conta = conta;
	}

	
	

}