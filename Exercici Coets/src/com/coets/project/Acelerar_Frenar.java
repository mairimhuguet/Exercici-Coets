//package com.coets.project;
//
//public abstract class Acelerar_Frenar implements Runnable {
//
//	//Variables de la clase Acelerar_Frenar: Quin coet, quin propulsor i quina acció: accelerar frenar
//	
//	private Coets coet_acel_fren;
//	private int propulsor_acel_fren;
//	private String acel_fren;
//	
//	
//	// Contructor del objeto Acelerar_Frenar
//	
//	public Acelerar_Frenar(Coets coet_acel_fren, int propulsor_acel_fren, String acel_fren) {
//		
//		this.coet_acel_fren = coet_acel_fren;
//		this.propulsor_acel_fren = propulsor_acel_fren;
//		this.acel_fren = acel_fren;
//	}
//	
//
//	// Crear HILO acelerar/frenar
//	
//	public void run() {
//		
//		if (acel_fren == "acelerar") {
//			coet_acel_fren.acelera(propulsor_acel_fren);
//		}
//		else {
//			coet_acel_fren.frena(propulsor_acel_fren);
//		}
//	}
//	
//	
//}
