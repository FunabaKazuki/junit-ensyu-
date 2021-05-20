package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

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
	void test() {

	

		InputStream input = getClass().getResourceAsStream("Employee.txt");
		List<Employee> list = Employee.load(input);
		System.out.println(list.get(0).getFirstName());
		
		assertAll(
				() ->{assertEquals("Ichiro", list.get(0).getFirstName());},
				() ->{assertEquals("Tanaka", list.get(0).getLastName());},
				() ->{assertEquals("ichiro@example.com", list.get(0).getEmail());}
				);

	}

}
