public class Conta {
	private float limite;
	private float limiteDisponivel;
	private float saldo;
	private float diaFatura;
	private String nomeBanco;
    private float taxaMensal;


    public float getTaxaMensal() {
        return taxaMensal;
    }



    public void setTaxaMensal(float taxaMensal) {
        this.taxaMensal = taxaMensal;
    }


    public String getNomeBanco() {
        return nomeBanco;
    }



    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }



    public float getDiaFatura() {
        return diaFatura;
    }



    public void setDiaFatura(float diaFatura) {
        this.diaFatura = diaFatura;
    }



    public float getSaldo() {
        return saldo;
    }



    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }



    public float getLimiteDisponivel() {
        return limiteDisponivel;
    }



    public void setLimiteDisponivel(float limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }



    public float getLimite() {
        return limite;
    }



    public void setLimite(float limite) {
        this.limite = limite;
    }

    public Conta(float limite, float saldo, String nomeBanco) {
		super();
		this.setLimite(limite);
		this.setSaldo(saldo);
		this.setNomeBanco(nomeBanco);
		this.setLimiteDisponivel(limite);
	}



    @Override
    public String toString() {
        return "Conta [limiteDisponivel=" + limiteDisponivel + ", nomeBanco=" + nomeBanco
                + ", saldo=" + saldo + ", taxaMensal =" + taxaMensal + "]";
    }
    









   
}