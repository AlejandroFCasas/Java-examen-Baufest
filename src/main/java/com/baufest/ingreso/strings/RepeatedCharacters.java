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
    	int [][] arrayCadena= new int [1][cadena.length()];
    	
    	for (int i=0; i<cadena.length();i++) {
    		
    		arrayCadena[0][0]=cadena.charAt(i);
    		arrayCadena[0][1]=arrayCadena[0][1]++;
    		
    		for (int j=0;j<cadena.length();j++) {
 
    		if (cadena.charAt(j) == arrayCadena[j][0]) {
    		int valor=arrayCadena[j][1];
    		valor++;
    			arrayCadena[j][1]=valor;//arrayCadena[j][1]++;
    		}
    		else {
    			arrayCadena[j][0] = cadena.charAt(j);
    			arrayCadena[j][1] = arrayCadena[j][1]+1;
    			
    			
    		}
    		}
    		
    	}
    	
    	
    	
    	
        throw new UnsupportedOperationException();
    }

}
