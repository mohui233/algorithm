/**
 * 合并两个有序链表
 *
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * @author wangzhijie
 */
public class Solution21 {

    /**
     * 示例 1：
     * 输入：list1 = [1,2,4], list2 = [1,3,4]
     * 输出：[1,1,2,3,4,4]
     *
     * 示例 2：
     *
     * 输入：list1 = [], list2 = []
     * 输出：[]
     *
     * 示例 3：
     *
     * 输入：list1 = [], list2 = [0]
     * 输出：[0]
     *
     * 提示：
     *
     * 两个链表的节点数目范围是 [0, 50]
     * -100 <= Node.val <= 100
     * list1 和 list2 均按 非递减顺序 排列
     *
     */

    /**
     * 递归
     * @param list1
     * @param list2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    /**
     * 迭代
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }

    public static void main(String[] args) {
        ListNode t1 = new ListNode(1);
        ListNode t2 = new ListNode(2);
        ListNode t3 = new ListNode(4);
        t1.next = t2;
        t2.next = t3;

        ListNode q1 = new ListNode(1);
        ListNode q2 = new ListNode(3);
        ListNode q3 = new ListNode(4);
        q1.next = q2;
        q2.next = q3;

        ListNode node = mergeTwoLists2(t1, q2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
