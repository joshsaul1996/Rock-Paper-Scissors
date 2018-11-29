package rockPaperScissorsTest;

import org.junit.Test;

import static org.junit.Assert.*;
import static rockPaperScissors.Game.*;

public class GameTest {
	
	@Test
	public void Rock() {
		assertEquals(false,CheckHands(3,2));

	}
	@Test
	public void Scissors() {
		assertEquals(false,CheckHands(2, 1));

	}
	@Test
	public void Paper() {
		assertEquals(false,CheckHands(1,3));

	}
	@Test
	public void Draw1() {
		assertEquals(false,CheckHands(1,1));

	}
	public void Draw2() {
		assertEquals(false,CheckHands(2, 2));

	}
	public void Draw3() {
		assertEquals(false,CheckHands(3, 3));

	
	}
}
