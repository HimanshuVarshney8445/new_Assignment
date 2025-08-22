public static void inorder(Node root, ArrayList<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
    public static int countPairs(Node root1, Node root2, int x) {
        // Code here
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        inorder(root1, list1);
        inorder(root2, list2);

        int i = 0, j = list2.size() - 1;
        int count = 0;

        while (i < list1.size() && j >= 0) {
            int sum = list1.get(i) + list2.get(j);

            if (sum == x) {
                count++;
                i++;
                j--;
            } else if (sum < x) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }