/**
 * 103. 二叉树的锯齿形层序遍历
 *
 * 给定一个二叉树，返回其节点值的锯齿形层序遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 *
 * 例如：
 * 给定二叉树[3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回锯齿形层序遍历如下：
 *
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

package j2se.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Question_103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> daAn = new ArrayList<>();

        if (root == null) {
            return daAn;
        }

        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);
        boolean flag = true;

        while (!nodes.isEmpty()) {
            LinkedList<Integer> daAn1 = new LinkedList<>();
            int temp = nodes.size();
            for (int i = 0; i < temp; i++) {
                TreeNode node = nodes.poll();
                if(flag){
                    daAn1.addLast(node.val);
                }else{
                    daAn1.addFirst(node.val);
                }
                if (node.left != null) {
                    nodes.offer(node.left);
                }
                if (node.right != null) {
                    nodes.offer(node.right);
                }
            }
            daAn.add(daAn1);
            flag=!flag;
        }
        return daAn;
    }

}
