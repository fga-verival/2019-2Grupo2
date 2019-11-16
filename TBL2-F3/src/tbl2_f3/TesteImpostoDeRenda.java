package tbl2_f3;
import static org.junit.Assert.*;
import org.junit.Test;


public class TesteImpostoDeRenda {
    
	@Test
	public void testeImpostoRenda()
	{
		calculoCDB cdb = new calculoCDB(60,1000f,8.5f);
		assertNotNull(cdb);
		assertEquals(cdb.getImpostoRenda(),3.14f,0.01);
	}
	
}