package cn.duckflew.LeetCode;

import sun.reflect.generics.tree.Tree;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal
{
    public void preOrder(List<Integer> res,TreeNode root)
    {
        if (root==null)return;
        Stack<TreeNode> stack=new Stack<>();
        while (true)
        {
            while (root!=null)
            {
                res.add(root.val);
                stack.push(root);
                root=root.left;
            }
            if (stack.isEmpty())break ;
            root=stack.pop();
            root=root.right;
        }

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        preOrder(res,root);
        return res;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        inOrder(res,root);
        return res;
    }

    private void inOrder(List<Integer> res, TreeNode root)
    {
        if (root!=null)
        {
            Stack<TreeNode> stack=new Stack<>();
            while (true)
            {
                while (root!=null)
                {
                    stack.push(root);
                    root=root.left;
                }
                if (stack.isEmpty())break;
                root=stack.pop();
                res.add(root.val);
                root=root.right;
            }
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        postorder(res,root);
        return res;
    }

    private void postorder(List<Integer> res, TreeNode root)
    {
        if (root!=null)
        {
            Stack<TreeNode> stack=new Stack<>();
            TreeNode pre= null;
            while (true)
            {
                while (root!=null)
                {
                    stack.push(root);
                    root=root.left;
                }
                if (stack.isEmpty())break;
                root=stack.pop();
                //判断访问条件
                if (root.right==null||pre==root.right)
                {
                    res.add(root.val);
                    pre=root;
                    root=null;
                }
                else
                {
                    stack.push(root);
                    root = root.right;
                }
            }
        }
    }
}
