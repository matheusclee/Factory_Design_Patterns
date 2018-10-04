package factory;

public class SanduicheSimples implements Sanduiche{

	@Override
	public Pao addPao() {
		return new PaoFrances();
	}

	@Override
	public Queijo addQueijo() {
		return new QueijoMussarela();
	}
	
	@Override
	public Presunto addPresunto(){
		return new PresuntoFrango();
	}

	@Override
	public Ovo addOvo() {
		return new OvoGranja();
	}

	@Override
	public Tomate addTomate() {
		return new Tomate();
	}

}
