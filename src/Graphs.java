import java.util.ArrayDeque;
import java.util.Scanner;


class Graphs {
    private boolean[][] graph;
    private ArrayDeque<Integer > queue = new ArrayDeque<>();
    private boolean[] used = new boolean[6];
    void inputMatrix(int size){
        Scanner in = new Scanner(System.in);
         boolean[][] matrix = new boolean[size][size];
        for (int i = 0; i<size; i++){
            for (int j = 0; j<size; j++){
                System.out.print("Input values: ");
                matrix[i][j] = in.nextInt() == 1;
                System.out.println(matrix[i][j] + "\t");
            }
        }
        graph = matrix;
    }


    void Bfs(){
        queue.add(1);
        used[0] = true;
        while (!queue.isEmpty()){
            int i = queue.element() - 1;
            System.out.println(queue.element());
            for (int j = 0; j < graph.length; j++){
                if (graph[i][j] && !used[j]){
                    used[j] = true;
                    queue.add(j+1);
                }
            }
            queue.remove();
        }
        isConnected(used);
    }

    void isConnected(boolean[] used){  //Костыли
        boolean flag = false;
        for (int i = 0; i < graph.length; i++){
            if (!used[i]){
                flag = false;
                System.out.println("Граф не связан");
            }
            else flag = true;

        }
        if (flag){
            System.out.println("Граф связан");
        }
    }


    int Dfs() {
            int visitedGraphs = 1;
            used[0] = true;
            for (int i = 0; i < graph.length; i++){
                if (!used[i]){
                    visitedGraphs += Dfs();
                    System.out.println("Количетсво связных графоф" + visitedGraphs);
                }
            }
        System.out.println("Количество звянных графоф: " + visitedGraphs);
        return visitedGraphs;
    }

}
