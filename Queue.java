/*
You may modify or reproduce.
Time: 04:39:17am Tuesday
Date: 23-08-2018
Email: mughalb9291@gmail.com
Bugs and Criticisms are warmly welcome :) 
(Improvements will be updated soon, like Generic Node )
*/

package linkedlist02;

public class Queue extends SinglyLinkedList{
   
    public void enqueue(int data){
        insertAtTail(data);
    }
    public int dequeue(){
        return removeFromHead();
    }
    public int peak(){
        return whatOnMind();
    }
    
}

