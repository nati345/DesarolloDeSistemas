package ar.com.Natalia;

import java.util.ArrayList;
import java.util.List;

public class TitanesDelPacifico {

	public static void main(String[] args) {
		
		Habilidad volar = new Habilidad(100, "volar");
		Habilidad emitirRayos = new Habilidad(100, "tirarRayosLaser");
		
		List<Habilidad> habilidades = new ArrayList<>();
		habilidades.add(emitirRayos);
		habilidades.add(volar);
		//
		//	public Kaiju(String nombre, int peso, int dureza, int energia, int vida, int categoria,
		//			List<Habilidad> habilidades)
		//
		Kaiju kaiju = new Kaiju("oscar", 60, 80, 100, 90, 40, habilidades);

		System.out.println("Imprimir habilidades por pantalla con foreach:");

		for (Habilidad habilidad:habilidades){
			System.out.println(habilidad.getNombre());
		}

		System.out.println("Imprimir habilidades por pantalla con for común:");
		for (int i = 0; i < habilidades.size(); i++) {
			System.out.println(habilidades.get(i).getNombre());
		}
	}

}
