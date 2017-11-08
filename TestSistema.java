import static org.junit.Assert.*;

import org.junit.Test;

public class TestSistema {

	@Test
	
	public void test() {
		GerenciaDeAposta gp = new GerenciaDeAposta();
		Apostador b = new Apostador("jão","666-666");
		gp.addApostador(b);
		try{
			Apostador a = gp.getApostador("666-666");
			assertEquals(a,b);
		}catch(Exception e){
			fail("Erro, usuario não encontrado");
			
		}
	}
}
