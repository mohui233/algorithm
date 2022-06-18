/**
 * 链表的中间结点
 *
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 *
 * 如果有两个中间结点，则返回第二个中间结点。
 *
 * 给定链表的结点数介于 1 和 100 之间。
 *
 * @author wangzhijie
 */
public class Solution876 {

    /**
     * 示例 1：
     *
     * 输入：[1,2,3,4,5]
     * 输出：此列表中的结点 3 (序列化形式：[3,4,5])
     * 返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
     * 注意，我们返回了一个 ListNode 类型的对象 ans，这样：
     * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
     * 示例 2：
     *
     * 输入：[1,2,3,4,5,6]
     * 输出：此列表中的结点 4 (序列化形式：[4,5,6])
     * 由于该列表有两个中间结点，值分别为 3 和 4，我们返回第二个结点。
     *
     */
    public static ListNode middleNode(ListNode head) {
        ListNode[] A = new ListNode[100];
        int i = 0;
        // 创建链表节点
        while(head != null){
            A[i++] = head;
            head = head.next;
        }
        // print(A[i/2]);
        return A[i/2];
    }

    public static void main(String[] args) {
        // 创建首节点
        ListNode nodeSta = new ListNode(1);
        // 声明一个变量用来在移动过程中指向当前节点
        ListNode nextNode;
        // 指向首节点
        nextNode = nodeSta;
        // 创建链表
        for(int i=2; i<6; i++){
            // 生成新的节点
            ListNode node = new ListNode(i);
            // 把新节点连起来
            nextNode.next = node;
            // 当前节点往后移动
            nextNode = nextNode.next;
        }
        // 当for循环完成之后 nextNode指向最后一个节点
        // 重新赋值让它指向首节点
        nextNode = nodeSta;
        middleNode(nextNode);
    }

    /**
     * 打印输出方法
     * @param listNode
     */
    public static void print(ListNode listNode){
        // 创建链表节点
        while(listNode != null){
            System.out.println("节点:" + listNode.val);
            listNode = listNode.next;
        }
        System.out.println();
    }

}
