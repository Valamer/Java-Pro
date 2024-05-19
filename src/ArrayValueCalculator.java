public class ArrayValueCalculator {
    public static int doCalc(String[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length != 4 || matrix[i].length != 4) {
                throw new ArraySizeException("Matrix size must be 4x4");
            }
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new  ArrayDataException("Can't parse string into integer at [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}
