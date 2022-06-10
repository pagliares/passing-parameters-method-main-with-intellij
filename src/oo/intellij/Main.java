package oo.intellij;

public class Main {

    public static void main(String[] args) {
        if (args.length != 0) {
            System.out.print(args.length + " " + "arguments provided: " );
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i] + " ");
            }
        } else {
            System.out.println("No arguments provided !");
        }
    }
}
