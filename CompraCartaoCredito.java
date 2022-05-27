public class CompraCartaoCredito extends CompraCartao{

	public CompraCartaoCredito(String idCompra, int data, float valor, Conta conta) {
		super(idCompra, data, valor, conta);
		this.conta.setLimiteDisponivel(this.conta.getLimiteDisponivel() - valor);
	}
}