import java.util.*;

class AVLnode{
    int key;
    AVLnode left,right;
    int height;
    AVLnode(int key){
        this.key=key;
        left=right=null;
        height=0;
    }
}
public class AVL{
public static int height(AVLnode node){
    if(node==null){
        return -1;
    }
    return node.height;
}    
public static AVLnode LL(AVLnode k2){
    AVLnode k1=k2.left;
    k2.left=k1.right;
    k1.right=k2;
    k1.height=Math.max(height(k1.left),height(k1.right))+1;
    k2.height=Math.max(height(k2.left),height(k2.right))+1;
    return k1;
}
public static AVLnode RR(AVLnode k1){
    AVLnode k2=k1.right;
    k1.right=k2.left;
    k2.left=k1;
    k1.height=Math.max(height(k1.left),height(k1.right))+1;
    k2.height=Math.max(height(k2.left),height(k2.right))+1;
    return k2;
}
public static AVLnode LR(AVLnode k3){
    k3.left=RR(k3.left);
    return (LL(k3));
}
public static AVLnode RL(AVLnode k1){
    k1.right=LL(k1.right);
    return(RR(k1));
}
public static AVLnode insert(int key,AVLnode node){
    if(node==null){
        return (new AVLnode(key));
    }
    if(key<node.key){
        node.left=insert(key,node.left);
    if(height(node.left)-height(node.right)==2){
        if(key<node.left.key)
            node=LL(node);
        else
            node=LR(node);
    }
    }
    if(key>node.key){
        node.right=insert(key,node.right);
        if(height(node.right)-height(node.left)==2){
            if(key>node.right.key)
                node=RR(node);
            else
                node=RL(node);
        }
    }
    node.height=Math.max(height(node.left),height(node.right))+1;
    return node;
}
public static AVLnode findMin(AVLnode node) {
      if (node == null || node.left == null)
       return node;
       return findMin(node.left);
}
public static AVLnode delete(int key,AVLnode node){
    if(node==null){
        return node;
    }
    if(key<node.key){
        node.left=delete(key,node.left);
    }
    else if(key>node.key){
        node.right=delete(key,node.right);
    }
    else{
        if(node.left!=null && node.right!=null){
            AVLnode node1=findMin(node.right);
            node.key=node1.key;
            node.right=delete(node1.key, node.right);
        }
        else{
            if(node.left!=null)
                node=node.left;
            else
                node=node.right;
        }
        if(node!=null){
            node.height=Math.max(height(node.left),height(node.right));
            if(height(node.left)-height(node.right)==2){
                if(height(node.left.left)>=height(node.left.right))
                    node=LL(node);
                else
                    node=LR(node);
            }
            else if(height(node.right)-height(node.left)==2){
                if(height(node.right.right)>=height(node.right.left))
                    node=RR(node);
                else
                    node=RL(node);
            }
        }

    }
    return node;

}
public static boolean Search(int key,AVLnode node){
    if(node==null)
        return false;
    else if(node.key==key)
        return true;
    else if(key<node.key)
        return Search(key, node.left);
    else if(key>node.key)
        return Search(key, node.right);
        
    return false;
    
}
public static void inOrder(AVLnode node){
    if(node!=null){
        inOrder(node.left);
        System.out.print(node.key+" ");
        inOrder(node.right);
    }
}
public static void main(String args[]){
    AVLnode root=null;
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size=");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter elements=");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i:arr){
        root=insert(i,root);
    }
    inOrder(root);
    System.out.println(" ");
    delete(20,root);
    inOrder(root);
    if(Search(21, root)){
        System.out.println("Key is found");
    }
    else{
        System.out.println("Key is not found");
    }
}
}
