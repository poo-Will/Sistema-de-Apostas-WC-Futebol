import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GerenciaDeTime  {
	
	List<Time> listaTime;
	
	public GerenciaDeTime(){
		listaTime = new ArrayList();
		addTimes();
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
}
