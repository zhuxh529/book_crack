package b_tree;

public class BST_basics {
	static Node<Integer> head;
	public static void main(String[] args) {
		head = new Node<Integer>(5);
		insert(9,head);
		insert(2,head);
		insert(4,head);
		insert(1,head);
		insert(10,head);
		insert(6,head);
		insert(8,head);
		insert(7,head);
		delete(5, head, head);
		BTreePrinter.printNode(head);
	}
	
	public static void insert(int v, Node node){
		if(node.data.compareTo(v)>0 ){
			if(node.left==null){
				node.left=new Node<Integer>(v);
			}
			else{
				insert(v, node.left);
			}
		}
		else if(node.data.compareTo(v)<0){
			if(node.right==null){
				node.right=new Node<Integer>(v);
			}
			else{
				insert(v, node.right);
			}
		}
		else return;
		
	}
	
	public static boolean delete(Comparable v, Node node, Node parent){
		if(node.data.compareTo(v)>0 ){
			if(node.left==null){
				return false;
			}
			else{
				delete(v, node.left, node);
			}
		}
		else if(node.data.compareTo(v)<0){
			if(node.right==null){
				return false;
			}
			else{
				delete(v, node.right, node);
			}
		}
		else{
			//the item found
			Node l,r;
			l=node.left;
			r=node.right;
			if(l==null && r==null){//no leaf
				if(parent.data.compareTo(v)>0) parent.left=null;
				else parent.right=null;
				
			}
			else if(l!=null && r!=null){ //two leaf
				Comparable pred=findPre(node.left);	
				
				delete(pred, node.left,node);
				node.data=pred;
				
			}
			else{//one leaf
				Node replace=l==null?r:l;
				System.out.println(replace.data);
				if(parent.left==null){parent.right=replace;return true;}
				else if(parent.right==null) {parent.right=replace;return true;}
				
				if(parent.left.data.compareTo(node.data)==0){
					parent.left=replace;
				}
				else{
					parent.right=replace;
				}
			}
			
		}
		
		
		return true;
	}
	
	public static Comparable findPre(Node n){
		
		if(n.right==null) return n.data; 
		
		return findPre(n.right);
	}
	
}
