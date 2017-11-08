import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GerenciaDeAposta  {
	
	private static  List<Time> listaTime = new ArrayList();
	private static List<Apostador> listApost = new ArrayList();
	
	public GerenciaDeAposta(){
		if(listaTime.size() == 0){
			addTimes();
		}
	}
	
	public void addApostador(Apostador a){
		listApost.add(a);
	}
	
	public void addTime(Time a)throws Exception{
		for(Time p: listaTime){
			if(p.getNome().equals(a.getNome())){
				throw new Exception("Erro, Time j� adicionado na sua lista de apostas");
			}
		}
		
		listaTime.add(a);
	}
	
	public Apostador getApostador(String telefone) throws Exception{
		for(Apostador p: listApost){
			if(p.GetTelefone().equals(telefone)){
				return p;
			}
		}
		
		throw new Exception("Esse Apostador N�o Existe");
	}
	
	public void alterarValorAp(Apostador a, int valor){
		for(Apostador p: listApost){
			if(p.GetTelefone().equals(a.GetTelefone())){
				p.setValor(valor);
			}
		}
	}
	
	public void addTimes(){ 
	
		listaTime.add(new Time("Botafogo-RJ"));
		listaTime.add(new Time("S�o Paulo"));
		listaTime.add(new Time("Coritiba"));
		listaTime.add(new Time("Vasco da Gama"));
		listaTime.add(new Time("Chapecoense"));
		listaTime.add(new Time("Flamengo"));
		listaTime.add(new Time("Palmeiras"));
		listaTime.add(new Time("Fluminense"));
		listaTime.add(new Time("Sport"));
		listaTime.add(new Time("Gr�mio"));
		listaTime.add(new Time("Santos"));
		listaTime.add(new Time("Cruzeiro"));
		listaTime.add(new Time("Atl�tico-MG"));
		listaTime.add(new Time("Atl�tico-PR"));
		listaTime.add(new Time("Bahia"));
		listaTime.add(new Time("EC Vit�ria"));
		listaTime.add(new Time("Corinthians"));
		listaTime.add(new Time("Ava�"));
		listaTime.add(new Time("Atl�tico-GO"));
		listaTime.add(new Time("Ponte Preta"));
	}

	public List<Time> getTimes(){
		return listaTime;
	}
	public List<Apostador> getApostadores(){
		return listApost;
	}
}
