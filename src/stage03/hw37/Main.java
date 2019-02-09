package stage03.hw37;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a program, which inputs the rectangular matrix from a sequence of lines, ending with a line, containing the
 * only word "end" (without the quotation marks).
 * <p>
 * The program should output the matrix of the same size, where each element in the position (i, j) is equal to the
 * sum of the elements from the first matrix on the positions (i-1, j)(i+1, j)(i, j-1), (i, j+1). Boundary elements
 * have neighbours on the opposite side of the matrix. In the case of one row or column, the element itself may be
 * its neighbour.
 */
public class Main {
    public static void main(String[] args) {
        List<List<Integer>> matrix = readMatrix();
        print(sumNeighbours(matrix));
    }

    private static List<List<Integer>> sumNeighbours(List<List<Integer>> matrix) {
        List<List<Integer>> changed = new ArrayList<>();
        for (int i = 0; i < matrix.size(); i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < matrix.get(i).size(); j++) {
                int top = matrix.get(i - 1 < 0 ? matrix.size() - 1 : i - 1).get(j);
                int right = matrix.get(i).get(j - 1 < 0 ? matrix.get(i).size() - 1 : j - 1);
                int bottom = matrix.get((i + 1) % matrix.size()).get(j);
                int left = matrix.get(i).get((j + 1) % matrix.get(i).size());
                row.add(top + right + bottom + left);
            }
            changed.add(row);
        }
        return changed;
    }

    private static List<List<Integer>> readMatrix() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.lines()
                .takeWhile(line -> !"end".equals(line))
                .map(line -> Arrays.stream(line.split(" "))
                        .map(Integer::valueOf)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
    }

    private static void print(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            for (Integer item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}