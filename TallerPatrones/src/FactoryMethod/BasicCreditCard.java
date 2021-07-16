package FactoryMethod;

public class BasicCreditCard implements CreditCard{
	
	private int CostoAnual;
	private int LimiteCredito;

	
	public BasicCreditCard(int costoAnual, int limiteCredito) {
		super();
		CostoAnual = costoAnual;
		LimiteCredito = limiteCredito;
	}

	@Override
	public int getCostoAnual() {
		// implementacion 
		return 0;
	}

	@Override
	public int getLimiteCrediticio() {
		// implementacion
		return 0;
	}
	

}
