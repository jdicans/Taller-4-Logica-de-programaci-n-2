
//21) Contar hojas del árbol
//Crea una función que cuente cuántos nodos son hojas (sin hijos).

public class App {
    // Clase interna que representa un nodo del árbol binario
    static class Node {
        int valor; // Valor almacenado en el nodo
        Node izquierda; // Referencia al hijo izquierdo
        Node derecha;   // Referencia al hijo derecho

        // Constructor del nodo
        Node(int value) {
            this.valor = value;
            this.izquierda = null;
            this.derecha = null;
        }
    }

    // Clase que representa el árbol binario
    static class ArbolBinario {
        Node raiz; // Nodo raíz del árbol

        // Constructor del árbol
        ArbolBinario() {
            this.raiz = null;
        }

        // Método para insertar un valor en el árbol
        void insertar(int value) {
            raiz = insertarRec(raiz, value);
        }

        // Método recursivo para insertar un valor en el árbol
        private Node insertarRec(Node root, int value) {
            if (root == null) {
                return new Node(value); // Si el nodo es nulo, crea uno nuevo
            }
            if (value < root.valor) {
                root.izquierda = insertarRec(root.izquierda, value); // Inserta en la izquierda
            } else if (value > root.valor) {
                root.derecha = insertarRec(root.derecha, value); // Inserta en la derecha
            }
            return root; // Retorna el nodo actual
        }

        // Método para contar las hojas del árbol
        int contarHojas() {
            return contarHojasRec(raiz);
        }

        // Método recursivo para contar las hojas de un nodo dado
        private int contarHojasRec(Node node) {
            if (node == null) {
                return 0; // Si el nodo es nulo, no hay hojas
            }
            if (node.izquierda == null && node.derecha == null) {
                return 1; // Si no tiene hijos, es una hoja
            }
            // Suma las hojas de los subárboles izquierdo y derecho
            return contarHojasRec(node.izquierda) + contarHojasRec(node.derecha);
        }
    }

    // Método principal
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArbolBinario arbol = new ArbolBinario(); // Crea un nuevo árbol binario
        arbol.insertar(5); // Inserta valores en el árbol
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(2);
        // Imprime el número de hojas en el árbol
        System.out.println("Número de hojas en el árbol: " + arbol.contarHojas());
    }
}