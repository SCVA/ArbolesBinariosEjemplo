/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package full.arbolesbinariosejemplo;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Sebastian
 */
public class BinaryTree {
    TreeNode root;
    public BinaryTree(TreeNode raiz) {
        root = raiz;
    }
    
    public TreeNode insertarNodo(TreeNode nodoAnalizado, TreeNode nodo){
        if (nodoAnalizado == null) {
            nodoAnalizado = nodo;
            return nodoAnalizado;
        }
        if (nodo.data < nodoAnalizado.data) {
            nodoAnalizado.left = insertarNodo(nodoAnalizado.left, nodo);
        } else if (nodo.data > nodoAnalizado.data) {
            nodoAnalizado.right = insertarNodo(nodoAnalizado.right, nodo);
        }
        return nodoAnalizado;
    }
    
    public void recorridoNiveles(){
        Queue<TreeNode> recorrido = new LinkedList<TreeNode>();
        recorrido.add(root);
        while(!recorrido.isEmpty()){
            TreeNode aux = recorrido.peek();
            if(aux.left!=null)
                recorrido.add(aux.left);
            if(aux.right!=null)
                recorrido.add(aux.right);
            System.out.println(recorrido.poll().data);
        }
    }
}
