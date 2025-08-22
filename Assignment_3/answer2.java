public boolean helper(Node root,int min,int max){
        if(root==null) return false;
        if (min == max) return true;
        return helper(root.left,min,root.data-1) || helper(root.right,root.data+1,max);
    }
    public boolean isDeadEnd(Node root) {
        // Code here.
        return helper(root,1,Integer.MAX_VALUE);
    }