/**
 * Created by Sandeep on 11/30/2015.
 */
public class Action {
    private static String[][] matrix;

    public Action(String[][] matrix) {
        this.matrix = matrix;
    }

    public static void addX(int row, int column) throws ElementExistsException{
        if (contains(row,column)) {
            throw new ElementExistsException("Already Exists!");
        } else {
            matrix[row][column] = "x";
        }
    }

    public static void addO(int row, int column) throws ElementExistsException{
        if (contains(row,column)) {
            throw new ElementExistsException("Already Exists!");
        } else {
            matrix[row][column] = "o";
        }
    }

    public static boolean contains(int row, int column) throws ElementExistsException {
        try {
            if (matrix[row][column].equals("x") || matrix[row][column].equals("o")) {
                return true;
            } else {
                return false;
            }
        } catch (NullPointerException npe) {
            return false;
        }
    }

    public static String printBoard() {
        String[][] copy = matrix.clone();
        String result = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == null) {
                    copy[i][j] = "_";
                }
                result = result + copy[i][j] + " ";
            }
            result = result + "\n";
        }
        return result;
    }
}
