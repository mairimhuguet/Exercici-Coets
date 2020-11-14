package com.coets.project;

import java.util.ArrayList;
import java.util.List;

public class Coets {

	//Variables de la clase Coets: Codi, Potencia Max, Potencia Actual (inici=0)	
	private String Codi;
	private List<Integer> Potencia_prop = new ArrayList<Integer>();
	private List<Integer> Potencia_actual = new ArrayList<Integer>();
	
	//Constructor de la clase Coets
	
	public Coets(String codi, List<Integer> Potencia_prop, List<Integer> Potencia_actual) {
		
		this.Codi = codi;
		this.Potencia_prop = Potencia_prop;
		this.Potencia_actual = Potencia_actual;
		
		
		
	}

	//Getters i setters de codi i potencia propulsors
	
	public Coets() {
		// TODO Auto-generated constructor stub
	}

	public String getCodi() {
		return Codi;
	}

	public void setCodi(String codi) {
		Codi = codi;
	}

	public List<Integer> getPotencia_prop() {
		return Potencia_prop;
	}

	public void setPotencia_prop(List<Integer> potencia_prop) {
		Potencia_prop = potencia_prop;
	}
	
	//Contador de propulsors
	
	public int numero_propulsors = Potencia_prop.size();
	
	public int getNumPropulsors() {
		return Potencia_prop.size();
	}

	//Getters i setters de Potencia Actual
	
	public List<Integer> getPotencia_actual() {
		return Potencia_actual;
	}

	public void setPotencia_actual(List<Integer> potencia_actual) {
		Potencia_actual = potencia_actual;
	}

	//Mètodes del coet. Acelera i Frena
	//Acelera
	
	public void acelera(int propulsor_prop) {
		int prop_Pot_actual = Potencia_actual.get(propulsor_prop);
		int	prop_Pot_max = Potencia_prop.get(propulsor_prop);
		
		while (prop_Pot_actual<prop_Pot_max){
			prop_Pot_actual++;
			System.out.println("Potencia actual: "+prop_Pot_actual);
						
			try {
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("El propulsor ha llegado a la máxima potencia");
		Potencia_actual.set(propulsor_prop,prop_Pot_actual);
	}
	
	//Frena
	
	public void frena(int propulsor_prop) {
		int prop_Pot_actual = Potencia_actual.get(propulsor_prop);
//		int	prop_Pot_max = Potencia_prop.get(propulsor_prop);

		while (prop_Pot_actual>0){
			prop_Pot_actual--;
			System.out.println("Potencia actual: "+prop_Pot_actual);
			
			try {
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
		System.out.println("El propulsor ha llegado a 0");
		Potencia_actual.set(propulsor_prop,prop_Pot_actual);		
}
}

	
	

	
	
	
	
	
	
	
	
	

