import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Gravador{
		List Apost  = new GerenciaDeAposta().getApostadores();
		
		private String Apostadores;
		
		public Gravador(){
			this.Apostadores = "listadeApostas.txt";
		}
		
		public void GravadorDeAposta(String Apostadores){
			this.Apostadores = Apostadores;
		}
		
		public List<Apostador> leApostador() throws IOException{
			ObjectInputStream in = null;
			try{
				in = new ObjectInputStream(new FileInputStream(Apostadores));
				return (List<Apostador>) in.readObject();
			}catch(FileNotFoundException e){
				throw new IOException("Não foi encontrado o arquivo Apostador.txt", e);
			}catch(IOException e){
				throw e;
			}catch (ClassNotFoundException e){
				throw new IOException("Classe dos objetos gravados no arquivo"+"Apostador.txt não existe", e);
			}finally{
				if(in != null){
					in.close();
				}
			}
}
}