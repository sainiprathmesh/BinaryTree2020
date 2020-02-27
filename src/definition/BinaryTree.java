/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 27/02/20
 *   Time: 8:33 AM
 */

package definition;

import adt.BinaryTreeADT;

public class BinaryTree<E> implements BinaryTreeADT<E> {
    @Override
    public boolean add(E data) {
        return false;
    }

    private static class Node<E> {
        private E data;
        private Node<E> leftChild;
        private Node<E> rightChild;
    }
}
