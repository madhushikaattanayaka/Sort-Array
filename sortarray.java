/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//AA2109 A.M.M.S.Attanayake
package javap;

/**
 *
 * @author MADHUSHIKA
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

    
 public class sortarray { 
  public static void main(String[] args) { 
    ArrayList<String> list = new ArrayList<String>();
    
     System.out.println("__________________________Sorting Array Lists___________________________\n");
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter string count that you hope to input...\n");
    int count = scanner.nextInt();
    System.out.println("Enter strings... \n");
    
    for(int i=0 ; i<=count ; i++){
    		
            
    	String name = scanner.nextLine();
    	list.add(name);
    }
    
    
    Collections.sort(list);
    System.out.println("_________||Sorted Array||________\n");
    for (String i : list) {
      System.out.println(i);
    }
  } 



    
}
