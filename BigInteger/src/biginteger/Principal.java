package biginteger;

import java.util.Scanner;

/**
 *
 * @author matychp
 */
public class Principal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        BigInteger unBIconString = new BigInteger("0000123");
        System.out.println(unBIconString.toString());
        
        //int unArreglo[] = {1,2,3,4,5,6,7,8,9};
        int unArreglo[] = {0,0,0,0,0,0,0,0};
        BigInteger unBIconArreglo = new BigInteger(unArreglo);
        System.out.println(unBIconArreglo.toString());
        
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
        
        BigInteger unBIA = new BigInteger("1123");
        BigInteger unBIB = new BigInteger("22947");
        System.out.println(unBIA.suma(unBIB));
    }
}
