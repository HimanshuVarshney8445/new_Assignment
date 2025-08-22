void inOrder(Node root,ArrayList<Integer> list){
        if(root==null) return;
        inOrder(root.left,list);
        list.add(root.data);
        inOrder(root.right,list);
    }
    void convert(Node root,ArrayList<Integer> list,int[] arr){
        if(root==null) return;
        convert(root.left,list,arr);
        root.data=list.get(arr[0]++);
        convert(root.right,list,arr);
    }
    Node binaryTreeToBST(Node root) {
        // Your code here
        ArrayList<Integer> list = new ArrayList();
        inOrder(root,list);
        Collections.sort(list);
        convert(root,list,new int[1]);
        return root;
    }