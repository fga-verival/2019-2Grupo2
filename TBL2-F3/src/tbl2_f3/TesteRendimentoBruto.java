package tbl2_f3;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import org.junit.Test;

public class TesteRendimentoBruto {
	
	
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 {60,1000f,8.5f,13.97f},
                 {390,100f,7.5f,8.01f},
                 {670,800f,8f,177.48f}
           });
    }
	
	
	private int dias;
	private float capitalInicial;
    private float juros;
    private float rendBruto;
    
    public TesteRendimentoBruto (int a, float b, float c ,float d) {
        this.dias = a;
        this.capitalInicial = b;
        this.juros = c;
        this.rendBruto = d;
    }
    
    @Test
    public void testeRendimentoBrutoParametrizado() {
    	calculoCDB cdb = new calculoCDB(dias,capitalInicial,juros);
        assertEquals(rendBruto, cdb.getRendimentoBruto(), 0.01);
    }
    
	@Test
	public void testeRendimentoBruto()
	{
		calculoCDB cdb = new calculoCDB(60,1000f,8.5f);
		assertNotNull(cdb);
		assertEquals(cdb.getRendimentoBruto(),13.97,0.01);
	}
	
	@Test
	public void testeRendimentoBruto2() {
		calculoCDB cdb = new calculoCDB(120,500f,8.0f);
		
		assertNotNull(cdb);
		assertEquals(cdb.getRendimentoBruto(),13.15,0.01);
	}


}