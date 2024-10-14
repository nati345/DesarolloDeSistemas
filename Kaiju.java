package ar.com.Natalia;

import java.util.List;

public class Kaiju {

	String nombre;
	int peso;
	int dureza;
	int energia;
	int vida;
	int categoria;
	List<Habilidad>Habilidades;
	
	public Kaiju(String nombre, int peso, int dureza, int energia, int vida, int categoria,
			List<Habilidad> habilidades) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.dureza = dureza;
		this.energia = energia;
		this.vida = vida;
		this.categoria = categoria;
		Habilidades = habilidades;
	}

	

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		nombre = nombre;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getDureza() {
		return dureza;
	}
	public void setDureza(int dureza) {
		this.dureza = dureza;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public List<Habilidad> getHabilidades() {
		return Habilidades;
	}
	public void setHabilidades(List<Habilidad> habilidades) {
		Habilidades = habilidades;
	}
		
	

}
