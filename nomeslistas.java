package listadeatividadesenai;
import java.util.ArrayList;

public class Nome {
	
	public static void main(String[] args) {
		ArrayList <String> detentos = new ArrayList <>();
		
		detentos.add("VITOR");
		detentos.add("SAMUEL");
		detentos.add("PEDRO");
		
		System.out.println(detentos);
		
		detentos.remove(1);
		
		System.out.println(detentos);
		
		detentos.add("YURI");
		
		System.out.println(detentos);
	}
}
