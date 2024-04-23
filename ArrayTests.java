import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3, 2 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 2, 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { 2, 3, 7, 2};
    assertArrayEquals(new int[]{ 2, 7, 3, 2}, ArrayExamples.reversed(input1));
  }

}
