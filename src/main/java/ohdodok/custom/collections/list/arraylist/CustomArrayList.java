package ohdodok.custom.collections.list.arraylist;

/**
 * Reference
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html
 *
 * // 4. remove
 * E remove(int index): Removes the element at the specified position in this list.
 */
public class CustomArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA = {};

    // Doc Desc: non-private to simplify nested class access
    // Q> what is transient?
    private Object[] elements;
    private int elementSize;

    public CustomArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public CustomArrayList(int capacity) {
        if (capacity == 0) {
            this.elements = DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA;
        } else if (capacity < 0) {
            throw new IllegalArgumentException("CustomArrayList: 0 이상의 값을 입력해주세요. capacity = " + capacity);
        }
        elements = new Object[capacity];
    }

    public int size() {
        return elementSize;
    }

    public boolean add(Object o) {
        elementSize++;

        if (elementSize == elements.length + 1) {
            Object[] newElement = new Object[elementSize];

            for (int i = 0; i < newElement.length; i++) {
                newElement[i] = elements[i];
                System.out.println("i = " + i);
            }
            newElement[elementSize - 1] = o;
            elements = newElement;
        }
        elements[elementSize - 1] = o;

        return true;
    }

    public Object get(int index) {
        if(index < 0 || elementSize < index) {
            throw new IndexOutOfBoundsException("IOOB Exception: 범위를 벗어났습니다. index = " + index);
        }
        return elements[index];
    }
}
