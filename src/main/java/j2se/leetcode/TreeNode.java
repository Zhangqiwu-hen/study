package j2se.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){

    }

    TreeNode(int x) {
        val = x;
    }

    public void createTree(Queue<Integer> nums){
        Queue<TreeNode> tree = new LinkedList<>();
        tree.add(this);
        while(!nums.isEmpty()){
            TreeNode iN = tree.poll();
            if(nums.peek()==null){
                nums.poll();
            }else {
                iN.val = nums.poll();
                iN.left = new TreeNode();
                iN.right = new TreeNode();
                tree.add(iN.left);
                tree.add(iN.right);
            }
        }


    }
}