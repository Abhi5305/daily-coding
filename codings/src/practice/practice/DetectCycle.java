package practice.practice;

public class DetectCycle {
    public static boolean detectCycle(MyNode head){
        if(head == null || head.next == null){
            return false;
        }
        MyNode slow = head;
        MyNode fast = head;
        while(fast != null && fast.next != null){
            if(slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        MyNode node = new MyNode(1);
        node.next = new MyNode(2);
        node.next.next = new MyNode(3);
        node.next.next.next = node;
        System.out.println(detectCycle(node));
    }
}
