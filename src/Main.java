import java.util.*;

public class Main {
    public static void main(String[] args) {


        BinaryTrees Node = new BinaryTrees(null,null, 50);
        BinaryTrees.setRoot(Node);
        BinaryTrees.insertNode(228, Node);
        BinaryTrees.insertNode(1337, Node);
        BinaryTrees.insertNode(134, Node);
        BinaryTrees.insertNode(777, Node);
        BinaryTrees.insertNode(105, Node);
        BinaryTrees.insertNode(808, Node);
        BFS(Node);
    }

    public static void BFS(BinaryTrees Node){
        Queue<BinaryTrees> Queue = new LinkedList<BinaryTrees>();

        Queue.add(Node);
        while (!Queue.isEmpty()){
            BinaryTrees CNode = Queue.poll();
            System.out.print(CNode.getValue() + " ");
            if (CNode.getLeft() != null){
                Queue.add(CNode.getLeft());
            }
            if (CNode.getRight() != null){
                Queue.add(CNode.getRight());
            }
        }
    }
}