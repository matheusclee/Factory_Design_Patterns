package factory;

public class SanduicheLight implements Sanduiche{

	@Override
	public Pao addPao() {
		return new PaoIntegral();
	}

	@Override
	public Queijo addQueijo() {
		return new QueijoPrato();
	}

	@Override
	public Presunto addPresunto() {
		return new PresuntoPeru();
	}

	@Override
	public Ovo addOvo() {
		return new OvoCapoeira();
	}

	@Override
	public Tomate addTomate() {
		return new Tomate();
	}

}
