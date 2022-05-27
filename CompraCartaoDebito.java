public class CompraCartaoDebito extends CompraCartao {

	public CompraCartaoDebito(String idCompra, int data, float valor, Conta conta) {
		super(idCompra, data, valor, conta);
		this.conta.setSaldo(this.conta.getSaldo() - valor);
	}
	

}