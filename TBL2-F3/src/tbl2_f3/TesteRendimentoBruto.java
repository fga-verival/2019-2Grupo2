package tbl2_f3;

import static org.junit.Assert.*;
import org.junit.Test;


public class TesteRendimentoBruto {
	@Test
	public void testeRendimentoBruto() {
		calculoCDB cdb = new calculoCDB(60,1000f,8.5f);
		assertEquals(cdb.getRendimentoBruto(), 13.97f, 0.0001);
	}
	
}	