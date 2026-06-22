package trees;
//Clase Arbol solo de enteros

import node.node;

public class IntTree {

    private node<Integer> root;

    public IntTree(){
        this.root = null;
    }

    public node<Integer> getRoot() {
        return root;
    }

    public void setRoot(node<Integer> root) {
        this.root = root;
    }
    
    public void add (int value){
        node<Integer>node = new node<Integer>(value);
        root = addRecursivo(root,node);
    }
    private node<Integer> addRecursivo(
        node<Integer>actual,
        node<Integer>nodeInsertar){
            if(actual==null)
                return nodeInsertar;
            if(actual.getValue()>nodeInsertar.getValue()){
                actual.setLeft(nodeInsertar);

            }else{
                actual.setRight(nodeInsertar);
            }
            
            
            return null;    
        }
    public void preOrden(){
        preOrdenRecursivo(root);
    }
    private void preOrdenRecursivo(node<Integer>actual){
        if(actual == null)
            return;

        System.out.println(actual);
        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRight());
    }
    public void posOrdenRecursivo(){
        posOrdenRecursivo(root);
    }
    private void posOrdenRecursivo(node<Integer>actual){
        if(actual == null)
            return;

        posOrdenRecursivo(actual.getRight());
        posOrdenRecursivo(actual.getLeft());
        System.out.println(actual);
    }
    public void inOrden(){
        inOrdenRecursivo(root);
    }
    private void inOrdenRecursivo(node<Integer>actual){
        if(actual==null)
            return;

        inOrdenRecursivo(actual.getLeft());
        inOrdenRecursivo(actual.getRight());
        System.out.println(actual);

    }
    public int getHeight(){
        return getHeightRecursivo(root);
    }
    private int getHeightRecursivo(node<Integer>actual) {
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
    private int getWeightRecursivo(node<Integer>actual){
        if (actual == null)
            return 0;

        int weigthLeft = getWeightRecursivo(actual.getLeft());
        int weigthRight = getWeightRecursivo(actual.getRight());
        return weigthLeft + weigthRight + 1 ;
    }
    

}
