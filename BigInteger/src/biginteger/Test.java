package biginteger;

import java.util.Scanner;

/**
 *
 * @author matychp
 */
public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        String unNumero = in.next();
        BigInteger biString = new BigInteger(unNumero);
        System.out.println("BigInteger String: " + biString.toString());
        
        int unArreglo[] = {1,2,3,4,5,6,7,8,9};
        BigInteger unBIconArreglo = new BigInteger(unArreglo);
        System.out.println("BigInteger Arreglo: " + unBIconArreglo.toString());        
        
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = in.nextInt();
        int unArregloPorTeclado[] = new int[n];
        int i = 0;
        while(i < unArregloPorTeclado.length){
            System.out.print("Ingrese el numero " + i + ": ");
            int num = in.nextInt();
            unArregloPorTeclado[i] = num;
            i++;
        }
        BigInteger unBIconArregloPorTeclado = new BigInteger(unArregloPorTeclado);
        System.out.println("BigInteger Arreglo cargado por teclado: " + unBIconArregloPorTeclado.toString());        
        
        System.out.print("Ingrese un numero A a sumar: ");
        String unNumeroAsumar = in.next();
        BigInteger biAsumar = new BigInteger(unNumeroAsumar);
        System.out.print("Ingrese un numero B a sumar: ");
        String unNumeroBsumar = in.next();
        BigInteger biBsumar = new BigInteger(unNumeroBsumar);
        System.out.println("Suma: " + biAsumar.suma(biBsumar));
        
        System.out.print("Ingrese un numero A a comparar: ");
        String unNumeroAcomparar = in.next();
        BigInteger biAcomparar = new BigInteger(unNumeroAcomparar);
        System.out.print("Ingrese un numero B a comparar: ");
        String unNumeroBcomparar = in.next();
        BigInteger biBcomparar = new BigInteger(unNumeroBcomparar);
        System.out.println("Son iguales?: " + biAcomparar.equals(biBcomparar));
    }
}
