package dva.lpi;

public class Main {
    public static void main(String[] args) {
        dev.lpa.FuzzyLinkedList fuzzyLinkedList = new dev.lpa.FuzzyLinkedList();

        //Add nodes to the list
        fuzzyLinkedList.addNode("Apple", 0.8);
        fuzzyLinkedList.addNode("Banana", 0.5);
        fuzzyLinkedList.addNode("Orange", 0.9);

        //Print the linked list
        System.out.println("Fuzzy Linked List: ");
        fuzzyLinkedList.printList();
    }
}