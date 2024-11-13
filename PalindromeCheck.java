package ListAssignMent;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class PalindromeCheck {
    static Node head = null;

    public void add(int val){
        Node nextNode = new Node(val);
        if(head == null){
            head = nextNode;
            return;
        }
       nextNode.next = head;
       head = nextNode;
    }

public void addLast(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    Node temp = head;
    while(temp.next != null){
        temp=temp.next;
    }
    temp.next = newNode;
}

    public void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    static boolean checkPalindrome(PalindromeCheck p) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node firstHead = head;
        Node secHead = slow.next;
        while(secHead != null){
            System.out.println(firstHead.data+" "+secHead.data);
            firstHead = firstHead.next;
            secHead = secHead.next;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeCheck p = new PalindromeCheck();
        p.addLast(10);
        p.addLast(20);
        p.addLast(30);
        p.addLast(20);
        p.addLast(10);
        p.display();
        boolean rs = checkPalindrome(p);
        System.out.println(rs);
    }

    
}
