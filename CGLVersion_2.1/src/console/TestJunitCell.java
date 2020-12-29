package console;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunitCell {
	@Test
	public void celltestone() {
		Cell cell=new Cell(false);
		cell.setStatus(false);
		System.out.println(cell.isStatus());
		System.out.println("TestCase 1");
		Assertions.assertEquals("false", cell.toString());
	}
}
