package trees;

import node.node;

public class Ejercicio1 {
    
    public void insert(int [] numeros){

        //CREAR EL ALBOL DE ENTEROS
        BinaryTree<Integer> tree = new BinaryTree<>();
        //INSERTAR CADA NUMERO
        for (int numero : numeros){
            tree.add(numero);
        }
        //IMPRIMIR EL ARBOL
        tree.inOrden();

    }
    public void printTree(node<Integer>root){
        System.out.println("Imprimiendo el arbol");
        printTreeRecursivo(root,0);

    }
    private void printTreeRecursivo(node<Integer> root, int nivel) {
        
    }
}
