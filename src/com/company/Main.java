package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random=new Random();

        int []array=new int[10];
        sorting(array);
        System.out.println();
        ArrayList<Integer>arrayList=new ArrayList<>();
        sorting(arrayList);
        System.out.println();
        LinkedList<Integer>linkedList=new LinkedList<>();
        sorting(linkedList);

    }
    public static void sorting(int []array){
        Random random=new Random();
        System.out.println("Array before sort:");
        for (int i=0; i< array.length; i++){
            int randomNumbers= random.nextInt(2);
            array[i]=randomNumbers;
            System.out.print(array[i]+" ");
        }
        Arrays.sort(array);
        System.out.println("\nArray after Sort:");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
    public static void sorting(ArrayList<Integer>arrayList){
        Random random=new Random();
        System.out.println("\nArrayList before sort:");
        for (int i=0; i<10; i++){
            int randomNumbers= random.nextInt(2);
            arrayList.add(randomNumbers);
            System.out.print(arrayList.get(i)+" ");
        }

        System.out.println("\nArrayList after sort:");
        Collections.sort(arrayList);
        for (int i=0; i< 10; i++){
            System.out.print(arrayList.get(i)+" ");
        }
    }
    public static void sorting(LinkedList<Integer>linkedList){
        Random random=new Random();
        System.out.println("\nLinkedList before sort:");
        for (int i=0; i<10; i++){
            int randomNumbers= random.nextInt(2);
            linkedList.add(randomNumbers);
            System.out.print(linkedList.get(i)+" ");
        }

        System.out.println("\nLinkedList after sort:");
        Collections.sort(linkedList);
        for (int i=0; i< 10; i++){
            System.out.print(linkedList.get(i)+" ");
        }
    }
}
