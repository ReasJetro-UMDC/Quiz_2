/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz_2;

import java.util.Scanner;

class Node {
    
   int data;
   Node next;
   
    public Node (int data) {
        
       this.data = data;
       this.next = null;
       
        
    }
    
}

class Store  {
    
  Node head;


    public  Store () {
        
        head = null;
    }
    
 public void AddStart (int data)  {
    Node newNode = new Node (data);
   if (head == null) {
      head = newNode; 
       
   } else {
      Node New =  head;
      while (New.next != null) {
          New = New.next;
          
          
      }
      New.next = newNode;
   }
     
     
     
 }
 
 public void AddEnd (int data) {
   Node newNode = new Node (data);
   
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        } 
     
 }
    
  public void Display () {
      Node current = head;
      
      while (current != null) {
          System.out.println(current.data + "," );
          current = current.next;
      }
      System.out.println();
      
  }  
   public boolean search (int data) {
     Node current = head;
     
        while(current != null) {
         if (current.data == data) {
             
             return true;
         }  
          current = current.next;  
        }
       return false;
       
   }
    
    
}









/**
 *
 * @author User
 */
public class Quiz_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Store List = new Store ();
        Scanner in = new Scanner (System.in);
        
        while (true) {
            System.out.println("Press 1 to insert a list at start");
            System.out.println("press 2 to insert a list at end");
            System.out.println("press 3 to display the List");
            System.out.println("press 4 to search the list");
            System.out.println("press 5 to exit hehehehehe");
            
           
          if (in.hasNextInt()) {
           int number = in.nextInt();
                
           switch (number) {
               
               case 1 -> {  
                   System.out.println("List you want to Insert");
                   int atthestart = in.nextInt();
                   List.AddStart(atthestart);
                    }                   
               
               case 2 -> { 
                   System.out.println("List you want to insert at end: ");
                   int attheEnd = in.nextInt();
                   List.AddEnd(attheEnd);
                    }
                
               case 3 -> {
                   System.out.println("=======The List======"); 
                   List.Display();
                    }
                
               case 4  ->{
                   System.out.println("Inter integer you want to search");
                   int poss = in.nextInt();
                   List.search(poss);
                    System.out.println("the list is naa sya ");
                    
               }
                 
               case 5 -> {
                   in.close();
                   System.exit(0);
                    }
                
                  
           }  
              
              
          } else {
              System.out.println("Invalid Input");
              in.nextLine();
          } 
            
            
            
        }
        
        
    }
    
}
