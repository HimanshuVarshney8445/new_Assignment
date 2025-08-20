class Solution {
    class Pair{
        int index;
        TreeNode node;
        Pair(TreeNode node,int index){
            this.node=node;
            this.index=index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> queue = new LinkedList();
        queue.offer(new Pair(root,0));
        int max=0;
        while(!queue.isEmpty()){
            int size = queue.size();
            int min_index = queue.peek().index;
            int first=0,last=0;
            for(int i=0;i<size;i++){
                Pair pair = queue.poll();
                TreeNode node = pair.node;
                int index = pair.index - min_index;
                if(i==0) first = index;
                if(i==size-1) last = index;
                if(node.left!=null) queue.offer(new Pair(node.left,2*index+1));
                if(node.right!=null) queue.offer(new Pair(node.right,2*index+2));
            }
            max=Math.max(max,last-first+1);
        }
        return max;
    }
}