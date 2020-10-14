package com.capgemini.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
	@Test
	public void givenSearchValue_WhenInList_ShouldReturnTrue() {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		MyNode<Integer> node1 = new MyNode<Integer>(56);
		//MyNode<Integer> node2 = new MyNode<Integer>(30);
		//MyNode<Integer> node3 = new MyNode<Integer>(70);
		list.append(node1);
		//list.append(node2);
		//list.append(node3);
		list.printMyNodes();
		boolean result=list.search(56);
		Assert.assertTrue(result);
	}

}
