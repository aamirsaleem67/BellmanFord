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
public class bellmanFord extends edge  {
    
    ArrayList<Integer> dist = new ArrayList<Integer>();
    ArrayList<Integer> precd = new ArrayList<Integer>();
    
    void SPusingBP()
    {
        initialize();
        BP(0);
        System.out.println("Distance Array: "+ "\n"+dist);
        System.out.println("Predecessor Array:"+"\n"+precd);
        printSP();
        
    }
    
    void initialize()
    {
        
        for(int i=0; i < vertexList.size(); i++)
        {
            if(i==0)
            {
                precd.add(null);
                dist.add(0);
            }
            else{
                dist.add(Integer.MAX_VALUE);
                precd.add(null);
            }
        }
    }
    
    void BP(int iterate)
    {
        
        if(iterate == vertexList.size() - 1)
        {
            return;
        }
        int start,end,w;
        int mydist,value;
        for(int i = 0; i < edgeList.size() ; i++)
        {
            start = edgeList.get(i).startIndex;
            end = edgeList.get(i).endIndex;
            w = edgeList.get(i).weight;
            mydist = dist.get(end);
            value = getDist(start,end,w);
            dist.set(end,value );
            if(mydist != value)            
            {
                precd.set(end, start);
            }
        }
        //System.out.println(iterate + ""+ dist);
        iterate++;
        BP(iterate);
    } // end of BP
    
    int getDist(int start,int end,int w)  
{
int vd = dist.get(end);
int ud = dist.get(start);

if(ud != Integer.MAX_VALUE)
{
if(vd > ud + w)
{
    vd = ud +w;
    return vd;
}
}

    return vd;


} // end of getDist
    
    void printSP()
    {
        int w, s,e;
        SPedge obj = new SPedge();
        for(int i = 1;i < vertexList.size() ; i++)
        {
            s= precd.get(i);
            w=dist.get(i);
            e = i;
            obj.insertEdge(s, e, w);
        }
        obj.printSPEdges();
    }
    
}

