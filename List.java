import java.util.*;

class Node
{
    private int data;
    private Node next;
    public Node()
    {
        data=0;
        next=null;
    }
    public Node(int d,Node n)
    {
        data = d;
        next = n;
    }
    public int getData()
    {
        return(data);
    }
    public Node getNext()
    {
        return(next);
    }
    public void setData(int d)
    {
        data =d;
    }
    public void setNext(Node n)
    {
        next=n;
    }
}

class LinkList
{
    private int size;
    private Node start;
    Scanner sc = new Scanner(System.in);
    public LinkList()
    {
        size=0;
        start=null;
    }
    public void InsertAtFirst()
    {
        System.out.println("Enter Value to Insert");
        int val = sc.nextInt();
        Node n = new Node();
        n.setData(val);
        n.setNext(start);
        start=n;
        size++;
        System.out.println("Value Inserted Sucessfully.");
    }
    public void InsertAtLast()
    {
        System.out.println("Enter Value to Insert");
        int val = sc.nextInt();
        Node n = new Node();
        Node n1 = new Node();
        n.setData(val);
        n1=start;
        if(n1==null)
            start=n;
        else
        {
            while(n1.getNext()!=null)
                n1=n1.getNext();
            n1.setNext(n);
        }
        size++;
        System.out.println("Value Inserted Sucessfully.");
    }
    public void InsertAtPosition()
    {
        System.out.println("Enter Position where Insert Value ");
        int pos = sc.nextInt();
        if(pos==1)
            InsertAtFirst();
        else if(pos==size+1)
            InsertAtLast();
        else if(pos<1&&pos<=size)
        {
            System.out.println("Enter Value to Insert");
            int val = sc.nextInt();
            Node n = new Node();
            Node n1 = start;
            n.setData(val);
            for(int i=1;i<pos-1;i++)
                n1=n1.getNext();
            n.setNext(n1.getNext());
            n1.setNext(n);
            size++;
            System.out.println("Value Inserted Sucessfully.");
        }
        else
            System.out.println("Insert is not possible at position "+pos);
    }
    public void DeleteAtFirst()
    {
        if(start==null)
            System.out.println("List is Already Empty.");
        else{
            start = start.getNext();
            size--;
        }
        System.out.println("Value Deleted Sucessfully.");
    }
    public void DeleteAtLast()
    {
        if(start==null)
            System.out.println("List is Already Empty.");
        else if(size==1){
            start=null;
            size--;
        }
        else{
            Node n = start;
            for(int i=1;i<size-1;i++)
                n=n.getNext();
            n.setNext(null);
            size--;
        }
        System.out.println("Value Deleted Sucessfully.");
    }
    public void DeleteAtPosition()
    {
        System.out.println("Enter Position where Delete Value ");
        int pos = sc.nextInt();
        if(start==null)
            System.out.println("List is Already Empty.");
        else if(pos==1)
            DeleteAtFirst();
        else if(pos==size)
            DeleteAtLast();
        else if(pos>1&&pos<=size-1)
        {
            Node n = start;
            for(int i=1;i<=pos-1;i++)
                n=n.getNext();
            Node n1 = n.getNext();
            n.setNext(n1.getNext());
            size--;
            System.out.println("Value Deleted Sucessfully.");
        }
        else
            System.out.println("Position not found.");
    }
    public void ViewList()
    {
        if(start==null)
            System.out.println("List is Empty.");
        else
        {
            Node n = start;
            for(int i=1;i<=size;i++)
            {
                System.out.print(" "+n.getData());
                n=n.getNext();
            }
        }
    }
}

public class List 
{
    public static void main(String[] args) 
    {
       LinkList l = new LinkList();
       Scanner sc = new Scanner(System.in);
       boolean b = true;
       while(b)
       {
           System.out.println("\n1: Add Value At First position");
           System.out.println("2: Add Value At Last Position");
           System.out.println("3: Add Value At Fixed Position");
           System.out.println("4: Delete Value From Frist Position");
           System.out.println("5: Delete Value From Last Position");
           System.out.println("6: Delete Value From Fixted Position");
           System.out.println("7: View Data");
           System.out.println("8: Exit");
           System.out.println("Enter Your Choice");
           int choice = sc.nextInt();
           switch(choice)
           {
               case 1:
                   l.InsertAtFirst();
                   break;
               case 2:
                   l.InsertAtLast();
                   break;
               case 3:
                   l.InsertAtPosition();
                   break;
               case 4:
                   l.DeleteAtFirst();
                   break;
               case 5:
                   l.DeleteAtLast();
                   break;
               case 6:
                   l.DeleteAtPosition();
                   break;
               case 7:
                   l.ViewList();
                   break;
               case 8:
                   b=false;
                   System.out.println("Program Closed.");
                   break;
               default :
                   System.out.println("Enter Valid Choice Between 1 to 8.");
           }
       }
    }
}