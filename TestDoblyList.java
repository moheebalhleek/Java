package Lab_5_Assignments;

import java.util.Scanner;

/**
 Created by Ahmed Al masadi on 9/02/2022.
 */
public class TestDoblyList {
    public static void main(String[] args) {

        DoublyLinkedList<String> list1 = new DoublyLinkedList<>();
        DoublyLinkedList<String> list2 = new DoublyLinkedList<>();
        Scanner in = new Scanner(System.in);
        int choice1;
        int choice2 = -1;
        while (choice2 != 0) {
            System.out.println("Press 1 to enter List 1 \nPress 2 to enter List 2" +
                    "\nPress 3 to See equalization");
            choice2 = in.nextInt();
            switch (choice2) {
                case 1:
                    System.out.print("l1 your choice:");
                    choice1 = in.nextInt();
                    switch (choice1) {
                        case 1:
                            System.out.print("input Name:");
                            list1.addFirst(in.next());
                            break;
                        case 2:
                            System.out.print("input Name:");
                            list1.addLast(in.next());
                            break;
                        case 3:
                            System.out.print("deleted Name:" + list1.removeFirst());
                            break;
                        case 4:
                            System.out.print("deleted Name:" + list1.removeLast());
                            break;
                    }
                    System.out.println("\nfirst= " + list1.first() + "\t last= " + list1.last()
                            + "\t size= " + list1.size());
                    break;
                case 2:
                    System.out.print("l2 your choice:");
                    choice1 = in.nextInt();
                    switch (choice1) {
                        case 1:
                            System.out.print("input Name:");
                            list2.addFirst(in.next());
                            break;
                        case 2:
                            System.out.print("input Name:");
                            list2.addLast(in.next());
                            break;
                        case 3:
                            System.out.print("deleted Name:" + list2.removeFirst());
                            break;
                        case 4:
                            System.out.print("deleted Name:" + list2.removeLast());
                            break;

                    }
                    System.out.println("\nfirst= " + list2.first() + "\t last= " + list2.last()
                            + "\t size= " + list2.size());
                    break;
                case 3:
                    if (list1.equals(list1,list2))
                        System.out.println("The Tow lists are equal");
                    else System.out.println("The Tow lists are not equal");
                    break;
            }
        }
    }
}