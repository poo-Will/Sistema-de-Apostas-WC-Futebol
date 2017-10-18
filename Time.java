import java.util.Random;

public class Time{
	
	private String Nome;
	private int QuantGols;

	public Time(String nome){
		this.Nome = nome;
		gerarGols();
	}
	public String getNome(){
		return this.Nome;
	}
	
	public String setNome(){
		return this.Nome = Nome;
	}
	
	public int GetQuantGols(){
		return this.QuantGols;
	}
	
	public void setQuantGols(int QuantGols){
		this.QuantGols = QuantGols;
	}
	
	public String toString(){
		return "Nome:" +this.Nome+ " QuantGols:" +this.QuantGols;
	}

	public void gerarGols() {
		Random r = new Random();
		QuantGols = r.nextInt(10);
	}
	
	
}
