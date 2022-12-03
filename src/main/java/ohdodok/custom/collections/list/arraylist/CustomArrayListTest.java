package ohdodok.custom.collections.list.arraylist;

import java.util.ArrayList;

public class CustomArrayListTest {
    public static void main(String[] args) {
        CustomArrayList customList = new CustomArrayList();

        ArrayList<Object> arrayList = new ArrayList<>();

        if (arrayList.size() == customList.size()) {
            System.out.println("ok - 1");
        }
        customList.add("Korea");
        arrayList.add("Korea");

        if (arrayList.size() == customList.size()) {
            System.out.println("ok - 2");
        }

        if (customList.get(0) == arrayList.get(0)) {
            System.out.println("ok - 3");
        }
    }
}
