package list.linkedlist.implementation;

public class Main {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);
        numbers.removeFirst();
        numbers.removeLast();

        System.out.println(numbers);
    }
}
