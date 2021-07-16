package FactoryMethod;

public class PremiumCreditCard implements CreditCard{
	
	private int CostoAnual;
	private int LimiteCredito;
	

	public PremiumCreditCard(int costoAnual, int limiteCredito) {
		super();
		CostoAnual = costoAnual;
		LimiteCredito = limiteCredito;
	}

	@Override
	public int getCostoAnual() {
		//implementation
		return 0;
	}

	@Override
	public int getLimiteCrediticio() {
		// implementation
		return 0;
	}
	
}
