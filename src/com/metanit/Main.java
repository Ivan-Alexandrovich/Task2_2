package com.metanit;
/*Задать пустой целочисленный массив размером 8 С помощью цикла заполнить его
значениями 0 3 6 9 12 15 18 21;*/


public class Main {

    public static void main(String[] args) {
    

	int size = 8;
	int arr[] = new int [size];
    for (int i = 0; i < size; i++) {
        arr[i] = 3*i;
    }

        System.out.print("Your array:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]); // Выводим на экран, полученный массив
        }
    }
}
