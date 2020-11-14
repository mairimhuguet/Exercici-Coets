package com.coets.project;

public class Accion implements Runnable{
	
	//Variables
	private Coets coet;
	private int propulsor_prop;
	private char accion;
	
	//Constructor
	public Accion (Coets coet, int propulsor_prop, char accion) {;
	
	this.coet=coet;
	this.propulsor_prop=propulsor_prop;
	this.accion=accion;
	}
	
	
	//Crear hilo
	public void run () {
//		accion=0;
//		propulsor_prop=0;
		
		
		if(accion == 'A') {
			coet.acelera(propulsor_prop);
		}else {
			coet.frena(propulsor_prop);
			
	}
	}
	
}

	
	
//	private int Respuesta_user;
//	
//	
//	public Accion(int respuesta_user) {
//		
//		Respuesta_user = respuesta_user;
//	}
//
//
//	@Override
//	public void run() {
//		
//		while(true) {
//			switch(Respuesta_user) {
//			case 1:
//				while (Pactual <= Pmax) {
//					Pactual ++;
//					
//				}
//				break;
//			case 2:
//				for (Pactual<= Pmax) {
//					Pmax --;
//					
//				}
//				break;
//			}
//		}
//		
//	}
	


