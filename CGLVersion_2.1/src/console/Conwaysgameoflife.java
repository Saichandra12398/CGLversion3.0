package console;
/*
 * @Author: Saichandra Bussa 2020501006
 */
public class Conwaysgameoflife {

	public Board b1;		//Board variable b1,b2
	Board b2;
	int boardsize;	//Size of the board

//	public static void main(String[] args) {
//		
//		// TODO Auto-generated method stub
//
//	}
//	public String check() {
//		Board b1 = new Board(5);
//		b1.createBoard();
//		return b1.toString();
//	}
	/*
	 * This function is used to create the board with the given live cells
	 * and the parameter in the function a integer array with livecells and size of board
	 * set all live cells in the board as true
	 * */
	public void Start(int[][] arr, int boardsize) {
		this.boardsize = boardsize;
		this.b1 = new Board(boardsize);
		this.b2 = new Board(boardsize);
		this.b1.createBoard();
		this.b2.createBoard();
		for (int i = 0; i < arr.length; i++) {
			int row = arr[i][0];
			int col = arr[i][1];
			this.b1.cell[row][col].setStatus(true);
		}
//		return this;
	}
	/*
	 * this function is to generate next generation with the current generation
	 * */
	public void nextGen() {
		b2 = new Board(boardsize);
		b2.createBoard();
		b2 = b1.Nextgen(b2);
		b1 = b2;

	}
	//this function is to generate the nth generation with parameter n as integer 
	public void nthgen(int n) {
		for (int i = 0; i < n; i++) {
			b2 = new Board(boardsize);
			b2.createBoard();
			b2 = b1.Nextgen(b2);
			if (b1.toString().equals(b2.toString()) ||count(b2.toString())==(boardsize*boardsize)) {
				break;
			} else {
				b1 = b2;
			}
		}
	}
	
	/*
	 * helper function used to return the count of dead cells
	 */
	public int count(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='_') {
				count++;
			}
		}
		return count;
	}
	
	/*
	 * this method is used to find upto what is the last generation
	 * */
	
	public void infinite() {
		int i = 0;
		for (;;) {
			i += 1;
			b2 = new Board(boardsize);
			b2.createBoard();
			b2 = b1.Nextgen(b2);
			if (b1.toString().equals(b2.toString()) ||count(b2.toString())==(boardsize*boardsize)) {
				System.out.println(i);
				b1 = b2;
				break;
			} else {
				b1 = b2;
			}

		}
	}

}
