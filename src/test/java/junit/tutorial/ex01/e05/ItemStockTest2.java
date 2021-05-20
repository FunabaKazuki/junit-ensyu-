package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

class ItemStockTest2 {

	ItemStock itemStock = new ItemStock();
	
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

	@org.junit.jupiter.api.Nested
	class nestTest {
		
		@BeforeEach
		void beforeEach() {
			
			itemStock.add(new Item("name", 0));
		}
		@Test
		void test3() {
			assertEquals(1, itemStock.getNum(new Item("name",0)));
		}

		@Test
		void test4() {
			itemStock.add(new Item("name", 0));
			assertEquals(2, itemStock.getNum(new Item("name",0)));
		}
		@Test
		void test5() {
			itemStock.add(new Item("name2", 0));
			assertEquals(1, itemStock.getNum(new Item("name",0)));
		}
		
	}

}
