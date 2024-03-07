package listadeatividadesenai;
import java.util.ArrayList;

public class listasoma {
	
	public static void main(String[] args) {
		ArrayList <Integer> lista = new ArrayList <> ();
		int soma = 0; 
		
			lista.add(10);
			lista.add(4);
			lista.add(34);
			
		for (int i = 0; i < lista.size(); i ++) {
			soma += lista.get(i);
		}
		
		System.out.println(soma);
	}
}
