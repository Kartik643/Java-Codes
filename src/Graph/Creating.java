package Graph;

import java.lang.reflect.Array;
import java.util.*;

public class Creating {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.length];
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.print(curr);
                vis[curr] = true;
                for(int i = 0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]){
        //Visited
        System.out.print(curr + " ");
        vis[curr] = true;

        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static boolean haspath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[]){
        if(src == dest){
            return true;
        }
        vis[src] = true;
        for(int i = 0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            if(!vis[e.dest] && haspath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i = 0;i<V;i++){
            graph[i] = new ArrayList<>();
        }

        //0 vertex

        graph[0].add(new Edge(0,1,5));

        //1 vertex

        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));


        //2 vertex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,4));


        //3 vertex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));


        //4 vertex
        graph[4].add(new Edge(4,2,2));


        System.out.println(haspath(graph,0,5, new boolean[V]));

//        dfs(graph,0,new boolean[V]);
//        bfs(graph);
//
//        for(int i = 0;i<graph[2].size();i++){
//            Edge e = graph[2].get(i);
//            System.out.println(e.dest);
//        }
    }
}
