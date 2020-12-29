package hw4;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class letterGradeTest {
	
	@Test
	public void testMainNumber() {
		letterGrade letterGrade = new letterGrade();
		ByteArrayInputStream in = new ByteArrayInputStream("49".getBytes());
		
		System.setIn(in);
		letterGrade.main(null);
		
		in = new ByteArrayInputStream("@".getBytes());
		System.setIn(in);
		letterGrade.main(null);
		
		in = new ByteArrayInputStream("\n".getBytes());
		System.setIn(in);
		letterGrade.main(null);
	}
	
	@Test
	public void testLetterGrade() {
		letterGrade letterGrade = new letterGrade();
		assertEquals('X', letterGrade.letterGrade(-1));
		assertEquals('X', letterGrade.letterGrade(101));
		assertEquals('F', letterGrade.letterGrade(0));
		assertEquals('F', letterGrade.letterGrade(59));
		assertEquals('D', letterGrade.letterGrade(60));
		assertEquals('D', letterGrade.letterGrade(69));
		assertEquals('C', letterGrade.letterGrade(70));
		assertEquals('C', letterGrade.letterGrade(79));
		assertEquals('B', letterGrade.letterGrade(80));
		assertEquals('B', letterGrade.letterGrade(89));
		assertEquals('A', letterGrade.letterGrade(90));
		assertEquals('A', letterGrade.letterGrade(100));
	}
}
