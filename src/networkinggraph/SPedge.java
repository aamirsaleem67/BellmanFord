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
public class SPedge extends vertex {
    
    int startIndex, endIndex, weight;
    
    ArrayList<SPedge> SPedgelist = new ArrayList<SPedge> ();
    
    void insertEdge(int start, int end, int weight)
    {
        SPedgelist.add(getSPEdge(start, end, weight));
        
    }
    
    SPedge getSPEdge(int start, int end, int weight) {
        SPedge myspedge = new SPedge();
        myspedge.startIndex = start;
        myspedge.endIndex = end;
        myspedge.weight = weight;
        return myspedge;
    }
    void printSPEdges()
    {
        System.out.println("SHORTEST PATH USING BELLMAN FORD:");
        for(int i = 0;i < SPedgelist.size();i++)
        {
            System.out.println("Edge from " + vertexList.get(SPedgelist.get(i).startIndex).key + " to " +" "
                    + vertexList.get(SPedgelist.get(i).endIndex).key +" with weight "+ SPedgelist.get(i).weight);
            
        }
        
        
    }
    
}
