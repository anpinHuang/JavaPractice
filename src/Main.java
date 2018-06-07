import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] InputArray = {2,3,7,11};
		int a = CoinChange.coinChange(88,InputArray,0);
		System.out.println(a);
		HashMap<String, Integer> InitialHashMap = new HashMap<String, Integer>();
		int b = CoinChangeDP.coinChangeDP(88,InputArray,0, InitialHashMap);
		System.out.println(b);
		int[][] SudokuBoard = {
				{5,3,0,0,7,0,0,0,0},
				{6,0,0,1,9,5,0,0,0},
				{0,9,8,0,0,0,0,6,0},
				{8,0,0,0,6,0,0,0,3},
				{4,0,0,8,0,3,0,0,1},
				{7,0,0,0,2,0,0,0,6},
				{0,6,0,0,0,0,2,8,0},
				{0,0,0,4,1,9,0,0,5},
				{0,0,0,0,8,0,0,7,9}
		};
		SudokuBoard = Sudoku.sudokuSolver(SudokuBoard);
		for(int[] row : SudokuBoard) {
			Sudoku.printRow(row);
		}
//		int[][] solution = SudokuBoard.clone();
//		solution[0][0] = 100;
//		for(int[] row : SudokuBoard) {
//			Sudoku.printRow(row);
//		}
//		for(int[] row : solution) {
//			Sudoku.printRow(row);
//		}
//		System.out.println(SudokuBoard[0][0]);
//		int[] aa = {1,2,3};
//		int[] bb = aa.clone();
//		bb[0]= 100;
//		System.out.println(aa[0]);
//		System.out.println(bb[0]);
//		System.out.println(SudokuBoard);
//		List<Integer> Possible = new ArrayList<>();
//		for(int k=1;k<=SudokuBoard[0].length;k++) {
//			Possible.add(k);
//		}
//		Possible.remove(Possible.indexOf(1));
//		System.out.println(Possible);

	}

}
