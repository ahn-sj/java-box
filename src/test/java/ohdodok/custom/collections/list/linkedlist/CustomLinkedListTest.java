package ohdodok.custom.collections.list.linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static ohdodok.custom.collections.list.linkedlist.CustomLinkedList.Node;

class CustomLinkedListTest {

    @Test
    @DisplayName("LinkedList")
    public void simple_linkedList() throws Exception {
        // given
        CustomLinkedList linkedList = new CustomLinkedList();

        linkedList.add(new Node("강낭콩"));
        linkedList.add(new Node("검은콩"));
        linkedList.add(new Node("땅콩"));
        linkedList.add(new Node("머리콩"));

        // when & then
        linkedList.printAll();
        System.out.println("=================");

        System.out.println(linkedList.get(2));
        System.out.println("=================");

        linkedList.remove(2);
        linkedList.printAll();
    }
}