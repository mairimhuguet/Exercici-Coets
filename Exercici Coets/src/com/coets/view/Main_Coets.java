package com.coets.view;

import com.coets.project.Accion;

import com.coets.project.Coets;
import com.coets.project.CoetsRepository;


import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;




public class Main_Coets  {

	
	public static void main(String[] args) {
	//static CoetsRepository coetsrepository = new CoetsRepository ();
		
		
		//Crear els COETS
		
		//Primer fiquem dos llistes amb les potencies dels propulsors màximes i actuals
		
		//Coet1.Potència màx
		
		List<Integer> Potencia_propulsors_coet1 = new ArrayList <Integer>();
		
		Potencia_propulsors_coet1.add(10);
		Potencia_propulsors_coet1.add(30);
		Potencia_propulsors_coet1.add(80);
		
		//Coet1.Potència actual (inici=0)
		
		List<Integer> Potencia_actual_coet1 = new ArrayList <Integer>();
		for (int i = 0; i < Potencia_propulsors_coet1.size(); i++) {
			Potencia_actual_coet1.add(0);
		}
		
		
		//Coet2.Potència màx
		
		List<Integer> Potencia_propulsors_coet2 = new ArrayList <Integer>();
		
		Potencia_propulsors_coet2.add(30);
		Potencia_propulsors_coet2.add(40);
		Potencia_propulsors_coet2.add(50);
		Potencia_propulsors_coet2.add(50);
		Potencia_propulsors_coet2.add(30);
		Potencia_propulsors_coet2.add(10);
		
		//Coet2.Potència actual (inici=0)
		
		List<Integer> Potencia_actual_coet2 = new ArrayList <Integer>();
		for (int i = 0; i < Potencia_propulsors_coet2.size(); i++) {
			Potencia_actual_coet2.add(0);
		}
		
		//Contem quants propulsors te cada coet
		
		int Num_Prop1 = Potencia_propulsors_coet1.size();
		int Num_Prop2 = Potencia_propulsors_coet2.size();
		
		
		
		//Creem els coets afegint-lis les potencies dels propulsors
		
		Coets coet1 = new Coets ("32WESSDS", Potencia_propulsors_coet1, Potencia_actual_coet1);
		Coets coet2 = new Coets ("LDSFJA32", Potencia_propulsors_coet2, Potencia_actual_coet2);
		
		//Afegir el coet1 i el coet2 a coets del Repository

		List<Coets> coets = new ArrayList<Coets>();
		coets.add(coet1);
		coets.add(coet2);
	
		CoetsRepository coetsrepository = new CoetsRepository (coets);
		
		//Explicacion
		System.out.println("Hola. Això és un exercici on hi ha dos coets, cadascun amb els seus propulsors. Pots accelerar o frenar un propulsor");
		
		
		//Mostrar codi dels coets i les potencies dels propulsors.
		
		System.out.println("El coet " + coet1.getCodi()+" té "+ Num_Prop1 + 
				" propulsors amb les següents potencies: " + Potencia_propulsors_coet1);
		
		System.out.println("El coet " + coet2.getCodi()+" té "+ Num_Prop2 + 
				" propulsors amb les següents potencies: " + Potencia_propulsors_coet2);

		
		
		//Preguntar al user quina acció vol fer: Accelerar o Frenar. Després quin coet vol que faci l'acció. Després quin propulsor vol escollir
		
		Scanner pregunta_user = new Scanner (System.in);
		int respuesta_user=0;
		
		boolean check = true;
		while(check) {
			System.out.println("Vols accelerar o frenar: \n 1 - Accelerar \n 2 - Frenar \n 3 - Cancelar");
		respuesta_user = pregunta_user.nextInt();
		
		switch (respuesta_user) {
		
		//Fer 3 casos. Cas 1= Accelerar. Cas 2= Frenar. Cas 3=Surt
		//Cas 1 = Accelerar
		//Ha contestado 1="Acelerar". Preguntarle qué cohete y qué propulsor elige.
		
		
		case 1:
			Scanner datos_introducidos_accion = new Scanner(System.in);
			System.out.println("Accelerar. Quin coet vols accelerar? \n Pulsa 0 - coet " + coet1.getCodi()+ "; \n Pulsa 1 - coet " + coet2.getCodi());
			int datos_introducidos_cohete = datos_introducidos_accion.nextInt();
			
			if(datos_introducidos_cohete == 0) {
				System.out.println("Accelerar. Quin propulsor vols accelerar?. Pulsa un numero de 0 a 2");
			}
			
			else {
				System.out.println("Accelerar. Quin propulsor vols accelerar?. Pulsa un numero de 0 a 5");
			}
			
			int datos_introducidos_propulsor = datos_introducidos_accion.nextInt();
			
						
			
			//Creamos el objeto de acelerar o frenar
			
			try {
				// coetsrepository.getCoets().get(datos_introducidos_cohete)
				Accion m = new Accion (coetsrepository.getCoets().get(datos_introducidos_cohete), datos_introducidos_propulsor, 'A');
				Thread t = new Thread (m,"coet:"+datos_introducidos_cohete+"prop:"+datos_introducidos_propulsor);
				t.start();
				t.join();
			} catch (Exception x) {
				x.printStackTrace();
			
			}
			break;
			
		//Cas 2 = Frenar
		//Ha contestat 2=Frenar. Quin coet i quin propulsor vol frenar?
		case 2:	
			Scanner datos_introducidos_accion2 = new Scanner(System.in);
			System.out.println("Frenar. Quin coet vols frenar? \n Pulsa 0 - coet " + coet1.getCodi()+ "; \n Pulsa 1 - coet " + coet2.getCodi());
			int datos_introducidos_cohete2 = datos_introducidos_accion2.nextInt();
			
			if(datos_introducidos_cohete2 == 0) {
				System.out.println("Frenar. Quin propulsor vols frenar?. Pulsa un numero de 0 a 2");
			}
			
			else {
				System.out.println("Frenar. Quin propulsor vols frenar?. Pulsa un numero de 0 a 5");
			}
			
			int datos_introducidos_propulsor2 = datos_introducidos_accion2.nextInt();
			
			
			

			
//Creamos el objeto de acelerar o frenar
			
			try {
				Accion m = new Accion (coetsrepository.getCoets().get(datos_introducidos_cohete2), datos_introducidos_propulsor2, '1');
				Thread t = new Thread (m,"coet:"+datos_introducidos_cohete2+"prop:"+datos_introducidos_propulsor2);
				t.start();
				t.join();
			} catch (Exception x) {
				x.printStackTrace();
			
			}	
				
			break;
			
			
//Cas 3 = Cancelar
		case 3:	
			check = false;
			break;


		
		
		}
}
}
}
