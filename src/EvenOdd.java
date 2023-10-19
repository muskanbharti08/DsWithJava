

public class EvenOdd {
    public static void main(String[] args) {
        EvenOdd ob =new EvenOdd();
        ob.InsertFirst(3);
        ob.InsertFirst(5);
        ob.InsertFirst(1);
        ob.InsertFirst(9);
        ob.Print();
        System.out.println("after adding last node");
        ob.InsertLast(67);
        ob.Print();
        System.out.println("deleting the first node of linked list");
        ob.DeleteFirst();
        ob.Print();
        System.out.println("deleting last node");
        ob.DeleteLast();
        ob.Print();
        ob.DelteGivenData(5);
        ob.Print();
        ob.InsertFirst(43);
        ob.InsertFirst(41);
        ob.InsertFirst(91);
        ob.InsertFirst(83);
        ob.InsertFirst(23);
        ob.Print();
        ob.FindMiddle();
        ob.CreateLoop();
        ob.CheckLoop();


         }

    Node head;
    class Node{
        int data;
        Node next;

        public Node(int vlue){
            this.next=null;
            this.data = vlue;
        }
    }



    public void InsertFirst(int a){

        Node nn = new Node(a);
        if (head==null) {
            head = nn;
            return;
        }
        nn.next = head;
        head =nn;
    }

    public void InsertLast(int b){
        Node n1 = new Node(b);

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node p = head;
        while(p.next!=null){
            p = p.next;
        }
        // ponter ab last node ko point kr raha
        p.next=n1;
    }

    public void DeleteFirst(){
        if (head==null) {
            System.out.println("Linked is empty");
            return;
        }
        head = head.next;
    }


    public void DeleteLast(){
        if (head ==null) {
            System.out.println("empty");
            return;
        }

        if (head.next==null) {
            head =null;
            return;
        }

        Node p = head;
        while(p.next.next!=null){
            p = p.next;
        }
        p.next = null;

    }

    public void DelteGivenData(int a){

        if (head == null) {
            System.out.println("empty");
            return;
        }
        if(head.data == a){
            head = head.next;
            return;
        }
        Node p = head;
        while(p.next.data != a){
            p=p.next;
        }
        p.next=p.next.next;

    }

    public void FindMiddle(){
        Node sl =head;
        Node ft = head;

        while(ft!=null && ft.next!=null){
            sl = sl.next;
            ft = ft.next.next;
        }
        System.out.println("Middle node of list is: "+sl.data);


    }

    public void CreateLoop(){
        Node p = head;
        while(p.next != null){
            p =p.next;
        }
        p.next = head.next.next;
    }

    public void CheckLoop(){
        Node ft = head;
        Node sl=head;
        while(ft!=null && ft.next !=null){
            ft =ft.next.next;
            sl = sl.next;
            if (ft==sl) {
                System.out.println("there is loop");
                Node p = head;
                while (p!=sl){
                    p=p.next;
                    sl=sl.next;
                    if (p==sl) {
                        System.out.println("it is starting point of a loop  "+p.data);
                        return;
                    }

                }
            }
        }



    }


    public void Print(){
        if (head==null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node pointer = head;
        while (pointer !=null){
            System.out.print(pointer.data+"->");
            pointer = pointer.next;
        }
        System.out.println("Null");

    }
}
