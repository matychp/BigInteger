/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biginteger;

/**
 *
 * @author matychp
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigInteger unBIconString = new BigInteger("12345678987654321");
        System.out.println(unBIconString.toString());
        
        int unArreglo[] = {1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1};
        BigInteger unBIconArreglo = new BigInteger(unArreglo);
        System.out.println(unBIconArreglo.toString());
        
        BigInteger unBIA = new BigInteger("193857835793");
        BigInteger unBIB = new BigInteger("092382422724");
        System.out.println(unBIA.suma(unBIB));
    }
    
}
