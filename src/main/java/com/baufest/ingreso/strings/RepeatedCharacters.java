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
    	
		//flojo //
    	for (int i=0; i<cadena.length();i++) {
    		for (int j=0;j<cadena.length();) { //es valido?
 
    		if (cadena.charAt(i) == arrayCadena[j][0]) {
    		int valor=arrayCadena[j][1];
    		valor++;
    		arrayCadena[j][1]=valor;//arrayCadena[j][1]++;
    		break;
    		}else {
    			arrayCadena[j][0]=cadena.charAt(i);
    			arrayCadena[j][1]=arrayCadena[j][1]++;
    			break;
    		
    		}	
    		}
    		
    		
    		}
    	//
    	
    	//****
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
    	//****
    	
    	
    	
        throw new UnsupportedOperationException();
    }

}
