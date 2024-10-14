package ar.com.Natalia;

import java.util.ArrayList;
import java.util.List;

public class TitanesDelPacifico {

	public static void main(String[] args) {
		
		Habilidad volar = new Habilidad(100, "nombre");
		Habilidad emitirRayos = new Habilidad(100, "nombre");	
		
		List<Habilidad> habilidades = new ArrayList<>();
		habilidades.add(emitirRayos);
		habilidades.add(volar);
		
		Kaiju kaiju = new Kaiju("oscar", 60, 80, 100, 90, 40, 10,);
	}

}
