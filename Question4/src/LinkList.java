import java.util.ArrayList;

public class LinkList {
	public Node head;
	
	public int length = 0;
	
	public LinkList() {
		head = null;
	}
	
	public void insertSorted (){
		
		Node temp= new Node<T>();
		temp = head ;
		temp = temp.next;
		if ( head == null ) {
			temp.data = head.data;
		}
		
		if(temp.data < temp.next.data ) {
			temp.next.data = temp.data;
		}
	}
		
	
	}
	

