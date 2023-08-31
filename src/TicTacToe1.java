public class TicTacToe1 {
    private String[][] board = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
    private int x, y;
    private String player = "X";
    private int endOfGame = 0;
    public void newGame() {
        this.board = new String[][]{{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        endOfGame = 0;
        player = "X";
    }


    public String[][] getField() {
        return board;
    }


    public String makeMove(int x, int y) {
        if (endOfGame == 1) {
            return "Game was ended";
        }
        if (board[x - 1][y - 1] == "X" || board[x - 1][y - 1] == "0") {
            return "Cell " + x + ", " + y + " is already occupied";
        } else {
            board[x - 1][y - 1] = player;
            if (winner(board)) {
                endOfGame = 1;
                return "Player " + player + " won";
            } else {
                if (hasEmptySpot(board)) {
                    if (player == "X") {
                        player = "0";
                    } else {
                        player = "X";
                    }
                    return "Move completed";
                } else {
                    endOfGame = 1;
                    return "Draw";
                }
            }
        }
    }


    public String checkGame() {
        if (winner(board)) {
            return player;
        } else if (!hasEmptySpot(board)) {
            return "D";
        } else {
            return null;
        }
    }


    public static Boolean winner (String[][] board){
        return (board[0][0] == board[0][1] && board[0][0] == board[0][2]) && board[0][0] != "-" || //совпадение по оси X0
                (board[0][0] == board[1][1] && board[0][0] == board[2][2]) && board[0][0] != "-" || //совпадение наискось с левого верха до правого низа
                (board[0][0] == board[1][0] && board[0][0] == board[2][0]) && board[0][0] != "-" || //сопадение по оси Y0
                (board[2][0] == board[2][1] && board[2][0] == board[2][2]) && board[2][0] != "-" || //совпадениепо оси Y2
                (board[2][0] == board[1][1] && board[2][0] == board[0][2]) && board[2][0] != "-" || //сопадение наискось с правого верха до левого низа
                (board[0][2] == board[1][2] && board[0][2] == board[2][2]) && board[0][2] != "-" || //совпадение по оси X2
                (board[0][1] == board[1][1] && board[0][1] == board[2][1]) && board[0][1] != "-" || //совпадение по оси X1
                (board[1][0] == board[1][1] && board[1][0] == board[1][2]) && board[1][0] != "-"; //совпадение по оси Y1
    }


    public static Boolean hasEmptySpot(String[][] board){
        for (int i = 0; i< board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != "'O'" && board[i][j] != "'X'") {
                    return true;
                }
            }
        }
        return false;
    }
}
