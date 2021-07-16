package FactoryMethod;

public class VIPCreditCard implements CreditCard{
	
	private int CostoAnual;
	private int LimiteCredito;
	
	
	public VIPCreditCard(int costoAnual, int limiteCredito) {
		super();
		CostoAnual = costoAnual;
		LimiteCredito = limiteCredito;
	}

	@Override
	public int getCostoAnual() {
		// implementation
		return 0;
	}

	@Override
	public int getLimiteCrediticio() {
		// implementation
		return 0;
	}

}
