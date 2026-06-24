package trees;

import node.node;

public class Ejercicio2 {

    public void inverTree(node<Integer> root){

        System.out.println("Arbol original:");

        printTree(root);

        invertirRecursivo(root);

        System.out.println("Arbol invertido:");

        printTree(root);

    }


    private void invertirRecursivo(node<Integer> root) {

        if(root == null){
            return;
        }

        node<Integer> temp = root.getLeft();

        root.setLeft(root.getRight());

        root.setRight(temp);


        invertirRecursivo(root.getLeft());

        invertirRecursivo(root.getRight());

    }


    private void printTree(node<Integer> root) {

        if(root == null){
            return;
        }


        System.out.print(root.getValue() + " ");

        printTree(root.getLeft());

        printTree(root.getRight());

    }

}