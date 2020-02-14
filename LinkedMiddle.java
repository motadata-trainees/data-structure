public class LinkedMiddle {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public int  length() {
        Node n1 = head;
        int len = 0;
        while (n1 != null) {
            len++;
            n1 = n1.next;
        }
        return len;
    }
    public void Middle(LinkedMiddle list1){
        int len=list1.length();
        int middle=len/2;
        int i=0;
        Node n2=head;
        int n=0;
        while(i<=middle)
        {
          n=n2.data;
          n2=n2.next;
          i++;
        }
        System.out.println("Middle element of Linked List is: "+n);
    }

    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+"->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String [] args)
    {
        LinkedMiddle list = new LinkedMiddle();
        for (int i=5; i>0; --i)
        {
            list.push(i);
        }
        list.printList();
        list.Middle(list);
    }
}

