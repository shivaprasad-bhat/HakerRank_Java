import java.util.Scanner;

class LinkedList {
    Integer data;
    LinkedList next;

    /**
     * Empty constructor
     */
    public LinkedList() {
        this.data = null;
        this.next = null;
    }

    /**
     * Constructor to create a new node and assign the next to null
     * 
     * @param data
     */
    public LinkedList(int data) {
        this.data = data;
        next = null;
    }

    public void addNode(int data) {
        LinkedList temp = this;
        while (temp != null) {
            if (temp.next == null) {
                temp.next = new LinkedList(data);
                break;
            }
            temp = temp.next;
        }
    }

    /**
     * Function that prints the linked list Logic: Traverse till the end and print
     * data of the node
     */
    public void printList() {
        LinkedList temp = this;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class MergeInBetween {

    /**
     * 
     * @param l1    :linked list
     * @param l2    :linked list
     * @param start :integer
     * @param end   :integer
     * @return l1 :head
     * @throws Exception
     */

    static LinkedList mergeInBetween(LinkedList l1, LinkedList l2, int start, int end) throws Exception {

        LinkedList startAddress = new LinkedList();
        LinkedList endAddress = new LinkedList();

        LinkedList temp = l1;
        LinkedList nextVal = new LinkedList();

        while (temp.next != null) {
            nextVal = temp.next;
            int data = nextVal.data;
            if (data == start) {
                startAddress = temp;
                break;
            }
            temp = temp.next;
        }

        temp = startAddress.next;
        while (temp != null) {
            if (temp.data == end) {
                endAddress = temp.next;
                break;
            }
            temp = temp.next;
        }

        // Check if ath and bth node are available in the list, else throw error
        if (startAddress.data == null) {
            throw new Exception("ath node not found in the linked list");
        } else if (endAddress.data == null) {
            throw new Exception("bth node not found in the linked list");
        } else {
            startAddress.next = l2;

            temp = l2;
            while (temp != null) {
                if (temp.next == null) {
                    temp.next = endAddress;
                    break;
                }
                temp = temp.next;
            }
        }

        return l1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, end;

        System.out.print("Enter the total number of nodes in LinkedList 1: ");
        int m = scanner.nextInt();
        System.out.print("Enter data value for Node 1: ");
        LinkedList l1 = new LinkedList(scanner.nextInt());
        for (int i = 1; i < m; i++) {
            System.out.print("Enter data value of Node " + (i + 1) + ":");
            l1.addNode(scanner.nextInt());
        }

        System.out.print("Enter the total number of nodes in LinkedList 2: ");
        int n = scanner.nextInt();
        System.out.print("Enter data value for Node 1: ");
        LinkedList l2 = new LinkedList(scanner.nextInt());
        for (int i = 1; i < n; i++) {
            System.out.print("Enter data value of Node " + (i + 1) + ":");
            l2.addNode(scanner.nextInt());
        }

        System.out.println("Enter ath and bth elements to insert in between:");
        start = scanner.nextInt();
        end = scanner.nextInt();

        LinkedList merged;
        try {
            merged = MergeInBetween.mergeInBetween(l1, l2, start, end);
            merged.printList();
        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();

    }
}
