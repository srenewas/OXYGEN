package com.seenu;

public class test {
	public static void main(String[] args) {
	    int[] a= {23,67,32,12,9};
	    int min =a[0];
	    int max = 0;
	    for(int i=0;i<a.length;i++) {
	    	if(a[i]>max) {
	    		max=a[i];
	    	}else if(a[i]<min) {
	    	   min=a[i];	
	    	}
	    }
	    System.out.println("MAX :"+max);
	    System.out.println("MIN :"+min);
	}
}
