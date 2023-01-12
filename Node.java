public class Node {
    private Node parent;
    private Node lchild;
    private Node rchild;
    private int key;
    //constructor
    public Node(int _key){
        key = _key;
    }

    public void setKey(int key_){key = key_;}
    public int getKey(){
        return key;
    }

    public void setParent(Node par){
        parent = par;
    }
    public void setLchild(Node left){
        lchild = left;
    }
    public void setRchild(Node right){
        rchild = right;
    }


    public Node getParent(){
        return parent;
    }

    public Node getLchild(){
        return lchild;
    }
    public Node getRchild(){
        return rchild;
    }

    public Node minimum(){
        Node x = this;
        while(x.getLchild() != null){
            x = x.getLchild();
        }
        return x;
    }

}
