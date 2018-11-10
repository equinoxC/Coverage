package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class LogicStructureTest {

	private LogicStructure ls = new LogicStructure();
	
	//op1_is_true_and_op2_is_true_and_op3_is_ture
	@Test
	public void op1_is_true_and_op2_is_true_and_op3_is_ture_by_usualLogic() {
		boolean op1 = true;
		boolean op2 = true;
		boolean op3 = true;
		boolean expectedRlt = true;
		boolean actualRlt = ls.usualLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	@Test
	public void op1_is_true_and_op2_is_true_and_op3_is_ture_by_unUsualLogic() {
		boolean op1 = true;
		boolean op2 = true;
		boolean op3 = true;
		boolean expectedRlt = true;
		boolean actualRlt = ls.unUsualLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	@Test
	public void op1_is_true_and_op2_is_true_and_op3_is_ture_by_nestedLogic() {
		boolean op1 = true;
		boolean op2 = true;
		boolean op3 = true;
		boolean expectedRlt = true;
		boolean actualRlt = ls.nestedLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}

	//op1_is_true_and_op2_is_true_and_op3_is_false
	@Test
	public void op1_is_true_and_op2_is_true_and_op3_is_false_by_usualLogic() {
		boolean op1 = true;
		boolean op2 = true;
		boolean op3 = false;
		boolean expectedRlt = true;
		boolean actualRlt = ls.usualLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	@Test
	public void op1_is_true_and_op2_is_true_and_op3_is_false_by_unUsualLogic() {
		boolean op1 = true;
		boolean op2 = true;
		boolean op3 = false;
		boolean expectedRlt = true;
		boolean actualRlt = ls.unUsualLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	@Test
	public void op1_is_true_and_op2_is_true_and_op3_is_false_by_nestedLogic() {
		boolean op1 = true;
		boolean op2 = true;
		boolean op3 = false;
		boolean expectedRlt = true;
		boolean actualRlt = ls.nestedLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	//op1_is_true_and_op2_is_false_and_op3_is_true
	@Test
	public void op1_is_true_and_op2_is_false_and_op3_is_true_by_usualLogic() {
		boolean op1 = true;
		boolean op2 = false;
		boolean op3 = true;
		boolean expectedRlt = true;
		boolean actualRlt = ls.usualLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	@Test
	public void op1_is_true_and_op2_is_false_and_op3_is_true_by_unUsualLogic() {
		boolean op1 = true;
		boolean op2 = false;
		boolean op3 = true;
		boolean expectedRlt = true;
		boolean actualRlt = ls.unUsualLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	@Test
	public void op1_is_true_and_op2_is_false_and_op3_is_true_by_nestedLogic() {
		boolean op1 = true;
		boolean op2 = false;
		boolean op3 = true;
		boolean expectedRlt = true;
		boolean actualRlt = ls.nestedLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	//op1_is_true_and_op2_is_false_and_op3_is_false
	@Test
	public void op1_is_true_and_op2_is_false_and_op3_is_false_by_usualLogic() {
		boolean op1 = true;
		boolean op2 = false;
		boolean op3 = false;
		boolean expectedRlt = false;
		boolean actualRlt = ls.usualLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	@Test
	public void op1_is_true_and_op2_is_false_and_op3_is_false_by_unUsualLogic() {
		boolean op1 = true;
		boolean op2 = false;
		boolean op3 = false;
		boolean expectedRlt = false;
		boolean actualRlt = ls.unUsualLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	@Test
	public void op1_is_true_and_op2_is_false_and_op3_is_false_by_nestedLogic() {
		boolean op1 = true;
		boolean op2 = false;
		boolean op3 = false;
		boolean expectedRlt = false;
		boolean actualRlt = ls.nestedLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	//op1_is_false_and_op2_is_true_and_op3_is_ture
	@Test
	public void op1_is_false_and_op2_is_true_and_op3_is_ture_by_usualLogic() {
		boolean op1 = false;
		boolean op2 = true;
		boolean op3 = true;
		boolean expectedRlt = true;
		boolean actualRlt = ls.usualLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	@Test
	public void op1_is_false_and_op2_is_true_and_op3_is_ture_by_unUsualLogic() {
		boolean op1 = false;
		boolean op2 = true;
		boolean op3 = true;
		boolean expectedRlt = true;
		boolean actualRlt = ls.unUsualLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	@Test
	public void op1_is_false_and_op2_is_true_and_op3_is_ture_by_nestedLogic() {
		boolean op1 = false;
		boolean op2 = true;
		boolean op3 = true;
		boolean expectedRlt = true;
		boolean actualRlt = ls.nestedLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}

	//op1_is_false_and_op2_is_true_and_op3_is_false
	@Test
	public void op1_is_false_and_op2_is_true_and_op3_is_false_by_usualLogic() {
		boolean op1 = false;
		boolean op2 = true;
		boolean op3 = false;
		boolean expectedRlt = false;
		boolean actualRlt = ls.usualLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	@Test
	public void op1_is_false_and_op2_is_true_and_op3_is_false_by_unUsualLogic() {
		boolean op1 = false;
		boolean op2 = true;
		boolean op3 = false;
		boolean expectedRlt = false;
		boolean actualRlt = ls.unUsualLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	@Test
	public void op1_is_false_and_op2_is_true_and_op3_is_false_by_nestedLogic() {
		boolean op1 = false;
		boolean op2 = true;
		boolean op3 = false;
		boolean expectedRlt = false;
		boolean actualRlt = ls.nestedLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	//op1_is_false_and_op2_is_false_and_op3_is_true
	@Test
	public void op1_is_false_and_op2_is_false_and_op3_is_true_by_usualLogic() {
		boolean op1 = false;
		boolean op2 = false;
		boolean op3 = true;
		boolean expectedRlt = true;
		boolean actualRlt = ls.usualLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	@Test
	public void op1_is_false_and_op2_is_false_and_op3_is_true_by_unUsualLogic() {
		boolean op1 = false;
		boolean op2 = false;
		boolean op3 = true;
		boolean expectedRlt = true;
		boolean actualRlt = ls.unUsualLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	@Test
	public void op1_is_false_and_op2_is_false_and_op3_is_true_by_nestedLogic() {
		boolean op1 = false;
		boolean op2 = false;
		boolean op3 = true;
		boolean expectedRlt = true;
		boolean actualRlt = ls.nestedLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	//op1_is_false_and_op2_is_false_and_op3_is_false
	@Test
	public void op1_is_false_and_op2_is_false_and_op3_is_false_by_usualLogic() {
		boolean op1 = false;
		boolean op2 = false;
		boolean op3 = false;
		boolean expectedRlt = false;
		boolean actualRlt = ls.usualLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	@Test
	public void op1_is_false_and_op2_is_false_and_op3_is_false_by_unUsualLogic() {
		boolean op1 = false;
		boolean op2 = false;
		boolean op3 = false;
		boolean expectedRlt = false;
		boolean actualRlt = ls.unUsualLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
	
	@Test
	public void op1_is_false_and_op2_is_false_and_op3_is_false_by_nestedLogic() {
		boolean op1 = false;
		boolean op2 = false;
		boolean op3 = false;
		boolean expectedRlt = false;
		boolean actualRlt = ls.nestedLogic(op1, op2, op3);
		assertEquals(expectedRlt,actualRlt);
	}
}
