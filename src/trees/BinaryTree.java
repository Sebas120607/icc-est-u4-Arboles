package trees;

import node.node;

public class BinaryTree<T extends Comparable<T>> {

    private node<T> root;


    public BinaryTree(){
        this.root = null;
    }


    public node<T> getRoot() {
        return root;
    }


    public void setRoot(node<T> root) {
        this.root = root;
    }


    public void add(T value){

        node<T> nuevo = new node<T>(value);

        root = addRecursivo(root, nuevo);

    }


    private node<T> addRecursivo(node<T> actual, node<T> nuevo){


        if(actual == null){

            return nuevo;

        }


        if(nuevo.getValue().compareTo(actual.getValue()) < 0){

            actual.setLeft(addRecursivo(actual.getLeft(), nuevo));


        }else{

            actual.setRight(addRecursivo(actual.getRight(), nuevo));

        }


        return actual;

    }


    public void preOrden(){

        preOrdenRecursivo(root);

    }


    private void preOrdenRecursivo(node<T> actual){

        if(actual == null)
            return;


        System.out.println(actual.getValue());

        preOrdenRecursivo(actual.getLeft());

        preOrdenRecursivo(actual.getRight());

    }


    public void inOrden(){

        inOrdenRecursivo(root);

    }


    private void inOrdenRecursivo(node<T> actual){

        if(actual == null)
            return;


        inOrdenRecursivo(actual.getLeft());

        System.out.println(actual.getValue());

        inOrdenRecursivo(actual.getRight());

    }


    public int getHeight(){

        return getHeightRecursivo(root);

    }


    private int getHeightRecursivo(node<T> actual){

        if(actual == null)

            return 0;


        int izquierda = getHeightRecursivo(actual.getLeft());

        int derecha = getHeightRecursivo(actual.getRight());


        return Math.max(izquierda, derecha) + 1;

    }


    public int getWeight(){

        return getWeightRecursivo(root);

    }


    private int getWeightRecursivo(node<T> actual){

        if(actual == null)

            return 0;


        return getWeightRecursivo(actual.getLeft()) 
             + getWeightRecursivo(actual.getRight()) 
             + 1;

    }

}