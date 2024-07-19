package graph;

import java.util.List;
import java.util.Map;
import java.util.Stack;

public class DFS {
    public static void main(String[] args) {
        Map<Character, List<Character>> graph = Map.of(
                'A', List.of('B', 'C'),
                'B', List.of('D'),
                'C', List.of('E'),
                'D', List.of('F'),
                'E', List.of(),
                'F', List.of()
        );
//        depthFirstSearch(graph, 'A');
        dfsUsingRecursion(graph, 'A');
    }

    public static void dfsUsingRecursion(Map<Character, List<Character>> graph, Character source){
        System.out.println(source);
        for(Character node : graph.get(source)){
            dfsUsingRecursion(graph, node);
        }
    }

    public static void depthFirstSearch(Map<Character, List<Character>> graph, Character source){
        Stack<Character> stack = new Stack<>();
        stack.push(source);
        while (!stack.isEmpty()){
            Character node = stack.pop();
            System.out.println(node);
            for(Character edge: graph.get(node)){
                stack.push(edge);
            }
        }
    }
}
