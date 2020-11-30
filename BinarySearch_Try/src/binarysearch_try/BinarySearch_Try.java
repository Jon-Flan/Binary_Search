/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch_try;

/**
 *
 * @author Jonathan
 */
public class BinarySearch_Try {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declare and initialize new Array List
       MyArrayList<Integer> mylist;
        mylist = new MyArrayList<Integer>();

       //set the number of times to repeat the for loop 
       int num_elems = 10;

       //for loop to add items to the list
        for (int i = 0; i < num_elems ; i ++ )
            {
                mylist.add(i);
             
            }
        
        //set the search item
        int search = 54;
        
        //Basic Binary search test
        if(mylist.BinarySearch(search, 0, mylist.size()-1) >= 0){
            System.out.println("For the Binary Search. The element was found at position: "+mylist.BinarySearch(search, 0, mylist.size()-1));
            System.out.println("You where looking for: " +search);
        }else{
            System.out.println("For the Binary Search. The element was not found.");
            System.out.println("You where looking for: " +search);
        }
            
            
        //Recursive Binary search test
        if(mylist.BinarySearchRecur(search, 0, mylist.size()-1) >= 0){
            System.out.println("For the Binary Recursive Search. The element was found at position: "+mylist.BinarySearchRecur(search, 0, mylist.size()-1));
            System.out.println("You where looking for: " +search);
        }else{
            System.out.println("For the Binary Recursive Search. The element was not found.");
            System.out.println("You where looking for: " +search);
        }
    }
    
}
