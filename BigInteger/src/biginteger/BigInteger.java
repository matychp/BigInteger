/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biginteger;

import java.util.LinkedList;

/**
 *
 * @author matychp
 */
public class BigInteger {

    private LinkedList<Integer> unNumero;

    public BigInteger() {
        unNumero = new LinkedList<>();
        unNumero.add(0);
    }

    public BigInteger(String val) {
        unNumero = new LinkedList<>();

        for (char letra : val.toCharArray()) {
            if (Character.isDigit(letra)) {
                String aux = "" + letra;
                unNumero.add(Integer.parseInt(aux));
            } else {
                //return throw new SeEncontroUnaLetra;
            }
        }
    }

    public BigInteger(int val[]) {
        unNumero = new LinkedList<>();

        for (Integer pos : val) {
            unNumero.add(pos);
        }
    }

    public BigInteger suma(BigInteger val) {
        BigInteger auxVal = val;
        LinkedList<Integer> auxUnNumero = unNumero;
        BigInteger suma = new BigInteger();
        suma.clear();

        int intVal, intNumero, intSuma;
        boolean carry = false;
        for (int i = auxVal.size(); i != 0; i--) {
            intSuma = 0;
            if(carry == true){
                intSuma += 1;
                carry = false;
            }
            intVal = auxVal.removeLast();
            intNumero = auxUnNumero.removeLast();
            intSuma += intVal + intNumero;
            if (intSuma > 9) {
                intSuma -= 10;
                suma.addFirst(intSuma);
                carry = true;
            }else{
                suma.addFirst(intSuma);
            }
        }
        return suma;
    }

    public void addFirst(int unNum) {
        unNumero.addFirst(unNum);
    }

    public void clear() {
        unNumero.clear();
    }

    public int size() {
        return unNumero.size();
    }

    public int removeLast() {
        return unNumero.removeLast();
    }

    @Override
    public String toString() {
        String unNumeroString = "";
        for (Integer unDigito : unNumero) {
            unNumeroString += unDigito.toString();
        }
        return unNumeroString;
    }
}
