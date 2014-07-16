package linked_list;

public class linkedList {
	node head;
	public linkedList(int[] array){
		head=new node(array[0]);
		node current=head;
		node prev=head;
		for(int i=1; i<array.length; i++){
			current=new node(array[i]);
			prev.next=current;
			prev=current;
		}
	}
	
	
	public void print(){
		node cur=head;
		while(cur!=null){
			System.out.print(cur.value);
			cur=cur.next;
		}
	}
	
	
}
