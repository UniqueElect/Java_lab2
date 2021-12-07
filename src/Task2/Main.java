package Task2;

public class Main {
    public static void main(String[] args) {

        Stack a = new Stack();
        a.push("1");
        a.push("2");
        a.push("7");
        a.push("4");
        a.printStack();
        System.out.println("");
        a.pop();
        a.pop();
        a.printStack();
        System.out.println(" ");
        for (var el : a)
            System.out.println(el);
    }
}
