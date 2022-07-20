package listAssignment;

public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // your code here
    	head=null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    
    
    public void remove() {
    	Node prev = head;
    	Node runner = prev.next;
    	
        while(runner.next != null) {
        	prev = runner;
            runner = prev.next;
        }
        prev.next= null;
            
    }
    public void printValues() {
    	Node runner = head;
        while(runner != null) {
        	System.out.print(runner.value+" ");
            runner = runner.next;
        }
        System.out.println();
    }
    public Node find(int value) {
    	Node runner = head;
        while(runner != null) {
        	if (value ==runner.value) {
        		return runner;
        	}
            runner = runner.next;
        }
        return null;
    }
    
    public void removeAt(int index) {
    	Node prev = head;
    	Node runner = prev.next;
    	if (index==0) {
    		head=head.next;
    		prev.next=null;
    		
    	}
    	else {
	    	for(int i=1 ;i < index; i++) {
	            	prev = runner;
	                runner = prev.next;
	    	}
	    	prev.next= runner.next;
	    	runner = null;
	    	
    	}	
    }
}
