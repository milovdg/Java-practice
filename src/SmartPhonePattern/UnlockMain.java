package SmartPhonePattern;

//The original task is here: https://www.codewars.com/kata/585894545a8a07255e0002f1

import java.util.HashMap;
import java.util.Map;

public class UnlockMain {
    //Why it should be static?
    public static void main(String[] args) {

        Map<String, Node> neighbors = new HashMap<String, Node>();

        Node nodeA = new Node("A", neighbors, true);
        Node nodeB = new Node("B", neighbors, true);
        Node nodeC = new Node("C", neighbors, true);
        Node nodeD = new Node("D", neighbors, true);

//Defining neighbors of node A
        nodeA.neighbors.put("B", nodeB);
        nodeA.neighbors.put("C", nodeC);
        nodeA.neighbors.put("D", nodeD);

//Defining neighbors of node B
        nodeB.neighbors.put("A", nodeA);
        nodeB.neighbors.put("C", nodeC);
        nodeB.neighbors.put("D", nodeD);

//Defining neighbors of node C
        nodeC.neighbors.put("A", nodeA);
        nodeC.neighbors.put("B", nodeB);
        nodeC.neighbors.put("D", nodeD);

//Defining neighbors of node D
        nodeD.neighbors.put("C", nodeC);
        nodeD.neighbors.put("A", nodeA);
        nodeD.neighbors.put("B", nodeB);

        routLength(nodeA);

    }

    //Why it should be static?
    static void routLength(Node iNode){
        System.out.println("\n===== Initial node: =====");
        System.out.println("iNode name: " + iNode.getName());

        for (Map.Entry entry : iNode.neighbors.entrySet()){
            System.out.println("node" + entry.getKey() + ": " + iNode.neighbors.get(entry.getKey()).getState());
        }
        System.out.println("iNode state: " + iNode.getState());
    }

}