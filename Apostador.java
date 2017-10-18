import java.util.ArrayList;
import java.util.List;

public class Apostador {
	
	private String nome;
	private int valor;
	private String telefone;
	private List<Time> apostas;
	
	public Apostador(){
		apostas = new ArrayList();
	}
	
	public List GetApostas(){
		return this.apostas;
	}
	
	public List setApostas(List Apostas){
		return this.apostas = Apostas;
	}
	
	public String Getnome(){
		return this.nome;
	}
	
	public int getValor(){
		return this.valor;
	}
	
	public int setValor(int valor){
		return this.valor = valor;
	}
	
	public String setNome(String nome){
		return this.nome =  nome;
	}
	
	public String GetTelefone(){
		return this.telefone;
		
	}
	
	public String setTelefone(String Telefone){
		return this.telefone = Telefone;
		
	}
	
	public void addTimeAposta(Time t){
		apostas.add(t);
	}
	
	public String toString(){
		return "nome:" +this.nome+ "Telefone:" +this.telefone;
	}
	
	
	
	
}
