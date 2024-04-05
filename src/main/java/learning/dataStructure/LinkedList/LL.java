package learning.dataStructure.LinkedList;

public class LL {
	
	Node head;
	
	static class Node {
		
		int data;
		Node next;
		Node(int d){
			data = d;
		}
	}
	
	 public static LL addLast(LL list, int data) 
	    { 
	        // Create a new node with given data 
	        Node new_node = new Node(data); 
	         
	   
	        // If the Linked List is empty, 
	        // then make the new node as head 
	        if (list.head == null) { 
	            list.head = new_node; 
	        } 
	        else { 
	            // Else traverse till the last node 
	            // and insert the new_node there 
	            Node last = list.head; 
	            while (last.next != null) { 
	                last = last.next; 
	            } 
	   
	            // Insert the new_node at last node 
	            last.next = new_node; 
	        } 
	   
	        // Return the list by head 
	        return list; 
	    } 

}
