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
public class vertex {
    
    int visited =0 ; 
    String key = "";
    static ArrayList<vertex> vertexList = new ArrayList<vertex>();  
    
    void adddata(String key)
    {   
      
       vertexList.add(getVertex(0,key));
        
    }
    vertex getVertex(int visited, String key)
    {
       vertex my = new vertex();
       my.visited = visited;
       my.key = key.toUpperCase();
       return my;
    }
    
    void printVertex()
    {
        for(int i =0; i < vertexList.size(); i++)
        {
            System.out.println(vertexList.get(i).key);
        }
    }
}
