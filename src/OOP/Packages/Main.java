package OOP.Packages;

import OOP.Packages.Forest.Squirell;
import OOP.Packages.Forest.Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Squirell squirell = new Squirell();
        tree.say();
        squirell.say();

        Scanner scanner = new Scanner(System.in);
    }
}
