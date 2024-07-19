package graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        Map<Character, List<Character>> graph = Map.of(
                'A', List.of('B', 'C'),
                'B', List.of('D'),
                'C', List.of('E'),
                'D', List.of('F'),
                'E', List.of(),
                'F', List.of()
        );

        bfsUsingQueue(graph, 'A');
    }

    public static void bfsUsingQueue(Map<Character, List<Character>> graph, Character source){
        Queue<Character> queue = new LinkedList<>();
        queue.add(source);
        while (!queue.isEmpty()){
            Character node = queue.poll();
            System.out.println(node);
            for (Character edge : graph.get(node)){
                queue.add(edge);
            }
        }
    }
}
