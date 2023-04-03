package com.company;

public class Main {

    public static void main(String[] args) {

        //instancia de la clase combSort
        CombSort ob = new CombSort();

        //Ingreso del array desordenado
        int arr[] = { 1, 4, 1, 56, 3, -44, 23, -6, 28, 0 };

        //consumo del sort
        ob.sort(arr, arr.length);

        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");

    }

}

