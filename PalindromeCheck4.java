package ListAssignMent;

import java.util.LinkedList;
import java.util.Stack;

class PalindromeCheck2 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(10);
        ll.add(10);
    
        boolean res = checkPlaindrome(ll);
        if(res)
            System.out.println("LinkedList is Palindrome");
        else
            System.out.println("LinkedList is not a Palindrome");
    }

    public static boolean checkPlaindrome(LinkedList ll){
        Stack s = new Stack<>();
        for(Object o : ll){
            s.push(o);
        }
        
        for(Object obj : ll){
            if(obj != s.pop()){
                return false;
            }
        }
        return true;
    }
}