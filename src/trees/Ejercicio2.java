package trees;

import node.node;

public class Ejercicio2 {
    public void inverTree(node<Integer>root){
        System.out.println("Arbol original:");
        printTree(root);
        invertirRecursivo(root);
        System.out.println("Arbol invertido");
        printTree(root);

    }

    private void invertirRecursivo(node<Integer> root) {
        if (root == null){
            return;
        }
        System.out.println("actual" + root);
        invertirRecursivo(root.getLeft());
        invertirRecursivo(root.getRight());
    }

    private void printTree(node<Integer> root) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printTree'");
    }
}
