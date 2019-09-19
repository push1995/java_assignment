import java.util.Scanner;

public class LinkedList1 { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    }

  
    // Method to insert a new node 
    public static LinkedList1 insert(LinkedList1 list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
        new_node.next = null; 
  
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
  
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
  
        // Return the list by head 
        return list; 
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList1 list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
   
            // Go to next node 
            currNode = currNode.next; 
        } 
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList1 list = new LinkedList1(); 
  
        // 
        // ******INSERTION****** 
           // Create a Scanner object
        Scanner values = new Scanner(System.in);
            System.out.println("Enter how many values you want to enter");
            int j= values.nextInt();
         for(j = 0; j< 5; j++)
         {  Scanner myObj = new Scanner(System.in);
            System.out.println("Enter values");
            int val= myObj.nextInt();
            // Insert the values 
            //list = insert(list, 1); 
            //list = insert(list, 9); 
            //list = insert(list, 3); 
            //list = insert(list, 7); 
            //list = insert(list, 5); 
            //list = insert(list, 64); 
            //list = insert(list, 7); 
            list = insert(list, val); 
         }
  
        // Print the LinkedList 
        printList(list); 
    }
}
