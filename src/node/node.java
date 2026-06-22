package node;

public class node<T> {
    private T Value;
    private node<T> Left;
    private node<T> Right;
    private node<Integer> root;

    //CREO UN NODO
    //INSTANCIO EL NODE -> Constructor
    //tiene que crearse con el valor 
    public node(T value) {
        this.Value = value;
        this.Right = null;
        this.Left = null;
    }

    public T getValue() {
        return Value;
    }

    public void setValue(T value) {
        Value = value;
    }

    public node<T> getLeft() {
        return Left;
    }

    public void setLeft(node<T> left) {
        Left = left;
    }

    public node<T> getRight() {
        return Right;
    }

    public void setRight(node<T> right) {
        Right = right;
    }
    


    public void setRoot(Integer value){
        node<Integer>node = new node<Integer>(value); {
            this.root = node;
        }
    }
}
