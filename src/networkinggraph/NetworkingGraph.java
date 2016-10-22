/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkinggraph;

import java.util.ArrayList;

/**
 *
 * @author ubit
 */
public class NetworkingGraph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        bellmanFord my = new bellmanFord();
        my.adddata("A"); 
        my.adddata("B");
        my.adddata("C");
        my.adddata("D");

        my.addEdge("A", "B", 5);
        my.addEdge("D", "A", -1);
        my.addEdge("C", "D", 6);
        my.addEdge("B", "D", 4);
        my.addEdge("B", "A", 3);
        my.addEdge("A", "C", 2);

        /*my.addEdge("A", "B", 5);
         my.addEdge("A", "C", 2);
         my.addEdge("B", "A", 3);
         my.addEdge("B", "D", 4);
         my.addEdge("C", "D", 6);
         my.addEdge("D", "A", -1);*/
        System.out.println("Initially Graph:");
        my.printEdges();

        my.SPusingBP();

    }
}
