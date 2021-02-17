package example;
	import java.util.*;
	public class Circular_Array
	{
		int[] CircularRotate(int arr[], int d) 
	    { 
	        for (int i = 0; i < d; i++) 
	         { 
	        int j, temp; 
	        temp = arr[0]; 
	        for (j = 0; j< arr.length- 1; j++) 
	            arr[j] = arr[j + 1]; 
	        arr[j] = temp; 
	    }  return arr;
	    }
	   	  
	    // Driver program to test above functions 
	    public static void main(String[] args) 
	    { 
	        Circular_Array rotate = new Circular_Array(); 
	        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
	        int arr1[]=rotate.CircularRotate(arr, 2);
	        for (int i = 0; i <arr1.length; i++) 
	        {
	            System.out.print(arr1[i] + " "); 
	        }
	    } 
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	