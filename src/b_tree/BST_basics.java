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
		insert(7,head);
		insert(8,head);
		//delete(8, head, head);
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
	
	public static boolean delete(int v, Node node, Node parent){
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
				
			}
			else{//one leaf
				
			}
			
		}
		
		
		return true;
	}
	
}
