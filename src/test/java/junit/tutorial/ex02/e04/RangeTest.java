package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {

	private Range range = new Range(0.0, 10.5);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@ParameterizedTest
	@ValueSource(doubles = { 0.0, 10.5 })
	void test(double d) {
		assertTrue(range.contains(d));
	}

	@ParameterizedTest
	@ValueSource(doubles = { -0.1, 10.6 })
	void test2(double d) {
		assertFalse(range.contains(d));
	}

	@Nested
	class nestTest {

		@BeforeEach
		void setUp2() throws Exception {
			range.setMin(-5.1);
			range.setMax(5.1);
		}

		@ParameterizedTest
		@ValueSource(doubles = { -5.1, 5.1 })
		void test3(double d) {
			assertTrue(range.contains(d));
		}

		@ParameterizedTest
		@ValueSource(doubles = { -5.2, 5.2 })
		void test24(double d) {
			assertFalse(range.contains(d));
		}

	}

}
