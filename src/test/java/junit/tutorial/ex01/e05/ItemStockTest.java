package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ItemStockTest {

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

	@Test
	@DisplayName("case1")
	void test1() {
		ItemStock itemStock = new ItemStock();
		assertEquals(0, itemStock.getNum(new Item("name",100)));
	}
	@Test
	@DisplayName("case2")
	void test2() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item("name", 0);
		itemStock.add(item);
		assertEquals(1, itemStock.getNum(item));
	}
	@Test
	@DisplayName("case3")
	void test3() {
		ItemStock itemStock = new ItemStock();
		Map<String, Integer> testitemMap = new HashMap<>();
		testitemMap.put("name", 1);
		Field field = null;
		try {
			field = itemStock.getClass().getDeclaredField("itemMap");
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		field.setAccessible(true);
		try {
			field.set(itemStock,testitemMap);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(1, itemStock.getNum(new Item("name",0)));
	}
	
	@Test
	@DisplayName("case4")
	void test4() {
		ItemStock itemStock = new ItemStock();
		Map<String, Integer> testitemMap = new HashMap<>();
		testitemMap.put("name", 1);
		Field field = null;
		try {
			field = itemStock.getClass().getDeclaredField("itemMap");
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		field.setAccessible(true);
		try {
			field.set(itemStock,testitemMap);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		itemStock.add(new Item("name", 0) );
		
		assertEquals(2, itemStock.getNum(new Item("name",0)));
	}
	
	@Test
	@DisplayName("case5")
	void test5() {
		ItemStock itemStock = new ItemStock();
		Map<String, Integer> testitemMap = new HashMap<>();
		testitemMap.put("name", 1);
		Field field = null;
		try {
			field = itemStock.getClass().getDeclaredField("itemMap");
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		field.setAccessible(true);
		try {
			field.set(itemStock,testitemMap);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		itemStock.add(new Item("name2", 0) );
		
		assertEquals(1, itemStock.getNum(new Item("name2",0)));
	}
	

}
