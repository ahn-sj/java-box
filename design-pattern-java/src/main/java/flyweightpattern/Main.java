package flyweightpattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int index = 5;
        while (index > 0) {
            System.out.print("[기회 " + index + "] 원하는 색을 입력해주세요: ");
            String input = scan.nextLine();
            Tree tree = TreeFactory.getTree(input);

            int rand = (int) (Math.random() * 100);
            tree.setXY(rand, rand);
            tree.install();

            index--;
        }
    }
}

class TreeFactory {
    public static final Map<String, Tree> forest = new HashMap<>();

    public static Tree getTree(String treeColor) {
        Tree tree = forest.get(treeColor);

        if(tree == null) {
            forest.put(treeColor, new Tree(treeColor));
            System.out.println("새로운 나무(객체)를 만들었습니다.");
        }
        return forest.get(treeColor);
    }
}

class Tree {
    private String color;
    private int x;
    private int y;

    public Tree(String color) {
        this.color = color;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void install() {
        System.out.println(x + ", " + y + "에 " + color + "색 나무를 설치했습니다.");
    }
}
