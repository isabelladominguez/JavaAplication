public class JavaAplication {

	public static void main(String[] args) {
		
		Conta nuBank = new Conta(500f, 1000, "NuBank" );
		System.out.println(nuBank.toString());
		
		CompraCartaoDebito c1 = new CompraCartaoDebito("padaria",20210516, 15f, nuBank);
		System.out.println(nuBank.toString());

		CompraCartaoDebito c4 = new CompraCartaoDebito("padaria",20210516, 15f, nuBank);
		System.out.println(nuBank.toString());
		
		CompraCartaoCreditoAVista c2= new CompraCartaoCreditoAVista("cantina", 220519, 13f, nuBank);
        System.out.println(nuBank.toString()); 
		
		CompraCartaoCreditoParcelado c3 = new CompraCartaoCreditoParcelado("posto", 20220516, 100, nuBank, 3, 100);
		System.out.println(nuBank.toString());

		for(int i=0; i<Compra.listaCompras.size(); i++){
			System.out.println(Compra.listaCompras.get(i).toString());
			System.out.println(Compra.listaCompras.get(i).hashCode());
		}

		//System.out.println(c2.equals(c4));
		  //c2.hashCode();
		  //c4.hashCode();

		

	

	}

}