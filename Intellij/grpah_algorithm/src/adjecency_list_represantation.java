//https://www.youtube.com/watch?v=fjT3WDKiAkI&list=PLqVtJ9OAii0plRKCsSzVqX-YTw2BJcZ-s
import java.util.*;

class grpah { //class graph begins
    class Edge { //class Edge begins

        int v, w;



        public Edge(int v, int w) { //constructor of the class Edge begins
            this.v = v;
            this.w = w;
        }//constructor of the class Edge ends



        @Override
        public String toString() {
            return "(" + v + " , " + w + ")";
        }


    } //class Edge ends



    List<Edge> G[]; //declaring a array G[] of List of Edge



    public grpah(int n) { // constructor of graph
        G = new LinkedList[n]; // giveing the limit of the array index
        for (int i = 0; i < G.length; i++)
            G[i] = new LinkedList<Edge>(); // instantiating each index of the array
    } // constructor of the class graph ends



    boolean isConnected(int u, int v) { // isConnected method begins
        for (Edge i : G[u])
            // Here's the ashol khela, start observing from line 18
            // at 18. We create a List of Edge and refer it to G[] which is an array
            // at 21. We set the index of the array G[]
            // at 23. We instantiate the LinkedList of Edge for each index of the array
            // at 27. Using the enhanced for loop we traverse full LinkedList
            // which belongs to the uth index of the array G[]
            // G[u] is actually the LinkedList which is in the uth index of the array G[]
            if (i.v == v) return true;
        return false;
    } // isConnected ends here



    void addEdge(int u, int v, int w) { // addEdge method begins
        G[u].add(0, new Edge(v, w));
            // add is method of LinkedList which has 2 parameters
            // 1st one is index/position & the 2nd one is value
            // as value we are instantiating a new object of edge class
            // as index/position we are giving '0' so it always adds element at the begining
            // because the time complexity for adding an element to the beginning is O(n)
    } // addEdge method ends



    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < G.length; i++)
            result += i + "=>" + G[i] + "\n";
        return result;
    }


} //class graph ends here



public class adjecency_list_represantation {
    public static void main(String[] args) {
        grpah G = new grpah(10);
        G.addEdge(0, 2, 10);
        G.addEdge(0, 5, 15);
        G.addEdge(2, 5, 10);
        G.addEdge(9, 3, 16);
        System.out.println(G);
        System.out.println(G.isConnected(2, 3));
        System.out.println(G.isConnected(0, 5));
        System.out.println(G.isConnected(2, 0));
    }

}
