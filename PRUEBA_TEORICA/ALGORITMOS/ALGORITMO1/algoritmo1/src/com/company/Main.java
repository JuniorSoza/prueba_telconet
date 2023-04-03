package com.company;

public class Main {

    public static void main(String[] args) {
        // INGRESO DE VARIABLES
        long numero = 2234322L;
        long times = 100_000_000;


        //variable de tiempo de duracion
        long duration = 0;
        boolean b = true;


        long start = System.nanoTime();
        for( int k = 0 ; k < times ; k++ ) {
            String i = Long.toString(numero);
            b = new StringBuilder(i).reverse().toString().equals(i);
        }
        duration = System.nanoTime() - start;

        //IMPRESION DE RESPUESTA
        if (b){
            System.out.printf("R: Simetrico %s %d ns%n", b, duration/times);
        }else{
            System.out.printf("R: No es simetrico %s %d ns%n", b, duration/times);
        }

    }
}
