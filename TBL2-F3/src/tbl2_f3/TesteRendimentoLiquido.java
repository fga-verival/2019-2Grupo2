package tbl2_f3;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class TesteRendimentoLiquido {
	
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
        	 {60,1000f,8.5f,1.0829f},
             {390,100f,7.5f,6.6113f},
             {670,800f,8f,12.1151f}
           });
    }
    
    private int dias;
	private float capitalInicial;
    private float juros;
    private float rendLiq;
    
    public TesteRendimentoLiquido(int a, float b, float c ,float d) {
    	this.dias = a;
        this.capitalInicial = b;
        this.juros = c;
        this.rendLiq = d;
    }
    
    @Test
    public void testeImpostoDeRendaParametrizado() {
    	calculoCDB cdb = new calculoCDB(dias,capitalInicial,juros);
        assertEquals(rendLiq, cdb.getRendimentoLiquido(), 0.0001);
    }
	
    
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