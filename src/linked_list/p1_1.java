package linked_list;

import java.util.Hashtable;
public class p1_1 {
//Write code to remove duplicates from an unsorted linked list.
	
	public static void main(String[] args) {
		int[] arr={2,3,4,3,6,9,2,1,1};
		linkedList list= new linkedList(arr);
		System.out.println(count(list));

	}
	
	public static int count(linkedList list){
		int copies;
		Hashtable<Integer, Integer> hash=new Hashtable<Integer, Integer>();
		
		node cur, prev;
		cur=list.head;
		while(cur!=null){
			if(hash.containsKey(cur.value)){
				int times=hash.get(cur.value);
				hash.put(cur.value, times);
			}
			else{
				hash.put(cur.value, 1);
			}
			
			//hash.containsKey(cur.value)?hash.put(cur.value, 1):hash.put(cur.value, 1);
			cur=cur.next;
		}
	
		
		return 0;
	}

}
