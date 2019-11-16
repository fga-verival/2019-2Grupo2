package tbl2_f3;

public class calculoCDB {
	private int dias;
	private float capitalInicial;
	private float juros;
	private float IR;
	
	public calculoCDB(int dias,float capitalInicial,float juros) {
		this.dias = dias;
		this.capitalInicial = capitalInicial;
		this.juros = juros;
		
		if(dias <= 180) {
			this.IR = 22.5f/100f;
		} else if (dias <= 360) {
			this.IR = 20.0f/100f;
		} else if (dias <= 720) {
			this.IR = 17.5f/100f;
		} else {
			this.IR = 15.0f/100f;
		}
	}
	
	public float getRendimentoBruto() {
		float result = this.capitalInicial * this.juros * (this.dias/365.0f);
		return result;
	}
	
	public float getImpostoRenda() {
		return this.getRendimentoBruto() * this.IR;
	}
	public float getRendimentoLiquido() {
		float capitalFinal = this.getRendimentoBruto() - this.getImpostoRenda(); 
		capitalFinal += this.capitalInicial;
		
		return (capitalFinal/this.capitalInicial * 100) - 100;  
	}
}
