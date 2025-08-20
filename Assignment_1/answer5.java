class Tree {
    public ArrayList<Integer> diagonal(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            while (curr != null) {
                result.add(curr.data);
                if (curr.left != null) {
                    q.add(curr.left);
                }
                curr = curr.right;
            }
        }
        return result;
    }
}