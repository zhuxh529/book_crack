package b_tree;

public class balance {

	/**
	 * Check balance tree
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n=BTreePrinterTest.test3();
		BTreePrinter.printNode(n);
		System.out.println(balanced(n)>0?true:false);
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

}
