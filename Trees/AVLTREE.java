class AVL{
	AVL left,right;
	int key;
	int height;
	AVL(int key){
		this.key=key;
		left=right=null;
		height=0;
		}
	}
class AVLTREE{
	public static int height(AVL node){
		if(node == null){
			return -1;
			}
		else{
			return node.height;
		    }
		}
        //LL ROTATION
	static AVL LL(AVL k2){
		AVL k1=k2.left;
		k2.left = k1.right;
		k1.right=k2;
		k2.height = Math.max(height(k2.left),height(k2.right))+1;
		k1.height = Math.max(height(k1.left),height(k1.right))+1;
		return k1;
		}
	//RR ROTATION
	static AVL RR(AVL k1)
	{
		AVL k2=k1.right;
		k1.right = k2.left;
		k2.left=k1;
		k2.height = Math.max(height(k2.left),height(k2.right))+1;
		k1.height = Math.max(height(k1.left),height(k1.right))+1;
		return k2;
		}
	//LR ROTATION
	static AVL LR(AVL k3){
		k3.left = RR(k3.left);
	        return (LL(k3));
	        }
	//RL ROTATION
	static AVL RL(AVL k1){
		k1.right = LL(k1.right);
		return (RR(k1));
		}
	//INSERTION
	static AVL insert(AVL node,int key){
		if(node == null){
			return (new AVL(key));
			}
		if(key<node.key){
			node.left = insert(node.left,key);
			if(height(node.left)-height(node.right)==2){
				if(key<node.left.key){
					node = LL(node);
					}
				else{
					node = LR(node);
				    }
			}
		}
		else if(key>node.key){
			node.right = insert(node.right,key);
			if(height(node.left)-height(node.right)==-2){
				if(key>node.right.key){
					node = RR(node);
					}
				else{
					node = RL(node);
				    }
			   }
	           }
	           node.height = Math.max(height(node.left),height(node.right))+1;
	           return node;
	 }
	 static void inorder(AVL node){
	  	
	 	if(node==null)
	 		return ;
	 	inorder(node.left);
	 	System.out.print(node.key+ " ");
	 	inorder(node.right);	
	 		
	}
	static AVL min(AVL node){
		if(node==null||node.left==null)
		  return node;
		return min(node.left);
	
	}
	static AVL delete(AVL node,int key){
		if(node == null){
			return node;
		}
		if(key<node.key){
			node.left = delete(node.left,key);
			}
		else if(key>node.key){
			node.right = delete(node.right,key);
			}
		else if(node.left!=null){
			node = node.left;
			}
		else if(node.right!=null){
			node = node.right;
			}
                else{
                	AVL l = min(node.right);
                	node.key = l.key;
                	node.right = delete(node.right,l.key);
                    }
                if(node!=null){
                        node.height = Math.max(height(node.left),height(node.right))+1;
                	if(height(node.left)-height(node.right)==2){
				if(height(node.left.left)>=height(node.left.right)){
					node = LL(node);
					}
				else{
					node = LR(node);
				    }
			}
			else if(height(node.left)-height(node.right)==-2){
				if(height(node.right.right)>=height(node.right.left)){
					node = RR(node);
					}
				else{
					node = RL(node);
				    }
			   }
	           }
	           return node;
	     }	
	
    public static void main(String []args){
	AVL node = null;
	int []a ={3,2,1,4,5,6,7};
	for(int i :a){
		node = insert(node,i);
		System.out.println(i+" "+height(node));
		}
	inorder(node);
	node = delete(node,7);
	inorder(node);
}
}

		
			
