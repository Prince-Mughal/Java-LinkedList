/*
You may modify or reproduce.
Time: 04:39:17am Tuesday
Date: 23-08-2018
Email: mughalb9291@gmail.com
Bugs and Criticisms are warmly welcome :) 
(Improvements will be updated soon, like Generic Node )
*/

package linkedlist02;

public class Stack extends SinglyLinkedList{
   
    public void push(int data){
        insertAtHead(data);
    }
    public int pop(){
        return removeFromHead();
    }
    public int peak(){
        return whatOnMind();
    }
    
}

