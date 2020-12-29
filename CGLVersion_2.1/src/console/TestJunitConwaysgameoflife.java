package console;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunitConwaysgameoflife {
//	@Test
//	public void conwaytestone() {
//		Conwaysgameoflife game = new Conwaysgameoflife();
//		Assertions.assertEquals("_____\n" + "_____\n" + "_____\n" + "_____\n" + "_____\n" + "", game.check());
//	}

	@Test
//	public void conwaytesttwo() {
//		Conwaysgameoflife game = new Conwaysgameoflife();
////		int[][] arr = { { 1, 3 }, { 1, 4 }, { 2, 4 }, { 5, 3 }, { 5, 4 }, { 6, 2 }, { 6, 3 }, { 7, 5 }, { 8, 4 } };
//		int[][] arr= {{74,75},{75,74},{75,75},{75,76},{76,76}};
//		game.Start(arr, 100);
//		
////		game.Start(, 10);
////		System.out.println(game.b1.toString());
//		Assertions.assertEquals("__________\n" + "___**_____\n" + "____*_____\n" + "__________\n" + "__________\n"
//				+ "___**_____\n" + "__**______\n" + "_____*____\n" + "____*_____\n" + "__________\n" + "",
//				game.b1.toString());
//		System.out.println("BOARD CREATED WITH LIVE CELLS");
//	}

	@Test
	public void conwaytestthree() {
		Conwaysgameoflife game = new Conwaysgameoflife();

		int[][] arr = { { 1, 3 }, { 1, 4 }, { 2, 4 }, { 5, 3 }, { 5, 4 }, { 6, 2 }, { 6, 3 }, { 7, 5 }, { 8, 4 } };
		game.Start(arr, 10);
		game.nextGen();
//		System.out.println(game.b1.toString());
//		System.out.println(game.b2.toString());
		Assertions.assertEquals("__________\n" + "___**_____\n" + "___**_____\n" + "__________\n" + "__________\n"
				+ "__***_____\n" + "__**______\n" + "___**_____\n" + "__________\n" + "__________\n" + "",
				game.b1.toString());
		game.nextGen();
//		System.out.println(game.b1.toString());
//		System.out.println(game.b2.toString());
		Assertions
				.assertEquals(
						"__________\n" + "___**_____\n" + "___**_____\n" + "__________\n" + "___*______\n"
								+ "__*_*_____\n" + "__________\n" + "__***_____\n" + "__________\n" + "__________\n",
						game.b1.toString());
		System.out.println("BOARD CREATED WITH LIVE CELLS");
		game.nthgen(20);
		Assertions
				.assertEquals(
						"__________\n" + "__________\n" + "__________\n" + "__________\n" + "__________\n"
								+ "__________\n" + "_**_______\n" + "_**_______\n" + "__________\n" + "__________\n",
						game.b1.toString());
//		game.infinite();
//		Assertions.assertEquals("hi", game.b1.toString());
	}

	@Test
	public void conwaytestFour() {
		Conwaysgameoflife game = new Conwaysgameoflife();

//		int[][] arr = { { 1, 3 }, { 1, 4 }, { 2, 4 }, { 5, 3 }, { 5, 4 }, { 6, 2 }, { 6, 3 }, { 7, 5 }, { 8, 4 } };
//		game.Start(arr, 10);
		int[][] arr= {{74,75},{75,74},{75,75},{75,76},{76,76}};
		game.Start(arr, 100);
		game.infinite();
		Assertions.assertEquals("__________\n" + "__________\n" + "__________\n" + "__________\n" + "__________\n"
				+ "__________\n" + "_**_______\n" + "_**_______\n" + "__________\n" + "__________\n" + "",
				game.b1.toString());
	}

}
