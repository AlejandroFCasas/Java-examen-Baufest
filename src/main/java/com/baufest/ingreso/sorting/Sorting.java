package com.baufest.ingreso.sorting;

import java.util.ArrayList;
import java.util.List;

public class Sorting {

    /**
     * Se debe ordenar primero por puntuación de manera descendente, luego por nombre de manera ascendente.
     * @param jugadores la lista de jugadores a ordena
     * @return la lista ordenada de jugadoresr
     */
	public static List<Jugador> ordenarPorPuntuacionYNombre(List<Jugador> jugadores){
	    //TODO: resolver
		

		Jugador auxiliar= new Jugador();

		for (int i=0;i<jugadores.size();i++) {
			if (jugadores.size() <2) {
				break;
			}
			for (int j=jugadores.size();j>0;j--) {
				if (((Jugador)jugadores.get(i)).getPuntuacion() < (((Jugador)jugadores.get(j)).getPuntuacion())){
					
					auxiliar = jugadores.get(i);
					jugadores.set(i, jugadores.get(j));
					jugadores.set(j, auxiliar);
			}
			}
		}
		
		System.out.println(jugadores.size());
		for (int i=0;i<jugadores.size();i++) {
			if (jugadores.size() <=1) {
				break;
			}
			for (int j=1;j<jugadores.size();j++) {
				
			char ii =(((Jugador)jugadores.get(i)).getNombre().charAt(i));
			char jj =(((Jugador)jugadores.get(i)).getNombre().charAt(j));	
				if (ii>jj){
					auxiliar = jugadores.get(i);
					jugadores.set(i, jugadores.get(j));
					jugadores.set(j, auxiliar);
			}
			
		}
		
		}
		
		
		
		return jugadores ;
		
		}
        //throw new UnsupportedOperationException();
	

    /**
     * Se debe ordenar primero por puntuación de manera descendente. 
     * Cuando 2 jugadores tienen igual cantidad de puntos,
     * el que tiene menos perdidas se lo considerara el mayor. 
     * Luego a igual puntos y perdidas se seguirá usando el nombre de manera ascendente.
     * @param jugadores la lista de jugadores a ordenar
     * @return la lista ordenada de jugadores
     */
	public static List<Jugador> ordenarPorPuntuacionPerdidasYNombre(List<Jugador> jugadores){
        //TODO: resolver
        //throw new UnsupportedOperationException();
		Jugador auxiliar= new Jugador();
		for (int i=0;i<jugadores.size();i++) {
			if (jugadores.size() <=1) {
				break;
			}
			for (int j=jugadores.size();j>0;j--) {
				if (((Jugador)jugadores.get(i)).getPuntuacion() < (((Jugador)jugadores.get(j)).getPuntuacion())){
					
					auxiliar = jugadores.get(i);
					jugadores.set(i, jugadores.get(j));
					jugadores.set(j, auxiliar);
			}
			}
		}
		for (int i=0;i<jugadores.size();i++) {
			
			for (int j=1;j<jugadores.size();j++) {
				
		int ii =(((Jugador)jugadores.get(i)).getPuntuacion());
		int jj =(((Jugador)jugadores.get(j)).getPuntuacion());
			if (ii==jj){
				if (((Jugador)jugadores.get(i)).getPerdidas()>((Jugador)jugadores.get(j)).getPerdidas())
				
				//* el que tiene menos perdidas se lo considerara el mayor. 
				
				auxiliar = jugadores.get(i);
				jugadores.set(i, jugadores.get(j));
				jugadores.set(j, auxiliar);
		}
		}
		}
		return jugadores;
	}
}
