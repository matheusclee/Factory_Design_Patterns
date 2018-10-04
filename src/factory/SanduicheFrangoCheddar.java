package factory;

public class SanduicheFrangoCheddar implements Sanduiche{

	@Override
	public Pao addPao() {
		return new PaoBola();
	}

	@Override
	public Queijo addQueijo() {
		return new QueijoCheddar();
	}

	@Override
	public Presunto addPresunto() {
		return new PresuntoFrango();
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
