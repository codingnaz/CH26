/**
 * Created by nazmulhossain1 on 11/12/17.
 */
public class AVLNode {
    public int item;
    public AVLNode left;
    public AVLNode right;
    public AVLNode (int i, AVLNode l, AVLNode r){
        item = i; left = l; right = r;
    }
    public static AVLNode minNodeAVLTree(int h) {
        return minNodeAVLTree(h, 1);
    }
    private static AVLNode minNodeAVLTree(int h, int min)
    {
        if (h == -1) {
            return null;
        } else {

            int root = min + (int)(Math.pow(2, h)-1);
            AVLNode left = minNodeAVLTree (h - 1, min);
            AVLNode right = minNodeAVLTree (h -2, root+1);
            return new AVLNode (root, left, right);
        }
    }
}
