
public class Time implements INTERTIME{

	private String Nome;
	private int QuantGols;
	private String Estadio;
	


	public String GetNome(){
		return this.Nome;
	}
	
	public String setNome(){
		return this.Nome = Nome;
	}
	
	public int GetQuantGols(){
		return this.QuantGols;
	}
	
	public int setQuantGols(){
		return this.QuantGols = QuantGols;
	}
	
	public String GetEstadio(){
		return this.Estadio;
	
	}
	
	public String SetEstadio(){
		return this.Estadio = Estadio;	
		
	}
	
	public String toString(){
		return "Nome:" +this.Nome+ " QuantGols:" +this.QuantGols+ " Estadio:" +this.Estadio;
	}
	
}