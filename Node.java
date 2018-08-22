/*
You may modify or reproduce.
Time: 04:39:17am Tuesday
Date: 23-08-2018
Email: mughalb9291@gmail.com
Bugs and Criticisms are warmly welcome :) 
(Improvements will be updated soon, like Generic Node )
*/

package linkedlist02;

// Node Class
public class Node {
    private int data; // Hold value
    private Node link; // Hold next Node
    /* Default Constructor zero-arg */
    public Node(){
        this(0);
    }// Zero-arg Constructor end here
    /* one-arg Constructor */
    public Node(int data){
        validateNodeData(data);
        link = null;
    }// One-arg Constructor end here
    /* Set this Node data */
    public void setNodeData(long data){
        validateNodeData(data);
    }// Method end here
    /* Get this Node data */
    public int getNodeData(){
       return data;
    }// Method end here
    /* Set the Next Node */
    public void setNodeLink(Object link){
        validateNodeLink(link);
    }// Method end here
    /* Get the Next Node */
    public Node getNodeLink(){
        return link;
    }// Method end here
    /* Data validate Check */
    private void validateNodeData(long data){
       
        if( data > Integer.MAX_VALUE){
            System.err.println("Sorry: Overflow has occured.Please recheck!");
            System.exit(0);
        }else if( data < Integer.MIN_VALUE){
            System.err.println("Sorry: Underflow has occured.Please recheck!");
            
            System.exit(0);        
        }else{
           
            this.data = (int)data;
        }
        
    }// Method end here
    /* Link validate Check */
    private void validateNodeLink(Object link){
        if(link instanceof Node){
            this.link = (Node)link;
        }else{
            System.err.println("Sorry: Wrong Argument.Please recheck!");
            System.exit(0);
        }
    }// Method end here
    
   
}// Node class end here 
