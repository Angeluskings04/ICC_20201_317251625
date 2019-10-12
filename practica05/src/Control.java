import java.util.ArrayList;
import java.util.Arrays;

public class Control{

/**
    *Determina si una palabra es palindormo
    *Evaluando si la letra el inicio es igual que la ultima
    *@param Begin va tomando un valor pendiendo la ubicacion en la que se encuentre
    *@param end toma valores depedniendo la ubicacion
    * el if es el que valoa si son iguales o mayor
    * si es igual pasa al otro valor si no regresa falso 
    */
    public static boolean problema1(String palabra){
    	int begin = 0;
    	int end = palabra.length()-1 ;
    	boolean pali = true;
    	while(begin < end){
    		if(palabra.charAt(begin) != palabra.charAt(end)){
    		pali = false;
    	}
     begin ++;
     end --;   
    } return pali;

    }

    /*
    *Saber si los elementos del arreglo hay dos numeros si suamdos den k
    *Con el primer for se recorre un lugar en el arreglo
    *Con el if lo que va sumando dos valores
    *@param arreglo [i] toma un avlor y lo suma con el arrelo [j]
    * y lo valora si es igual a k (el numero deseado)
    */
    public static boolean problema2(int[] arreglo, int k){
    	boolean suma = false;
    	for(int i = 0; i < arreglo.length; i++){
    		for(int j = 1; j < arreglo.length; j++){
    			if(arreglo[i] + arreglo[j] == k){
    				suma = true;
    			}
    	    }   

        } return suma;

    }
    /*
    * Dado un arreglo A, retornar el mismo arreglo pero ordenado
    */
    public static void problema3(int[] arreglo){
         boolean swapped = true;
    int j = 0;
    int tmp;
    while (swapped) {
        swapped = false;
        j++;
        for (int i = 0; i < arreglo.length - j; i++) {
            if (arreglo[i] > arreglo[i + 1]) {
                tmp = arreglo[i];
                arreglo[i] = arreglo[i + 1];
                arreglo[i + 1] = tmp;
                swapped = true;
            }
        }
    }
}
    /*Búsqueda binaria, Dado un arreglo ordenado A, buscar un número K y regresar true si está, false en otro caso.
    */
    public static boolean problema4(int[] arreglo, int buscando){
        boolean search = false;
        for(int a = 0; a < arreglo.length; a++){
            if(arreglo[a] == buscando){
                search = true;
        }
    }return search;
 }
/*    Saber si un número K es primo, por ejemplo 17 regresa true, porque es primo 
*     Pero 18 es divisible entre 2, entonces no es primo, regresa false
*/
    public static boolean problema5(int n){
    	if( n==1)return false;
	for (int i = 2; i <n;i++){
		if (n%i==0)return false;
	}
        return true;
    }
    /*    Regresa todos los números primos menores a N. 
*Por ejemplo si N es 18 los números primos menores son 2, 3, 5, 7, 11, 13, 17
    */
    public static int[] problema6(int n){
        int contador = 0;
        for(int i= 1;i<=n; i++){
            if(problema5(i)){
                contador++;
            }
        }
        int[] primos = new int[contador];
        int con = 0;
        for(int z= 1; z < n; z++){
            if(problema5(z)){
                primos[con] =z;
                con++;
            }
        }
        return primos;
    }


    public static void main(String[] args) {
        String resultado = "";
        int[] desordenado = {9,8,7,6,5,4,3,2,1};
        int[] ordenado    = {1,2,3,4,5,6,7,8,9};
        int[] primos10 = {2,3,5,7};
        if(problema1("oso")==true && problema1("palabra")==false)resultado+="P1 bien\n";else resultado+="P1 mal\n";
        if(problema2(desordenado, 17)==true) resultado+="P2 bien\n";else resultado+="P2 mal\n";
        problema3(desordenado);
        if(Arrays.equals(desordenado,ordenado) == true)resultado+="P3 bien\n";else resultado+="P3 mal\n";
        if(problema4(desordenado,2)== true && problema4(desordenado,18)== false)resultado+="P4 bien\n";else resultado+="P4 mal\n";
        if(problema5(7)==true && problema5(6)==false)resultado+="P5 bien\n";else resultado+="P5 mal\n";
        if(Arrays.equals(problema6(10), primos10) == true)resultado+="P6 bien\n";else resultado+="P6 mal\n";
        System.out.println(resultado);   
    }

}
