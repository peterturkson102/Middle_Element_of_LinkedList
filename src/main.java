// Java program to find middle of linked list
   public class main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        for (int i = 11; i > 0; --i) {
            myLinkedList.pushToLinkedList(i);
        }
        myLinkedList.printLinkedList();
        myLinkedList.printMiddleNumber();
    }
}