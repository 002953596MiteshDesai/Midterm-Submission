package com.company;
//Complexity is O(n)
import java.util.LinkedList;
import java.util.Queue;

class BinaryTree <T> {
	public Node<T> root;
	
	
	
	public void popluatenextLeft() {
		if (root == null) {
			return;
		}
		
		Queue<Node<T>> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);
		
		while (queue.size() != 0) {
			Node<T> node = queue.remove();
			
			if (node != null) {
				System.out.printf(node.data + " , ");
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.left);
				}
			} else {
				// We have reached to a new level
				System.out.println();
				if (queue.size() == 0) {
					break;
				}
				queue.add(null);
			}
		}
	}
}
	