package console;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunitBoard {
	@Test
	public void boardtestone() {
		Board board1=new Board(10);
		Board board2=new Board(10);
		board1.createBoard();
		board2.createBoard();
		board2=board1.Nextgen(board2);
//		board1=board1;
//		Assertions.assertEquals("false", cell.toString());
		Assertions.assertEquals("__________\n"
				+ "__________\n"
				+ "__________\n"
				+ "__________\n"
				+ "__________\n"
				+ "__________\n"
				+ "__________\n"
				+ "__________\n"
				+ "__________\n"
				+ "__________\n"
				+ "",board1.toString());
	}
	@Test
	public void boardtesttwo() {
		Board board1=new Board(10);
		Board board2=new Board(10);
		board1.createBoard();
		board2.createBoard();
		board1.cell[1][3].setStatus(true);
		board1.cell[1][4].setStatus(true);
		board1.cell[2][4].setStatus(true);
		board1.cell[5][3].setStatus(true);
		board1.cell[5][4].setStatus(true);
		board1.cell[6][2].setStatus(true);
		board1.cell[6][3].setStatus(true);
		board1.cell[7][5].setStatus(true);
		board1.cell[8][4].setStatus(true);
		board2=board1.Nextgen(board2);
		Assertions.assertEquals("__________\n"
				+ "___**_____\n"
				+ "___**_____\n"
				+ "__________\n"
				+ "__________\n"
				+ "__***_____\n"
				+ "__**______\n"
				+ "___**_____\n"
				+ "__________\n"
				+ "__________\n"
				+ "", board2.toString());
		
	}
	
	
}
