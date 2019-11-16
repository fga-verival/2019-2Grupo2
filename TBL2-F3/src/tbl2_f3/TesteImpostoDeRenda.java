package tbl2_f3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class TesteImpostoDeRenda {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 {60,1000f,8.5f,3.14f},
                 {390,100f,7.5f,1.4f},
                 {670,800f,8f,20.56f}
           });
    }
	
	
	private int dias;
	private float capitalInicial;
    private float juros;
    private float imposto;
    
    public TesteImpostoDeRenda (int a, float b, float c ,float d) {
        this.dias = a;
        this.capitalInicial = b;
        this.juros = c;
        this.imposto = d;
    }
    
    @Test
    public void testeImpostoDeRendaParametrizado() {
    	calculoCDB cdb = new calculoCDB(dias,capitalInicial,juros);
        assertEquals(imposto, cdb.getImpostoRenda(), 0.01);
    }
    
	@Test
	public void testeImpostoRenda()
	{
		calculoCDB cdb = new calculoCDB(60,1000f,8.5f);
		assertNotNull(cdb);
		assertEquals(cdb.getImpostoRenda(),3.14f,0.01);
	}
	
	public void testeImpostoRenda2()
	{
		calculoCDB cdb = new calculoCDB(120,500f,8f);
		assertNotNull(cdb);
		assertEquals(cdb.getImpostoRenda(),2.96f,0.01);
	}
	
}