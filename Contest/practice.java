import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practice {
    
        static List<List<Integer>> graph;
        static boolean[] visited;
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt(); 
            int e = scanner.nextInt(); 
    
            graph = new ArrayList<>();
            visited = new boolean[n + 1];
    
            
            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }
    
            
            for (int i = 0; i < e; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                graph.get(u).add(v);
                graph.get(v).add(u);
            }
    
            
            dfs(1);
    
            scanner.close();
        }
    
        static void dfs(int node) {
            visited[node] = true;
            System.out.print(node + " ");
    
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    dfs(neighbor);
                }
            }
        }
    
}
