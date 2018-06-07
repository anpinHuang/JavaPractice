import java.util.ArrayList;
import java.util.List;

public class Sudoku {
	public static int[][] sudokuSolver(int[][] board) {
//		for(int[] row : board) {
//            printRow(row);
//        }
//		System.out.println("______________________");
		int[][] solution = board.clone();
		if(isFull(solution)) {
			return solution;
		}
		int i=0;
		int j=0;
		outerloop:
		for(i=0;i<=(board[0].length-1);i++) {
			for(j=0;j<=(board[0].length-1);j++) {
				if(board[i][j]==0) {
					break outerloop;
				}
			}
		}
		List<Integer> PlausibleEntry = plausibleEntry(board,i,j);
//		System.out.println(PlausibleEntry);
//		System.out.println(i+1);
//		System.out.println(j+1);
//		System.out.println("______________________");
		if(PlausibleEntry.isEmpty()) {
			return board;
		}
		for(int k=0;k<=(PlausibleEntry.size()-1);k++) {
			solution[i][j] = PlausibleEntry.get(k);
			solution = sudokuSolver(solution);
			if(isFull(solution)) {
				return solution;
			}
		}
//		for(int[] row : board) {
//            printRow(row);
//        }
//		System.out.println("after");
//		System.out.println(i+1);
//		System.out.println(j+1);
//		System.out.println("______________________");
		board[i][j]=0; // why? isn't it already 0? the clone does work as call by value
		return board;
	}
	public static boolean isFull(int[][] board) {
		for(int i=0;i<=(board[0].length-1);i++) {
			for(int j=0;j<=(board[0].length-1);j++) {
				if(board[i][j]==0) {
					return false;
				}
			}
		}
		return true;
	}
	public static List<Integer> plausibleEntry(int[][] board, int i, int j) {
		List<Integer> Possible = new ArrayList<>();
		for(int k=1;k<=board[0].length;k++) {
			Possible.add(k);
		}
		for(int k=0;k<=(board[0].length-1);k++) {
			if(Possible.contains(board[i][k])) {
				Possible.remove(Possible.indexOf(board[i][k]));
			}
		}
		for(int k=0;k<=(board[0].length-1);k++) {
			if(Possible.contains(board[k][j])) {
				Possible.remove(Possible.indexOf(board[k][j]));
			}
		}
		return Possible;
	}

    public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print(" | ");
        }
        System.out.println();
    }
	
}
