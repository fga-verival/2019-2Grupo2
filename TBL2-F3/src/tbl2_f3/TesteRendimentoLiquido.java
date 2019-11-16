package tbl2_f3;


import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TesteRendimentoLiquido {
	
    
    @Test
    public void testeRendimentoLiquido() {
        calculoCDB cdb = new calculoCDB(60,1000f,8.5f);
		assertEquals(cdb.getRendimentoLiquido(), 1.0829f, 0.0001);
    }
	
    @Test
	public void testeRendimentoLiquido2() {
		calculoCDB cdb = new calculoCDB(120,500f,8f);
		assertEquals(cdb.getRendimentoLiquido(), 2.0384f, 0.0001);
	}
}