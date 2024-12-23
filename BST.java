class Node{
    int key;
    Node left,right;
    Node(int key){
        this.key=key;
        left=right=null;
    }
}
class BST{
    //insertion traversal deletion
    static Node insertion(Node root,int key){
        if(root==null){
            return new Node(key);
        }
        if(key>root.key){
              root.right=insertion(root.right,key);
        }
        else{
            root.left=insertion(root.left,key);
        }
        return root;
    }
    static void inorder(Node root){
        if(root!=null){
        inorder(root.left);
        System.out.println(root.key);
        inorder(root.right);
        }
    }
    static void preorder(Node root){
        if(root!=null){
        System.out.println(root.key);
        preorder(root.left);
        preorder(root.right);
        }
    }
    static void postorder(Node root){
        if(root!=null){
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.key);
        }
    }
    static Node Min(Node curr){
        
        while(curr!=null&&curr.left!=null){
            curr = curr.left;

        }
          return curr;
    }
    static Node Del(Node root,int key){
        if(root==null){
            return root;
        }
        
        if(key<root.key){
            root.left = Del(root.left,key);
        }
        else if(key>root.key){
            root.right=Del(root.right,key);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            else{
                Node min = Min(root.right);
                root.key=min.key;
                root.right = Del(root.right,min.key);
            }

        }
        return root;
    }
    
        

    
    public static void main(String []args){
        Node root = null;
        root = insertion(root,10);
        insertion(root,5);
        insertion(root,20);
        insertion(root,7);
        insertion(root,30);
        insertion(root,15);
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
       int key = 10;
       root= Del(root,key);
       System.out.println("after deleting"+key);

        inorder(root);
        
    }
    

}