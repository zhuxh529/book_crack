package linked_list;

public class p2 {
	/*Implement an algorithm to find the nth to
	 *  last element of a singly linked list.*/
	public static int nth=-1;
	public static void main(String[] args) {
		int[] arr={2,3,4,3,6,9,2,1,1,1};
		linkedList list= new linkedList(arr);
		//getlastn_method1(5, list.head);
		System.out.println(getlastn_method2(4,list.head));
	}
	
	public static int getlastn_method1(int n, node cur){
		if(cur.next==null) return 1;
		int last=getlastn_method1(n, cur.next)+1;
		if(last==n) nth=cur.value;
		
		return last;
	}
	
	
	public static int getlastn_method2(int n, node head){
		node pt2=head;
		node pt1=head;
		
		for(int i=0; i< n;i++){
			pt1=pt1.next;
		}
		while(pt1!=null){
			pt1=pt1.next;
			pt2=pt2.next;	
		}	
		return pt2.value;
	}
	
	
}
