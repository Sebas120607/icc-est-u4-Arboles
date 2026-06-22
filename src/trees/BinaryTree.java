package trees;

import node.node;

public class BinaryTree<T extends Comparable<T>> {
    private node<T>root;

    public BinaryTree(){
        this.root = null;
    }

    public node<T> getRoot() {
        return root;
    }

    public void setRoot(node<T> root) {
        this.root = root;
    }
    
    public void add (T value){
        node<T>node = new node<T>(value);
        root = addRecursivo(root,node);
    }
    private node<T> addRecursivo(
        node<T>actual,
        node<T>nodeInsertar){
            if(actual==null)
                return nodeInsertar;
            //if(actual.getValue()>nodeInsertar.getValue()){
            if(actual.getValue().compareTo(nodeInsertar.getValue())>0){
                actual.setLeft(nodeInsertar);

            }else{
                actual.setRight(nodeInsertar);
            }
            
            
            return null;    
        }
    public void preOrden(){
        preOrdenRecursivo(root);
    }
    private void preOrdenRecursivo(node<T>actual){
        if(actual == null)
            return;

        System.out.println(actual);
        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRight());
    }
    public void posOrdenRecursivo(){
        posOrdenRecursivo(root);
    }
    private void posOrdenRecursivo(node<T>actual){
        if(actual == null)
            return;

        posOrdenRecursivo(actual.getRight());
        posOrdenRecursivo(actual.getLeft());
        System.out.println(actual);
    }
    public void inOrden(){
        inOrdenRecursivo(root);
    }
    private void inOrdenRecursivo(node<T>actual){
        if(actual==null)
            return;

        inOrdenRecursivo(actual.getLeft());
        inOrdenRecursivo(actual.getRight());
        System.out.println(actual);

    }
    public int getHeight(){
        return getHeightRecursivo(root);
    }
    private int getHeightRecursivo(node<T>actual) {
        if (actual == null)
            return 0;

        int heightLeft = getHeightRecursivo(actual.getLeft());
        int heightRight = getHeightRecursivo(actual.getRight());

        int masAlto = Math.max(heightLeft, heightRight);
        return masAlto +1;
    }
    public int getWeight(){
        return getWeightRecursivo(root);
    }
    private int getWeightRecursivo(node<T>actual){
        if (actual == null)
            return 0;

        int weigthLeft = getWeightRecursivo(actual.getLeft());
        int weigthRight = getWeightRecursivo(actual.getRight());
        return weigthLeft + weigthRight + 1 ;
    }
    
}
