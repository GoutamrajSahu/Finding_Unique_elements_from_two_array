package com.company;
import java.util.*;

class Main {
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the length of first arr.");
        int arr1Len = Sc.nextInt();
        System.out.println("Enter the length of first arr.");
        int arr2Len = Sc.nextInt();
        Vector<Integer> arr1 = new Vector<>();
        Vector<Integer> arr2 = new Vector<>();
        HashSet<Integer> addArr = new HashSet<Integer>();
        HashSet<Integer> resArr = new HashSet<Integer>();
        System.out.println("Enter the elements of first arr.");
        for(int i = 0; i<arr1Len; i++){
            int temp = Sc.nextInt();
            arr1.add(temp);
            addArr.add(temp);
        }
        System.out.println("Enter the elements of Second arr.");
        for(int i = 0; i<arr2Len; i++){
            int temp = Sc.nextInt();
            arr2.add(temp);
            addArr.add(temp);
        }

        for(int ele: addArr){
            int count = 0;

            for(int e: arr1){
                if(ele == e){
                    count++;
                }
            }

            for(int e: arr2){
                if(ele == e){
                    count++;
                }
            }

            if(count == 1){
                resArr.add(ele);
            }else{

            }
        }

        for(int ele: resArr){
            System.out.print(" "+ele);
        }

    }
}

