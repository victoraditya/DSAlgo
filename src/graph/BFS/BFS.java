package graph.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public void traverseBFS(Vertex root) {
        Queue<Vertex> queue = new LinkedList<>();

        root.setVisited(true);
        queue.add(root);

        while (!queue.isEmpty()) {
            Vertex remove = queue.remove();
            System.out.println("Visited - " + remove);

            if (remove.adjacencyList != null) {
                for (Vertex v : remove.adjacencyList) {
                    if (!v.isVisited()) {
                        v.setVisited(true);
                        queue.add(v);
                    }
                }
            }

        }
    }

}
