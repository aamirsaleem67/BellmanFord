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
public class edge extends vertex {

    static ArrayList<edge> edgeList = new ArrayList<edge>();
    int startIndex, endIndex, weight;
    boolean check = false;

    void addEdge(String startVertex, String endVertex, int weight) {
        boolean startCheck = false, endCheck = false;
        for (int i = 0; i < vertexList.size(); i++) {
            if (startVertex.equalsIgnoreCase(vertexList.get(i).key)) {
                this.startIndex = i;
                startCheck = true;

            }
            if (endVertex.equalsIgnoreCase(vertexList.get(i).key)) {
                this.endIndex = i;
                endCheck = true;

            }
            if (startCheck && endCheck) {
                check = true;
              

                break;
            }
        } // end of loop..

        if (check == true) {

            edgeList.add(getEdge(this.startIndex, this.endIndex, weight));

        } else {
            System.out.println("Not Found");
        }
    }

    edge getEdge(int start, int end, int weight) {
        edge myedge = new edge();
        myedge.startIndex = start;
        myedge.endIndex = end;
        myedge.weight = weight;
        return myedge;
    } // END OF edge class

    void printEdges() {
        for (int i = 0; i < edgeList.size(); i++) {
            System.out.println("Edge from " + vertexList.get(edgeList.get(i).startIndex).key + " to " + vertexList.get(edgeList.get(i).endIndex).key +""
                    + " with weight " + edgeList.get(i).weight);
        }
    }
}
