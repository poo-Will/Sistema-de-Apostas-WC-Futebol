
public class Apostador {
	
	private String nome;
	private String Telefone;
	
	public String Getnome(){
		return this.nome;
	}
	
	public String setNome(String nome){
		return this.nome =  nome;
	}
	
	public String GetTelefone(){
		return this.Telefone;
		
	}
	
	public String setTelefone(String Telefone){
		return this.Telefone = Telefone;
		
	}
	
	public String toString(){
		return "nome:" +this.nome+ "Telefone:" +this.Telefone;
	}
	
	
	
	
}
