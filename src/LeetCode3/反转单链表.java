package LeetCode3;
public class 反转单链表 {

    public static void main(String[] args) {

        ListNode l = ListNode.createLinkedList();
        ListNode rl = ListNode.reverse(l);
        ListNode.traverse(rl);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode createLinkedList() {
        // 头插法 元素是反的
        ListNode head = new ListNode(0);
        head.next = null;
        for (int i = 1; i <= 5; i++) {
            ListNode newNode = new ListNode(i * 10);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    public static void traverse(ListNode node){
        if(node==null){
            System.out.println("empty!");
        }
        ListNode t = node;
        while (t!=null){
            System.out.println(t.val);
            t = t.next;
        }
    }

    public static ListNode reverse(ListNode head){
        if (head==null||head.next==null) return head;

        ListNode newNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
}


