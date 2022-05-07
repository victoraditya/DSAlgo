package graph.BFS;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");

        a.setAdjacencyList(Arrays.asList(b, f, g));
        b.setAdjacencyList(Arrays.asList(a, c, d));
        c.setAdjacencyList(Arrays.asList(b));
        d.setAdjacencyList(Arrays.asList(b, e));
        f.setAdjacencyList(Arrays.asList(a));
        g.setAdjacencyList(Arrays.asList(a, h));
        h.setAdjacencyList(Arrays.asList(g));

        BFS bfs = new BFS();
        bfs.traverseBFS(a);

    }
}
