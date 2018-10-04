package testes;


import org.junit.Assert;
import org.junit.Test;
import factory.*;

public class TestesSanduiches {

	Sanduiche frangocheddar = new SanduicheFrangoCheddar();
	Sanduiche light = new SanduicheLight();
	Sanduiche simples = new SanduicheSimples();
	
	@Test
	public void testaSanduicheFrangoCheddar(){
		Pao paoEsperado = new PaoBola();
		Pao paoAtual = frangocheddar.addPao();
		Assert.assertEquals(paoEsperado.fatiaPao(), paoAtual.fatiaPao());
		
		Queijo queijoEsperado = new QueijoCheddar();
		Queijo queijoAtual = frangocheddar.addQueijo();
		Assert.assertEquals(queijoEsperado.fatiaQueijo(), queijoAtual.fatiaQueijo());
		
		Presunto presuntoEsperado = new PresuntoFrango();
		Presunto presuntoAtual = frangocheddar.addPresunto();
		Assert.assertEquals(presuntoEsperado.fatiaPresunto(), presuntoAtual.fatiaPresunto());
		
		Ovo ovoEsperado = new OvoCapoeira();
		Ovo ovoAtual = frangocheddar.addOvo();
		Assert.assertEquals(ovoEsperado.tipoOvo(), ovoAtual.tipoOvo());
		
		Tomate tomateEsperado = new Tomate();
		Tomate tomateAtual = frangocheddar.addTomate();
		Assert.assertEquals(tomateEsperado.tomate(), tomateAtual.tomate());
	}
	
	@Test
	public void testaSanduicheLight(){
		Pao paoEsperado = new PaoIntegral();
		Pao paoAtual = light.addPao();
		Assert.assertEquals(paoEsperado.fatiaPao(), paoAtual.fatiaPao());
		
		Queijo queijoEsperado = new QueijoPrato();
		Queijo queijoAtual = light.addQueijo();
		Assert.assertEquals(queijoEsperado.fatiaQueijo(), queijoAtual.fatiaQueijo());
		
		Presunto presuntoEsperado = new PresuntoPeru();
		Presunto presuntoAtual = light.addPresunto();
		Assert.assertEquals(presuntoEsperado.fatiaPresunto(), presuntoAtual.fatiaPresunto());
		
		Ovo ovoEsperado = new OvoCapoeira();
		Ovo ovoAtual = light.addOvo();
		Assert.assertEquals(ovoEsperado.tipoOvo(), ovoAtual.tipoOvo());
		
		Tomate tomateEsperado = new Tomate();
		Tomate tomateAtual = light.addTomate();
		Assert.assertEquals(tomateEsperado.tomate(), tomateAtual.tomate());
	}
	
	@Test
	public void testaSanduicheSimples(){
		Pao paoEsperado = new PaoFrances();
		Pao paoAtual = simples.addPao();
		Assert.assertEquals(paoEsperado.fatiaPao(), paoAtual.fatiaPao());
		
		Queijo queijoEsperado = new QueijoMussarela();
		Queijo queijoAtual = simples.addQueijo();
		Assert.assertEquals(queijoEsperado.fatiaQueijo(), queijoAtual.fatiaQueijo());
		
		Presunto presuntoEsperado = new PresuntoFrango();
		Presunto presuntoAtual = simples.addPresunto();
		Assert.assertEquals(presuntoEsperado.fatiaPresunto(), presuntoAtual.fatiaPresunto());
		
		Ovo ovoEsperado = new OvoGranja();
		Ovo ovoAtual = simples.addOvo();
		Assert.assertEquals(ovoEsperado.tipoOvo(), ovoAtual.tipoOvo());
		
		Tomate tomateEsperado = new Tomate();
		Tomate tomateAtual = simples.addTomate();
		Assert.assertEquals(tomateEsperado.tomate(), tomateAtual.tomate());
	}
}
