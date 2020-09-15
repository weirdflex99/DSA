package linkedlist;
class Node{
	int data;
	Node next;
	Node(int d)
	{
		data=d;
	}
}
class List{
	Node head;
	Node tail;
	void insert_front(int d)
	{
		Node temp=new Node(d);
		temp.next=head;
	    head=temp;
	    
		
	}
	void insert_end(int d)
	{
		Node temp=new Node(d);
		if(head==null)
		{
			head=temp;
			return;
		}
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=temp;
	}
	void insert_post(int post,int d) {
		
		Node temp=new Node(d);
		Node current=head;
		while(--post>0)
		{
			current=current.next;
		}
		
		temp.next=current.next;
		current.next=temp;
		
		
		
	}
	void print() {
		Node current=head;
		if(head==null) {
			System.out.println("empty");
		}
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	
}
public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List l=new List();
     l.insert_front(23);
     l.insert_front(8);
     l.insert_front(3);
     l.insert_front(82);
     l.insert_end(90);
     l.print();
     System.out.println();
     l.insert_post(3,45);
     l.print();
	}

}
