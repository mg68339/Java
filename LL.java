public class LL {
    Node head;
    private int size;

    LL(){
        size=0;
    }
    
    public class Node{
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }


    }

    //add node at the beginning
    public void addFirst(int data){
        Node newNode = new Node(data);

        newNode.next=head;
        head=newNode;
    }

    //add node at the end of the list
    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head=newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
             lastNode=lastNode.next;    
        }
        lastNode.next=newNode;
    }

    // print the whole list
    public void printList(){
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data +"-->");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }

    //delete the first node in the list
    public void removeFirst(){
        if (head == null) {
            System.out.println("the list is empty nothing to delete");
            return;
        }
        head = this.head.next;
        size--;
    }

    //remove the node at the end of the list
    public void removeLast(){
          if (head == null) {
            System.out.println("the list is empty nothing to delete");
            return;
        }

        if (head.next == null) {
            head=null;
            return;
        }


        Node currNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;    
        }
        currNode.next = null;
    }
    //size of list
    public int getsize(){
        return size;
    }

    //reverse the link list
    public void reverseIterate(){
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
             Node nextNode = currNode.next;
             currNode.next = prevNode;

             //update
             prevNode = currNode;
             currNode = nextNode; 
        }
        head.next = null;
        head = prevNode;
    }

    //reverse the link list using recursive function
    public Node reverseRecursive(Node head){
        if (head == null || head.next == null) {
            return head;
            
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    //find the nth node and from last and delete that node
    public Node removeNthFromEnd(Node head , int n){

        if (head.next == null) {
            return null;
        }
        //size
        int size = 0;
        Node currNode = head;
        while (currNode != null) {
            currNode = currNode.next;
            size++;
        }
        if (n == size) {
            return head.next;
        }

        int indexToSearch =size-n;
        Node prevNode = head;
        int i=1;
        while (i<indexToSearch) {
            prevNode =prevNode.next;
            i++;
        }
        prevNode.next = prevNode.next.next;
        return head;

    }

    //check wheather the list is palindrome or not

    public Node reverse(Node head){
        Node prevNode =null;
        Node currNode =head;

        while (currNode!=null) {
            Node nextNode = currNode.next;
            currNode.next =prevNode;
            prevNode = currNode;
            currNode=nextNode;
        }
        return prevNode;
    }
    public Node findMiddle(Node head){
        Node hare = head;
        Node turtle = head;
        while (hare.next != null && hare.next.next!= null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public boolean isPalindrome(Node head){
        if (head == null || head.next == null){
            return true;  
        }
        Node middle = findMiddle(head);
        Node secondHalfStart = reverse(middle.next);

        Node firstHalfStart = head;

        while (secondHalfStart != null) {
            if (firstHalfStart.data != secondHalfStart.data) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }


    //main

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(1);
        list.printList();
        System.out.println(list.getsize());
        
        list.printList();
        // list.reverseIterate();
    //    list.head = list.reverseRecursive(list.head);
    // list.head = list.removeNthFromEnd(list.head, 2);
    if (list.isPalindrome(list.head)) {
        System.out.println("the linked list is palindrome");
    }else{
        System.out.println("Not a palindrome");
    }
        
        
        list.printList();
    
    }





}
