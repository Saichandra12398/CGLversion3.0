package console;
/*
 * @Author: Saichandra Bussa 2020501006
 */

import java.util.Arrays;

public class Board {
	private int size;			//Size of the board (Declaration)
	public int size1;
	public Cell[][] cell;		//cell array used to in the board for N X N Board
	
	/*
	 * Constructor used to assign memory for cell array
	 * i.e intializing variable
	 * */
	public Board(int size,int size1) {
		this.size = size;
		this.size1=size1;
		this.cell=new Cell[this.size][this.size1];
	}
	
	/*
	 * this method is used to create the board with the cell object 2d array
	 * and assigning all the cells as false while creation
	 * */
	public Board createBoard() {
		for (int i = 0; i < this.getSize(); i++) {
			for (int j = 0; j < this.size1; j++) {
				this.cell[i][j] = new Cell(false);
			}
		}
		return this;
	}
	
	/*
	 * Helper function used to do modulo division for negative numbers
	 * */
	public int mdivision(int x) {
		
		return ((x % this.size) + this.size) % this.size;
	}
	public int mdivision1(int x) {
		
		return ((x % this.size1) + this.size1) % this.size1;
	}
	
	/*
	 * Nextgen function is used to generate next generation with current generation as parameter
	 * and we will check 8 surrounding cells for each cell to generate 
	 * X X X
	 * X * X
	 * X X X
	 * */
	public Board Nextgen(Board board) {
		for (int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.size1; j++) {
				int check = 0;
				if (this.cell[mdivision(i + 1)][mdivision1(j + 1)].isStatus()) {
					check++;
				}
				if (this.cell[mdivision(i - 1)][mdivision1(j - 1)].isStatus()) {
					check++;
				}
				if (this.cell[mdivision(i)][mdivision1(j + 1)].isStatus()) {
					check++;
				}
				if (this.cell[mdivision(i)][mdivision1(j - 1)].isStatus()) {
					check++;
				}
				if (this.cell[mdivision(i + 1)][mdivision1(j)].isStatus()) {
					check++;
				}
				if (this.cell[mdivision(i - 1)][mdivision1(j)].isStatus()) {
					check++;
				}
				if (this.cell[mdivision(i + 1)][mdivision1(j - 1)].isStatus()) {
					check++;
				}
				if (this.cell[mdivision(i - 1)][mdivision1(j + 1)].isStatus()) {
					check++;
				}
				
				/* 
				 * Generating new cell with the given conditions in the requiremens for over and under populated as dead
				 * and if surrounded alive is 3 or 2 the the new gen cell is also alive
				 * */
				if (this.cell[i][j].isStatus()) {
					if (check == 2 || check == 3) {
						board.cell[i][j].setStatus(true);
					} else {
						board.cell[i][j].setStatus(false);
					}
				} else {
					if (check == 3) {
						board.cell[i][j].setStatus(true);
					}
				}

			}
		}
		return board;

	}
	/*Method used to print the board i.e board object*/
	@Override
	public String toString() {
		String res="";
		for(int i=0;i<this.size;i++) {
			for(int j=0;j<this.size1;j++) {
				if(this.cell[i][j].isStatus()) {
					res+="*";
				}
				else {
					res+="_";
				}
			}
			res+="\n";
		}
		return res;
	}

	public int getSize() {
		return size;
	}

//	public void setSize(int size) {
//		this.size = size;
//	}

}
