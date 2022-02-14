package com.mycompany.generictupla;

public class Utilities {
    public static <T> boolean compare (T t1, T t2){
        GenericTupla Tupla1 = (GenericTupla) t1;
        GenericTupla Tupla2 = (GenericTupla) t2;
        return Tupla1.getKey().equals(Tupla2.getKey()) && Tupla1.getValue().equals(Tupla2.getValue());
    }
}
