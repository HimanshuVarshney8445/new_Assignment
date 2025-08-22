void helper(Node root, int l, int h,int[] count){
        if(root==null) return;
        if(root.data>l){
            helper(root.left,l,h,count);
        }
        if(root.data>=l && root.data<=h){
            count[0]++;
        }
        if(root.data<h){
            helper(root.right,l,h,count);
        }
    }
    int getCount(Node root, int l, int h) {
        // Your code here
        int[] count = new int[1];
        helper(root,l,h,count);
        return count[0];
    }