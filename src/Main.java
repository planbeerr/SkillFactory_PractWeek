import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        SeaBoard board = new SeaBoard();
//        String[][] field = board.getField();
//        for (int i = 0; i < board.getField().length; i++) {
//            for (int j = 0; j < board.getField()[0].length; j++) {
//                System.out.print(board.getField()[i][j]);
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//        board.shoot(0, 0, "m");
//        for (int i = 0; i < board.getField().length; i++) {
//            for (int j = 0; j < board.getField()[0].length; j++) {
//                System.out.print(board.getField()[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println();
//        board.shoot(2, 0, "h");
//        for (int i = 0; i < board.getField().length; i++) {
//            for (int j = 0; j < board.getField()[0].length; j++) {
//                System.out.print(board.getField()[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println();
//        board.shoot(6, 9, "h");
//        for (int i = 0; i < board.getField().length; i++) {
//            for (int j = 0; j < board.getField()[0].length; j++) {
//                System.out.print(board.getField()[i][j]);
//            }
//            System.out.println();
//        }
//
//        board.shoot(2, 1, "d");
//        System.out.println();
//        for (int i = 0; i < board.getField().length; i++) {
//            for (int j = 0; j < board.getField()[0].length; j++) {
//                System.out.print(board.getField()[i][j]);
//            }
//            System.out.println();
//        }
//
//        board.shoot(6, 8, "h");
//        System.out.println();
//        for (int i = 0; i < board.getField().length; i++) {
//            for (int j = 0; j < board.getField()[0].length; j++) {
//                System.out.print(board.getField()[i][j]);
//            }
//            System.out.println();
//        }
//        board.shoot(6, 7, "d");
//        System.out.println();
//        for (int i = 0; i < board.getField().length; i++) {
//            for (int j = 0; j < board.getField()[0].length; j++) {
//                System.out.print(board.getField()[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println(board.check(9, 9));
//        Squirrel s = new Squirrel(new int[] {2, 5, -3, -1});
//        System.out.println(s.maxNuts());
//        Squirrel s2 = new Squirrel(new int[] {1, -2, 3, 1, -1, -4, 2, 3});
//        System.out.println(s2.maxNuts());
//        Squirrel s3 = new Squirrel(new int[] {1, 7, 3, -1, -1, -4, 2, -3});
//        System.out.println(s3.getNuts(3));
//        System.out.println(s3.maxNuts());
        Squirrel s4 = new Squirrel(new int[] {1, -2, -4, 7, 3, -2, -2, 1, -1});
        System.out.println(s4.maxNuts());
//        [1, -1, 2, -2, -7, -7, 2, 1]
//        [2, 5, -3, -1]
//        [1, -2, -4, 7, 3, -2, -2, 1, -1]
//        [-2, 2, 4, -6, -2, -1, -2, 1]
//        [1]
//        [-1]
//        [1, -2]
//        [1, -2, 4, 6, 3, -2, -2, -3, -1]
//        [1, 1, 1, 1, 1]
//        [1, 1, 1, 1, -1]
    }
}