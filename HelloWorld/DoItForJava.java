package HelloWorld;

import java.util.Scanner;

public class DoItForJava {
    static void printOut() {
        System.out.println("Who are you?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        DoItForJava obj = new DoItForJava();
        obj.printOut();

    }
}

