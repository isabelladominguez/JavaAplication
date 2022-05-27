public class CompraCartaoCreditoParcelado extends CompraCartaoCredito {
	int nParcelas;
    float valorParcela;

	public CompraCartaoCreditoParcelado(String idCompra, int data, float valor, Conta conta, int nParcelas, float valorParcela) {
		super(idCompra, data, valor, conta);
		this.nParcelas = nParcelas;
        this.valorParcela = valorParcela;
        //this.conta.setTaxaMensal(valor / nParcelas);
	}
	

}