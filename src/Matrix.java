import java.util.Arrays;

public class Matrix {

    public static int sumMatrix(int[][] matrix) {
        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .sum();
    }
}
