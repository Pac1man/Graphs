import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Graff {
    int vNum;
    int eNum;
    boolean[][] graph;
    boolean[] used;
    ArrayDeque<Integer > a = new ArrayDeque<>();

     void inputMatrix(int size){
        Scanner in = new Scanner(System.in);
        boolean matrix[][] = new boolean[size][size];
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
         a.add(1);
        a.stream().forEach(System.out::println);

        for (int i = 0; i < graph.length; i++){
             for (int j = a.getFirst(); j < graph.length; j ++)

             {
                 if (graph[i][j]) {
                     a.add(j + 1);
                 }
             }

             a.pop();
             a.stream().forEach(System.out::println);

         }


    }

}
