package b_tree;

public class arrayToBST {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={1,2,3,4,5,6,7,8,9};
		Node n=transform(arr, 0, arr.length-1);
		System.out.println(n.data);
		BTreePrinter.printNode(n);
		
	}
	
	
	public static Node transform(int[] arr, int left, int right){
		if(right<left) return null;
		int mid=(left+right)/2;
		Node n=new Node(arr[mid]);
		n.left=transform(arr,left,mid-1);
		n.right=transform(arr,mid+1,right);
		return n;
	
	}
	
	
	
}
