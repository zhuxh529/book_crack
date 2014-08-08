package b_tree;

public class balance {

	/**
	 * Check balance tree
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n=BTreePrinterTest.test1();
		BTreePrinter.printNode(n);
		System.out.println(balanced_3(n)>0?true:false);
	}
	
	public static int balanced(Node cur){
		if(cur==null) return 0;
		int left, right;
		left=balanced(cur.left);
		if(left==-1) return -1;
		right=balanced(cur.right);
		if(right==-1) return -1;
		
		if(Math.abs(left-right)>=2) return -1;
		else return Math.max(left,right)+1;
	}
	
	public static int balanced_2(Node cur){
		if(cur==null) return 0;
		int left=balanced_2(cur.left);
		int right=balanced_2(cur.right);
		if(left<0 || right<0) return -1;
		if(Math.abs(left-right)>=2) return -1;
		return Math.max(right, left)+1;
		
	}
	
	public static int balanced_3(Node n){
		if(n==null) return 0;
		
		int left=balanced_3(n.left);
		int right=balanced_3(n.right);
		if(left<0 || right<0) return -1;
		if(Math.abs(left-right)>1) return -1;
		
		return Math.max(left, right)+1;
		
		
	}
	
	
}
