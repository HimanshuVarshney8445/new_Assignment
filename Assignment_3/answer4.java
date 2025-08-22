public static void inOrder(Node root,ArrayList<Integer> list){
        if(root==null) return;
        inOrder(root.left,list);
        list.add(root.data);
        inOrder(root.right,list);
    }
    public static ArrayList<Integer> findCommon(Node r1, Node r2) {
        // code here
        ArrayList<Integer> l1 = new ArrayList();
        ArrayList<Integer> l2 = new ArrayList();
        ArrayList<Integer> common = new ArrayList<>();
        inOrder(r1,l1);
        inOrder(r2,l2);
        int i = 0, j = 0;
        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i).equals(l2.get(j))) {
                common.add(l1.get(i));
                i++;
                j++;
            } else if (l1.get(i) < l2.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return common;
    }