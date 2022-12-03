package collections.list.arraylist;

import java.util.ArrayList;

/**
 * Reference
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html
 *
 * // 1. Constructor
 * public ArrayList()
 * public ArrayList(int initialCapacity)
 *
 * // 2. add
 * add(E e): Appends the specified element to the end of this list.
 *
 * // 3. get
 * get(int index): Returns the element at the specified position in this list.
 *
 * // 4. remove
 * remove(int index): Removes the element at the specified position in this list.
 */
public class CustomArrayList {
    private Object[] element;

    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA = {};

    public CustomArrayList() {
        element = DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA;
    }

    public CustomArrayList(int capacity) {
        if(capacity == 0) {
            element = DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA;
        } else if(capacity < 0) {
            throw new IllegalArgumentException("CustomArrayList: 0 이상의 값을 입력해주세요. capacity = " + capacity);
        }
        element = new Object[capacity];
    }
    
}
