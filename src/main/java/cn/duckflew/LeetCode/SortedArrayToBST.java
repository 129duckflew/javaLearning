package cn.duckflew.LeetCode;

public class SortedArrayToBST
{
        public TreeNode sortedArrayToBST(int[] nums) {
            if (nums.length==0||nums==null )return null;
            return iterator(nums,0,nums.length-1);
        }
        public TreeNode iterator(int []nums,int left,int right)
        {
            if (left>right)return null;
            int mid=(left+right)/2;
            TreeNode newNode = new TreeNode(nums[mid]);
            newNode.left=iterator(nums,left,mid-1);
            newNode.right=iterator(nums,mid+1,right);
            return newNode;
        }
}
