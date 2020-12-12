package com.baufest.ingreso.strings;

public class RepeatedCharacters {

    /**
     * El metodo debe retornar un booleano indicando si el parametro `cadena` cumple con alguna de las siguientes propiedades:
     * 1- Todos los caracteres aparecen la misma cantidad de veces.
     *     Ejemplos: "aabbcc", "abcdef", "aaaaaa"
     * 2- Todos los caracteres aparecen la misma cantidad de veces, a excepcion de 1, que aparece un vez mas o una vez menos.
     *     Ejemplos: "aabbccc", "aabbc", "aaaaccccc"
     * @param cadena la cadena a evaluar
     * @return booleano indicando si la cadena cumple con las propiedades
     */
    public Boolean isValid(String cadena) {
        //TODO: resolver
    	int largoCadena =cadena.length();
    	int[][]arrayCadena= new int [2][largoCadena];
    	

    	
    	for (int i=0; i<cadena.length();i++) {
    		
    		
    		for (int j=0; j<cadena.length();j++) {
    			
    			
    			if (arrayCadena[0][j]== 0 ) { //vacio
    				arrayCadena[0][j]= cadena.charAt(i); //se asigna la letra
    				arrayCadena[1][j]=(arrayCadena[1][j]+1); //contador +1
    				break;
    			}else if(arrayCadena[0][j] == cadena.charAt(i)) {
    				arrayCadena[1][j]=arrayCadena[1][j]+1;
    				break;
    			}
    			
    		}
    	}
    	
    	
    	/*
    	for (int i=0; i<cadena.length();i++) {

    		int count=0;
    		for (int j=0; j<cadena.length();j++) {
    			if (cadena.charAt(i) == cadena.charAt(j)) {
    				count ++;
    			}
    		}
    		arrayCadena[i][0]= cadena.charAt(i);
    		arrayCadena[i][1]= count ;
    	}
    	
    	//
    	*/
    	//restar la cantidad de las repeticiones de la primera letra a todas las demás repeticiones
    	//si sale 0 0 0 0 0, todas tienen el mismo valor
    	//0 0 1 0 0 se cumple la segunda condicion
    	//0 0 -1 0 0 se cumple la segunda condicion
    	//0 0 -2 0 0 no se cumple
    	//2 3 -1 8 1 no se cumple
    	//la sumatoria total de los valores absolutos del array de las repeticiones de las letras, 
    	//luego de la resta tiene que ser 0 o 1.
    	
    	int numeroRestar = arrayCadena[1][0];
    	for (int i=0;i<cadena.length();i++) {
    		if (arrayCadena[0][i]==0) {
    			break;
    		}
    		arrayCadena[1][i]=(arrayCadena[1][i]-numeroRestar);
    	}
    	 
    	
    	/*
    	int count = 0;
    	for (int i=0;i<cadena.length();i++) {
    		count=count+(arrayCadena[1][i]);
    	}
    	*/
    	int min=0;
    	int max=0;
    	for (int i=0;i<cadena.length();i++) {
    		if ( min >(arrayCadena[1][i])) {
    			min =arrayCadena[1][i];
    		}
    		if ( max <(arrayCadena[1][i])) {
    			max =arrayCadena[1][i];
    		}
    	}
    	
    	int count = max-min;
    	
    	if ((count==1)||(count==0)){
    		return true;
    	}else {
    		return false;
    	}
    	
    	
    	
        //throw new UnsupportedOperationException();
    }

}
