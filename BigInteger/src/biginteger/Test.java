package biginteger;

import java.util.Scanner;

/**
 *
 * @author matychp
 */
public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        BigInteger unBIconString = new BigInteger("0000123");
        System.out.println("String: " + unBIconString.toString());
        
        int unArreglo[] = {1,2,3,4,5,6,7,8,9};
        //int unArreglo[] = {0,0,0,0,0,0,0,0};
        BigInteger unBIconArreglo = new BigInteger(unArreglo);
        System.out.println("Arreglo: " + unBIconArreglo.toString());
        
        /*
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = in.nextInt();
        int unArregloPorTeclado[] = new int[n];
        int i = 0;
        while(i < unArregloPorTeclado.length){
            System.out.println("Ingrese el numero: ");
            int num = in.nextInt();
            unArregloPorTeclado[i] = num;
            i++;
        }
        BigInteger unBIconArregloPorTeclado = new BigInteger(unArregloPorTeclado);
        System.out.println(unBIconArregloPorTeclado.toString());
        //*/
        
        BigInteger unBIA = new BigInteger("123");
        BigInteger unBIB = new BigInteger("123");
        System.out.println("Suma: " + unBIA.suma(unBIB));
        
        BigInteger unBIAA = new BigInteger("004456");
        BigInteger unBIBB = new BigInteger("123456");
        System.out.println("Son iguales?: " + unBIAA.equals(unBIBB));        
    }
}
