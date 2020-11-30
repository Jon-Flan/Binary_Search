/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch_try;

import java.util.ArrayList;

/**
 *
 * @author Jonathan
 */
public class MyArrayList<ElemType> extends ArrayList<ElemType> {
    
    //binary search 
    public int BinarySearch(ElemType key, int start, int end){
        //boolean for found
        boolean found = false;
        int middle = 0;
        
        //while loop 
        while((start <= end) && (found == false)){
        
            //set the middle element
            middle = (start + end) /2;
            
            //if statement
            if(((Comparable)get(middle)).compareTo((Comparable)key) == 0){
                found = true;
            }else if(((Comparable)get(middle)).compareTo((Comparable)key) < 0){
                start = middle +1;
            }else{
                end = middle -1;
            }
        }
        
        //if found return
        if(found == true){
            //return the position it was found at
            return middle;
        }else{
            return -1;
        }   
    }
    
    
    //Binary search recursive method
    public int BinarySearchRecur(ElemType key, int start, int end){
        
        if(end >= start){

           //set the middle element
           int middle = (start + end) /2;
            //base case 2
            if(((Comparable)get(middle)).compareTo((Comparable)key) == 0){
                return middle;
            }
            //check if its less
            if(((Comparable)get(middle)).compareTo((Comparable)key) < 0){
                return BinarySearchRecur(key, middle+1, end);
            }
            //if its greater than
            else{
                return BinarySearchRecur(key, start, middle-1);
            }
        }
        return -1;
    }
}
