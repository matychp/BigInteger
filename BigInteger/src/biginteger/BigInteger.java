package biginteger;

import java.util.LinkedList;
import java.util.Iterator;

/**
 *
 * @author matychp
 */
public class BigInteger {

    //private LinkedList<Integer> bigInt;
    private DoubleList<Integer> bigInt;

    /**
     * Constructor sin parametros que crea un numero valiendo 0.
     */
    public BigInteger() {
//        bigInt = new LinkedList<>();
        bigInt = new DoubleList<>();
        bigInt.addFirst(0);
    }

    /**
     * Constructor que toma como unico parametro una cadena.
     *
     * @param val String que contiene el numero a almacenar como BigInteger.
     */
    public BigInteger(String val) {
//        bigInt = new LinkedList<>();
        bigInt = new DoubleList<>();

        String aux;
        for (char letra : val.toCharArray()) {//El ciclo for se encarga de tomar cada caracter del String. Primero toma el primer caracter del String, y asi, hasta el ultimo caracter.
            if (Character.isDigit(letra)) {//El if se encarga de chequear si el numero es un digito, de ser correcto lo agrega al numero. Si no es un digito, no se agrega.
                aux = "" + letra;//Esto convierte el char en String (magia :D).
                bigInt.addLast(Integer.parseInt(aux));
            }
        }
        this.limpiarCeros();
    }

    /**
     * Constructor que toma como unico parametro un arreglo unidimensional.
     *
     * @param val un arreglo unidimensional de tipo Integer que contiene el
     * numero a almacenar como BigInteger.
     */
    public BigInteger(int val[]) {
//        bigInt = new LinkedList<>();
        bigInt = new DoubleList<>();

        for (Integer unDigito : val) {
            bigInt.addLast(unDigito);
        }
        this.limpiarCeros();
    }

    /**
     * Suma dos numeros BigInteger, donde el primer termino de la suma es this
     * (o sea, el objeto que llamo al metodo sumar()), y el segundo termino es
     * el que ingreso como parametro.
     *
     * @param val un BigInteger que se situa como segundo termino en la suma.
     * @return un BigInteger con la suma de this + parametro.
     */
    public BigInteger suma(BigInteger val) {
        BigInteger suma = new BigInteger();
        suma.clear();

        Iterator itA = this.iterator(false);
        Iterator itB = val.iterator(false);

        boolean carry = false;
        int intLastB, intLastA, sumaParcial;
        while (itA.hasNext() || itB.hasNext() || carry == true) {
            if (carry == true) {
                sumaParcial = 1;
                carry = false;
            } else {
                sumaParcial = 0;
            }
            intLastB = 0;
            intLastA = 0;
            if (itA.hasNext()) {
                intLastA = (Integer) itA.next();
            }
            if (itB.hasNext()) {
                intLastB = (Integer) itB.next();
            }
            sumaParcial += intLastA + intLastB;
            if (sumaParcial >= 10) {
                sumaParcial -= 10;
                carry = true;
            }
            suma.addFirst(sumaParcial);
        }
        return suma;
    }

    /**
     * Agrega un Integer al comienzo de la LinkedList. La insercion se realiza
     * primero el ultimo digito (el de la derecha), y luego el siguiente digito
     * a su izquierda.
     *
     * @param unNum un numero int a agregar.
     */
    public void addFirst(int unNum) {
        bigInt.addFirst(unNum);
    }

    /**
     * Elimina el BigInteger almacenado. Sin poner un cero en su lugar.
     */
    public void clear() {
        bigInt.clear();
    }

    /**
     * Devuelve la cantidad de digitos del numero.
     *
     * @return cantidad de digitos del numero.
     */
    public int size() {
        return bigInt.size();
    }

    /**
     * Retorna el ultimo digito de un numero (es decir el ubicado a la derecha).
     * Se utiliza en el metodo suma()
     *
     * @return el ultimo digito del numero.
     */
    public int removeLast() {
        return bigInt.removeLast();
    }

    /**
     * Retorna el numero almacenado como una cadena de caracteres.
     *
     * @return String el numero como cadena de caracteres.
     */
    @Override
    public String toString() {
        String unNumeroString = "";
        Iterator it = bigInt.iterator(true);
        while (it.hasNext()) {
            unNumeroString += it.next().toString();
        }
        return unNumeroString;
    }

    /**
     * Borra los ceros de más que se ingresen a la izquierda de un número. Ej:
     * 000123. El bigInt quedará como: 123. Esto debido a que matematicamente
     * hablando los numeros 0 ubicados a la izquierda en la parte entera de un
     * numero no tienen valor a menos que uno de todos los numeros que haya a su
     * izquierda sea mayor a 0.
     */
    public void limpiarCeros() {
        while (bigInt.size() > 1 && bigInt.getFirst() == 0) {//Elimina siempre y cuando exista más de un digito. (Para evitar que el numero entero 0 no sea borrado).
            bigInt.removeFirst();
        }
    }

    /**
     * Crea un iterador para recorrer el BigInteger.
     *
     * @param sentido
     * @return
     */
    public Iterator iterator(boolean sentido) {
        return this.bigInt.iterator(sentido);
    }

    /**
     * Compara dos numeros, si son iguales retorna true, si no, retorna false
     *
     * @param val BigInteger a comparar contra el BigInteger this.
     * @return true si son iguales, false si son distintos.
     */
    public boolean equals(BigInteger val) {
        if (this.size() == val.size()) {
            Iterator itA = this.iterator(false);
            Iterator itB = val.iterator(false);
            
            while(itA.hasNext() && itB.hasNext()){
                if(itA.next() != itB.next()){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
