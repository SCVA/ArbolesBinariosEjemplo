/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package full.arbolesbinariosejemplo;

/**
 *
 * @author Sebastian
 */
public class ArbolesBinariosEjemplo {

    public static void main(String[] args) {
        BinaryTree arbolito = new BinaryTree(new TreeNode(10));
        arbolito.root=arbolito.insertarNodo(arbolito.root, new TreeNode(5));
        arbolito.root=arbolito.insertarNodo(arbolito.root, new TreeNode(3));
        arbolito.root=arbolito.insertarNodo(arbolito.root, new TreeNode(7));
        arbolito.root=arbolito.insertarNodo(arbolito.root, new TreeNode(15));
        arbolito.root=arbolito.insertarNodo(arbolito.root, new TreeNode(14));
        arbolito.root=arbolito.insertarNodo(arbolito.root, new TreeNode(13));
        arbolito.root=arbolito.insertarNodo(arbolito.root, new TreeNode(17));
        arbolito.root=arbolito.insertarNodo(arbolito.root, new TreeNode(16));
        arbolito.root=arbolito.insertarNodo(arbolito.root, new TreeNode(18));
        arbolito.root=arbolito.insertarNodo(arbolito.root, new TreeNode(19));
        arbolito.recorridoNiveles();
    }
}
