public class TicTacToe {
    private char[][] board = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
    private int x, y;
    char player = 'X';
    private int endOfGame = 0;

    public TicTacToe() {
    }

    public void newGame() {
        this.board = new char[][]{{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
        endOfGame = 0;
    }

    public char[][] getField() {
        return board;
    }

    public String makeMove(int x, int y) {
        if (endOfGame == 1) {
            return "Game was ended";
        }
        if (board[x - 1][y - 1] == 'X' || board[x - 1][y - 1] == 'O') {
            return "Cell x, y is already occupied";
        } else {
            board[x - 1][y - 1] = player;
            if (winner(board)) {
                endOfGame = 1;
                return "Player " + player + " won";
            } else {
                if (hasEmptySpot(board)) {
                    if (player == 'X') {
                        player = 'O';
                    } else {
                        player = 'X';
                    }
                    return "Move completed";
                } else {
                    endOfGame = 1;
                    return "Draw";
                }
            }
        }
    }

    public Character checkGame() {
        if (winner(board)) {
            return player;
        } else if (!hasEmptySpot(board)) {
            return 'D';
        } else {
            return null;
        }
    }

    public Boolean winner (char[][] board){
        return (board[0][0] == board[0][1] && board[0][0] == board[0][2]) && board[0][0] != '-' ||
                (board[0][0] == board[1][1] && board[0][0] == board[2][2]) && board[0][0] != '-' ||
                (board[0][0] == board[1][0] && board[0][0] == board[2][0]) && board[0][0] != '-' ||
                (board[2][0] == board[2][1] && board[2][0] == board[2][2]) && board[2][0] != '-' ||
                (board[2][0] == board[1][1] && board[0][0] == board[0][2]) && board[2][0] != '-' ||
                (board[0][2] == board[1][2] && board[0][2] == board[2][2]) && board[0][2] != '-' ||
                (board[0][1] == board[1][1] && board[0][1] == board[2][1]) && board[0][1] != '-' ||
                (board[1][0] == board[1][1] && board[1][0] == board[1][2]) && board[1][0] != '-';
    }

    public Boolean hasEmptySpot(char[][] board){
        for (int i = 0; i< board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != 'O' && board[i][j] != 'X') {
                    return true;
                }
            }
        }
        return false;
    }
}
