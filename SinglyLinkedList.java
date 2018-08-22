/*
You may modify or reproduce.
Time: 04:39:17am Tuesday
Date: 23-08-2018
Email: mughalb9291@gmail.com
Bugs and Criticisms are warmly welcome :) 
(Improvements will be updated soon, like Generic Node )
*/

package linkedlist02;


public class SinglyLinkedList {
    /* Maximum Capacity */
    public final long MAX_CAPACITY = 100000;
    private Node  head; /* Pointer to List Head */
    private Node  tail; /* Pointer to List Tail */
    private long  length; /* Current Elements */
    // zero-arg Constructor 
    public SinglyLinkedList(){
        head   = null;
        tail   = null;
        length = 0;
    }
    /* Insert at the Head */
    public void insertAtHead(int data){
        checkCapacity(); // Varify 
        Node node = createNode(data);
        if(head == null){
            head = node;
            tail = node;
            length++;
        }else{
            node.setNodeLink(head);
            head = node;
            length++;
        }
    
    }
    /* Insert at the Head */
    public int removeFromHead(){
        checkEmptiness();
        length--;
        Node tmp = head;
        int data = tmp.getNodeData();
        head = head.getNodeLink(); 
        tmp = null; // Release Memory 
        return data;
    }
    /* Insert at the Tail */
    public void insertAtTail(int data){
        checkCapacity(); /* Varify */ 
        Node node = createNode(data);
        Node tmp = null;
        if(head == null){
            head = node;
            tail = node;
            length++;
        }else{
            tail.setNodeLink(node);
            tail = node;
            length++;
        }
    
    
    
    }
    /* Create Node Helper Method */
    private Node createNode(int data){
        Node node = new Node(data);
        if(node == null){
            System.err.println("Sorry, Memory allocation failed.");
            System.exit(0);
        }
        return node;
    }
    /* Print the content of List */
    public void printList(){
        checkEmptiness(); /* Varify */
        Node current = head;
        while(current != null){
            System.out.println(current.getNodeData());
            current = current.getNodeLink();
        }
        
        
    }
    
    /* Check Capacity */
    private void checkCapacity(){
        if(this.length >= MAX_CAPACITY){
            System.err.println("Sorry, Overflow has occured.");
            System.exit(0);
        }
    }
    /* Check Emptiness */
    private void checkEmptiness(){
         if(length == 0){
            System.err.println("Sorry, Underflow has occured.");
            System.exit(0);
         }
    }
    /* Current Elements */
    public long length(){
        return this.length;
    }
    /* Get List's Value at Head */
    protected int whatOnMind(){
        checkEmptiness();
        return head.getNodeData();
    }
    
}
