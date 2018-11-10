package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExceptionCoverageMatricTest {

	@Test
	public void op_is_null() {
		ExceptionCoverageMetric ecm = new ExceptionCoverageMetric();
		Integer[] numbers = null;
		int result = -1;
		result = ecm.tryException(numbers);
		assertEquals(0,result);
	}

	@Test
	public void op_isnot_null() {
		ExceptionCoverageMetric ecm = new ExceptionCoverageMetric();
		Integer[] numbers = {1,2,3};
		int result = -1;
		result = ecm.tryException(numbers);
		assertEquals(6,result);
	}
	
	@Test
	public void throw_exception_coverage() {
		ExceptionCoverageMetric ecm = new ExceptionCoverageMetric();
		try {
			ecm.throwException();
			fail("No surprise");
		}catch(RuntimeException rte) {
			assertTrue(true);
		}
	}
	
	//Loop Coverage
	@Test
	public void length_of_op_is_0_jump_out_the_loop_directily() {
		ExceptionCoverageMetric ecm = new ExceptionCoverageMetric();
		Integer[] numbers = {};
		int result = 1;
		result = ecm.tryException(numbers);
		assertEquals(0,result);
	}
	
	@Test
	public void length_of_op_is_1_loop_1_time() {
		ExceptionCoverageMetric ecm = new ExceptionCoverageMetric();
		Integer[] numbers = {2};
		int result = 1;
		result = ecm.tryException(numbers);
		assertEquals(2,result);
	}
	
	@Test
	public void length_of_op_is_2_loop_1_time() {
		ExceptionCoverageMetric ecm = new ExceptionCoverageMetric();
		Integer[] numbers = {1,2};
		int result = 1;
		result = ecm.tryException(numbers);
		assertEquals(3,result);
	}
}
