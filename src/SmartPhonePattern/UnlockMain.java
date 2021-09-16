package SmartPhonePattern;

//The ogiginal task is here: https://www.codewars.com/kata/585894545a8a07255e0002f1

import java.util.HashMap;
import java.util.Map;

public class UnlockMain {
    public static void main(String[] args) {
        Map<String, Boolean> neighbors = Map.of(
                "B", true,
                "C", true,
                "D", true
        );

        Node nodeA = new Node("A", neighbors, true);

        System.out.println("\n===== Node A: =====");
        System.out.println("Node name: " + nodeA.getName());
        for (Map.Entry entry : nodeA.neighbors.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
        System.out.println("Node state: " + nodeA.getState());

        neighbors = Map.of(
                "A", true,
                "C", true,
                "D", true
        );

        Node nodeB = new Node("B", neighbors, true);

        System.out.println("\n===== Node B: =====");
        System.out.println("Node name: " + nodeB.getName());
        for (Map.Entry entry : nodeB.neighbors.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
        System.out.println("Node state: " + nodeB.getState());

        neighbors = Map.of(
                "A", true,
                "B", true,
                "D", true
        );

        Node nodeC = new Node("C", neighbors, true);

        System.out.println("\n===== Node C: =====");
        System.out.println("Node name: " + nodeC.getName());
        for (Map.Entry entry : nodeC.neighbors.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
        System.out.println("Node state: " + nodeC.getState());

        neighbors = Map.of(
                "C", true,
                "A", true,
                "B", true
        );

        Node nodeD = new Node("D", neighbors, true);

        System.out.println("\n===== Node D: =====");
        System.out.println("Node name: " + nodeD.getName());
        for (Map.Entry entry : nodeD.neighbors.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
        System.out.println("Node state: " + nodeD.getState());


    }
}