public class SeaBoard {
    private String[][] field = fillingField();

    private String[][] fillingField() {
        String[][] field = new String[10][10];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = ".";
            }
        }
        return field;
    }

    public String[][] getField() {
        return this.field;
    }

    public void shoot(int line, int column, String issue) {
        if (issue == "m") {
            field[line][column] = "#";
        } else if (issue == "h") {
            field[line][column] = "x";
        } else {
            field[line][column] = "x";
            checkPerimter(line, column);
            if (field[line + 1][column] == "x") {
                checkPerimter(line + 1, column);
                if ((line + 2) < 10 && field[line + 2][column] == "x") {
                    checkPerimter(line + 2, column);
                    if ((line + 3) < 10 && field[line + 3][column] == "x") {
                        checkPerimter(line + 3, column);
                    }
                }
            } else if (field[line - 1][column] == "x") {
                checkPerimter(line - 1, column);
                if ((line - 2) > 0 && field[line - 2][column] == "x") {
                    checkPerimter(line - 2, column);
                    if ((line - 3) > 0 && field[line - 3][column] == "x") {
                        checkPerimter(line - 3, column);
                    }
                }
            } else if (field[line][column + 1] == "x") {
                checkPerimter(line, column + 1);
                if ((column + 2) < 10 && field[line][column + 2] == "x") {
                    checkPerimter(line, column + 2);
                    if ((column + 3) < 10 && field[line][column + 3] == "x") {
                        checkPerimter(line, column + 3);
                    }
                }
            } else if (field[line][column - 1] == "x") {
                checkPerimter(line, column - 1);
                if ((column - 2) > 0 && field[line][column - 2] == "x") {
                    checkPerimter(line, column - 2);
                    if ((column - 3) > 0 && field[line][column - 3] == "x") {
                        checkPerimter(line, column - 3);
                    }
                }
            }
        }
    }

    private void checkPerimter(int line, int column) {
        int nullLine;
        if (line == 0) {
            nullLine = 0;
        } else {
            nullLine = line - 1;
        }
        int tenLine;
        if (line == 9) {
            tenLine = 9;
        } else {
            tenLine = line + 1;
        }
        int tenColumn;
        if (column == 9) {
            tenColumn = 9;
        } else {
            tenColumn = column + 1;
        }
        int nullColumn;
        if (column == 0) {
            nullColumn = 0;
        } else {
            nullColumn = column - 1;
        }

        for (int i = nullLine; i <= tenLine; i++) {
            for (int j = nullColumn; j <= tenColumn; j++) {
                if (field[i][j] == ".") {
                    field[i][j] = "#";
                }
            }
        }
    }
    public String check(int line, int column) {
        return field[line][column];
    }
}
