package leetcodeSummary;

import java.util.LinkedList;
import java.util.Queue;

public class 链表 {
    public static void main(String[] args) {
        ListNode linkedList = ListNode.createLinkedList1();
        ListNode myreverseList = ListNode.MyreverseList(linkedList);
        ListNode.traverse(myreverseList);
//        ListNode listNode = ListNode.removeElementsByRecursion(linkedList, 20);
//        ListNode.traverse(listNode);

//        Queue<Integer> q = new LinkedList<>();
//        boolean add = q.add(1);
//        boolean offer = q.offer(2);
//        Integer peek = q.peek();
//        Integer poll = q.poll();
//        System.out.println(poll);
//        System.out.println(q);


    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = head;
        while (head.next!=null)
        {
            if (head.next.val!=val)
                head = head.next;
            else{
                head = head.next.next;
            }
        }
        return dummy;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next)
    { this.val = val; this.next = next; }

    public static ListNode createLinkedList(){
        // 头插法 元素是反的
        ListNode head = new ListNode(0);
        head.next = null;
        for (int i=1;i<=5;i++)
        {
            ListNode newNode = new ListNode(i*10);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    public static ListNode createLinkedList1(){
        // 尾插法 元素是反的
        ListNode head = new ListNode(0);
        head.next = null;
        ListNode tail = head;
        for (int i=1;i<=5;i++)
        {
            ListNode newNode = new ListNode(i*10);
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
        }
        return head;
    }

    public static void traverse(ListNode node){
        if(node==null)
            return;

        traverse(node.next);
        System.out.println(node.val);
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head==null){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next!=null){
            if (cur.next.val==val){
                cur.next = cur.next.next;
            }
            else{
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    public static ListNode removeElementsByRecursion(ListNode head, int val) {
        if (head==null) return null;

        if (head.val==val) {
            ListNode listNode = removeElementsByRecursion(head.next, val);
            return listNode;
        }else{
            return removeElementsByRecursion(head.next,val);
        }

    }

    public static ListNode MyreverseList1(ListNode head) {
        // 头插法 (相当于重新创造一个空链表,将head链表的一个个元素按顺序头插法进入空链表)
        if (head==null||head.next==null) return head;

        ListNode newNode = null;

        while (head!=null){
            // 头插法 : 取出head中第一个元素head, 将它插到newNode的头部
            ListNode tmp = head.next;
            head.next = newNode;
            newNode = head;
            head = tmp;
        }
        return newNode;

    }

    public static ListNode MyreverseList(ListNode head) {
        // 递归方法
        if (head==null||head.next==null) return head;

        ListNode listNode = MyreverseList(head.next);
        head.next.next = head;
        head.next = null;
        return listNode;
    }

    
}

