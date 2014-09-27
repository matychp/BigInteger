package biginteger;

import java.util.LinkedList;

/**
 *
 * @author matychp
 */
public class BigInteger {

    private LinkedList<Integer> bigInt;

    public BigInteger() {
        bigInt = new LinkedList<>();
        bigInt.add(0);
    }

    public BigInteger(String val) {
        bigInt = new LinkedList<>();

        for (char letra : val.toCharArray()) {
            if (Character.isDigit(letra)) {
                String aux = "" + letra;
                bigInt.add(Integer.parseInt(aux));
            }
        }
    }

    public BigInteger(int val[]) {
        bigInt = new LinkedList<>();

        for (Integer pos : val) {
            bigInt.add(pos);
        }
    }

    public BigInteger suma(BigInteger val) {
        BigInteger auxVal = val;
        LinkedList<Integer> auxThis = bigInt;
        BigInteger suma = new BigInteger();
        suma.clear();

        int intLastVal, intLastThis, sumaParcial;
        boolean carry = false;
        while(auxVal.size() != 0 || auxThis.size() != 0 || carry == true)
        {
            if(carry == true){
                sumaParcial = 1;
                carry = false;
            }else{
                sumaParcial = 0;
            }
            if(auxVal.size() != 0){    
                intLastVal = auxVal.removeLast();
            }else{
                intLastVal = 0;
            }
            if(auxThis.size() != 0){            
                intLastThis = auxThis.removeLast();
            }else{
                intLastThis = 0;
            }
            sumaParcial += intLastVal + intLastThis;
            if(sumaParcial >= 10){
                sumaParcial -= 10;
                carry = true;
            }
            suma.addFirst(sumaParcial);
        }
        return suma;
    }

    public void addFirst(int unNum) {
        bigInt.addFirst(unNum);
    }

    public void clear() {
        bigInt.clear();
    }

    public int size() {
        return bigInt.size();
    }

    public int removeLast(){
        return bigInt.removeLast();
    }

    @Override
    public String toString() {
        String unNumeroString = "";
        for (Integer unDigito : bigInt) {
            unNumeroString += unDigito.toString();
        }
        return unNumeroString;
    }
}
