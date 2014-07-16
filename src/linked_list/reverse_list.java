package linked_list;

public class reverse_list {
	public static node newhead;
	public static void main(String[] args) {
		int[] arr={2,3,4,3,6,9,2,1,1,2};
		linkedList list= new linkedList(arr);
		reverse2(list.head);
		list.head.next=null;
		list.head=newhead;
		
		node cur=list.head;
		while(cur!=null){
			System.out.print(cur.value+" ");
			cur=cur.next;
		}
		
	}
	
	public static void reverse1(node head){
		node cur=head;
		node prev=head;
		node temp=head;
		cur=cur.next;
		head.next=null;
		while(cur!=null){
			temp=cur;
			cur=cur.next;
			temp.next=prev;
			prev=temp;
		}
		
		head=temp;
		cur=head;
		while(cur!=null){
			System.out.print(cur.value+" ");
			cur=cur.next;
		}
		
	}
	
	
	public static node reverse2(node cur){
		if(cur.next==null) {newhead=cur; return cur;} 
		node tmp = reverse2(cur.next);
		tmp.next=cur;
		return cur;
	}
}
