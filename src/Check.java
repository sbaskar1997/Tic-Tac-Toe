/**
 * Created by Sandeep on 11/30/2015.
 */
public class Check {
    public boolean checkHorizontalLineO(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == null) {
                    matrix[i][j] = "_";
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0].equals("o")) {
                counter++;
            } else {
                counter = 0;
            }
        }
        if (counter != 3) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][1].equals("o")) {
                    counter++;
                } else {
                    counter = 0;
                }
            }

            if (counter != 3) {
                for (int i = 0; i < matrix.length; i++) {
                    if (matrix[i][2].equals("o")) {
                        counter++;
                    } else {
                        counter = 0;
                    }
                }

                if (counter != 3) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkHorizontalLineX(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == null) {
                    matrix[i][j] = "_";
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0].equals("x")) {
                counter++;
            } else {
                counter = 0;
            }
        }
        if (counter != 3) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][1].equals("x")) {
                    counter++;
                } else {
                    counter = 0;
                }
            }

            if (counter != 3) {
                for (int i = 0; i < matrix.length; i++) {
                    if (matrix[i][2].equals("x")) {
                        counter++;
                    } else {
                        counter = 0;
                    }
                }

                if (counter != 3) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkVerticalLineO(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == null) {
                    matrix[i][j] = "_";
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == null) {
                    matrix[i][j] = "_";
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[0][i].equals("o")) {
                counter++;
            } else {
                counter = 0;
            }
        }
        if (counter != 3) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[1][i].equals("o")) {
                    counter++;
                } else {
                    counter = 0;
                }
            }

            if (counter != 3) {
                for (int i = 0; i < matrix.length; i++) {
                    if (matrix[2][i].equals("o")) {
                        counter++;
                    } else {
                        counter = 0;
                    }
                }

                if (counter != 3) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkVerticalLineX(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == null) {
                    matrix[i][j] = "_";
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[0][i].equals("x")) {
                counter++;
            } else {
                counter = 0;
            }
        }
        if (counter != 3) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[1][i].equals("x")) {
                    counter++;
                } else {
                    counter = 0;
                }
            }

            if (counter != 3) {
                for (int i = 0; i < matrix.length; i++) {
                    if (matrix[2][i].equals("x")) {
                        counter++;
                    } else {
                        counter = 0;
                    }
                }

                if (counter != 3) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkDiagonalO(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == null) {
                    matrix[i][j] = "_";
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    if (matrix[i][j].equals("o")) {
                        counter++;
                    } else {
                        counter = 0;
                    }
                }
            }
        }
        if (counter != 3) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (Math.abs(i - j) == 2 || (i == 2 && j == 2)) {
                        if (matrix[i][j].equals("o")) {
                            counter++;
                        } else {
                            counter = 0;
                        }
                    }
                }
            }
            if (counter != 3) {
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    public boolean checkDiagonalX(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == null) {
                    matrix[i][j] = "_";
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    if (matrix[i][j].equals("x")) {
                        counter++;
                    } else {
                        counter = 0;
                    }
                }
            }
        }
        if (counter != 3) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (Math.abs(i - j) == 2 || (i == 2 && j == 2)) {
                        if (matrix[i][j].equals("x")) {
                            counter++;
                        } else {
                            counter = 0;
                        }
                    }
                }
            }
            if (counter != 3) {
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    public boolean check(String[][] matrix) {
        boolean a = checkDiagonalO(matrix);
        boolean b = checkDiagonalX(matrix);
        boolean c = checkHorizontalLineO(matrix);
        boolean d = checkHorizontalLineX(matrix);
        boolean e = checkVerticalLineO(matrix);
        boolean f = checkVerticalLineX(matrix);
        if (a || c || e) {
            System.out.println("o won!");
            return true;
        } else if (b || d || f) {
            System.out.println("x won!");
            return true;
        } else {
            return false;
        }
    }
}


