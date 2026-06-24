import models.Persona;
import node.node;
import trees.BinaryTree;
import trees.Ejercicio1;
import trees.Ejercicio2;
import trees.IntTree;

public class App {

    public static void main(String[] args) throws Exception {

        runIntTree();
        runBinaryTree();
        runEjercicio1();
        runEjercicio2();

    }


    private static void runEjercicio1(){

        Ejercicio1 ejercicio1 = new Ejercicio1();

        int[] numeros = new int[]{5, 3, 7, 2, 4, 6, 8};

        ejercicio1.insert(numeros);

    }


    private static void runEjercicio2(){

        Ejercicio2 ejercicio2 = new Ejercicio2();

        int[] numeros2 = new int[]{5, 3, 7, 2, 4, 6, 8};

        BinaryTree<Integer> tree = new BinaryTree<>();

        for (int numero : numeros2){

            tree.add(numero);

        }

        node<Integer> root = tree.getRoot();

        ejercicio2.inverTree(root);

    }


    private static void runBinaryTree(){

        BinaryTree<String> arbolStrings = new BinaryTree<>();

        BinaryTree<Persona> arbolPersonas = new BinaryTree<>();

        arbolPersonas.add(new Persona("Pablo",30));
        arbolPersonas.add(new Persona("Ana",25));
        arbolPersonas.add(new Persona("Sebastian",29));
        arbolPersonas.add(new Persona("Jose",26));

    }


    private static void runIntTree(){

        IntTree arbolNumeros = new IntTree();

        //node<Integer> node1 = new node(50);
        //node<Integer> node2 = new node(10);
        //node<Integer> node3 = new node(30);

        //node1.setValue(50);
        //node1.setRight(node2);
        //node2.setLeft(node3);

        //System.out.println(arbolNumeros.getRoot());
        //System.out.println(arbolNumeros.getRoot().getLeft().getRight());

        //node3.setLeft(node1);

    }

}