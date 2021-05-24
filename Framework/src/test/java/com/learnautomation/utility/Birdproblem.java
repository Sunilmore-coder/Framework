package com.learnautomation.utility;

import java.util.Scanner;

public class Birdproblem {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	       
	        int[] arr = new int[6];
	        
	        for(int i=0; i < n; i++){
	            arr[in.nextInt()]++;
	        }
	        int max = 0;
	        int maxVal = 1;
	        for(int i = 1; i < 6; i++){
	            if(arr[i] > max){
	                max = arr[i];
	                maxVal = i;
	            }
	        }
	        System.out.println(maxVal);
	    }
	}