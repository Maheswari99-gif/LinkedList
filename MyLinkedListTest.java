package com.capgemini.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
	@Test
	public void givenSearchValue_WhenInList_ShouldReturnTrue() {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		MyNode<Integer> node1 = new MyNode<Integer>(56);
		MyNode<Integer> node2 = new MyNode<Integer>(30);
		MyNode<Integer> node3 = new MyNode<Integer>(70);
		list.append(node1);
		list.append(node2);
		list.append(node3);
		list.printMyNodes();
		boolean result=list.search(30);
		Assert.assertTrue(result);
}
	@Test
	public void onInsertingAfterGivenValue_WhenSearched_ShouldReturnTrue() {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		MyNode<Integer> node1 = new MyNode<Integer>(56);
		MyNode<Integer> node2 = new MyNode<Integer>(30);
		MyNode<Integer> node3 = new MyNode<Integer>(70);
		list.append(node1);
		list.append(node2);
		list.append(node3);
		MyNode<Integer> node4 = new MyNode<Integer>(40);
		list.insertAfter(30, node4);
		list.printMyNodes();
		boolean result = list.search(40) && node4.getNext() == node3;
		Assert.assertTrue(result);
	}
	@Test
	public void onDeletingGivenValue_WhenSearched_ShouldReturnFalse_AndListSizeReducedByOne() {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		MyNode<Integer> node1 = new MyNode<Integer>(56);
		MyNode<Integer> node2 = new MyNode<Integer>(30);
		MyNode<Integer> node3 = new MyNode<Integer>(70);
		list.append(node1);
		list.append(node2);
		list.append(node3);
		MyNode<Integer> node4 = new MyNode<Integer>(40);
		list.insertAfter(30, node4);
		System.out.println("Before deletion: ");
		list.printMyNodes();
		int sizeBeforeDeletion=list.size();
		list.deleteNode(40);
		int sizeAfterDeletion=list.size();
		System.out.println("After deletion: ");
		list.printMyNodes();
		boolean result = (list.search(40)==false) || sizeAfterDeletion==sizeBeforeDeletion-1;
		Assert.assertTrue(result);
	}
	@Test
	public void given3Numbers_WhenUsingSortPrint_ShouldBeAddedInSortedManner() {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		MyNode<Integer> node1 = new MyNode<Integer>(56);
		MyNode<Integer> node2 = new MyNode<Integer>(30);
		MyNode<Integer> node3 = new MyNode<Integer>(40);
		MyNode<Integer> node4= new MyNode<Integer>(70);
		list.printSorted(node1);
		list.printSorted(node2);
		list.printSorted(node3);
		list.printSorted(node4);
		list.printMyNodes();
		System.out.print("Sorted Nodes :");
		MyNode<Integer> node=(MyNode<Integer>) list.head;
		boolean result= node==node2;
		node=node.getNext();
		result=result && node==node3;
		node=node.getNext();
		result=result && node==node1;
		node=node.getNext();
		result=result && node==node4;
		Assert.assertTrue(result);

	}

}
