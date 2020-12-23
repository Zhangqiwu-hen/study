/**
 * 102. 二叉树的层序遍历
 *
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7]
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层序遍历结果：
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal
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

public class Question_102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> daAn = new ArrayList<>();

        if (root == null) {
            return daAn;
        }

        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);

        while (!nodes.isEmpty()) {
            List<Integer> daAn1 = new ArrayList<>();
            int temp = nodes.size();
            for (int i = 0; i < temp; i++) {
                TreeNode node = nodes.poll();
                daAn1.add(node.val);
                if (node.left != null) {
                    nodes.offer(node.left);
                }
                if (node.right != null) {
                    nodes.offer(node.right);
                }
            }
            daAn.add(daAn1);
        }
        return daAn;
    }

}
