package com.mycompany.generictupla;

public class Rep {
    public static void main(String args[]){
    GenericTupla<Double, Integer> tupla1 = new GenericTupla<>(9.0, 2);
    GenericTupla<Double, Integer> tupla2 = new GenericTupla<>(9.0, 2);
    
    boolean res = Utilities.compare(tupla1, tupla2);
    System.out.println ("¿Los objetos, son iguales? " + res);
}
}
