package LeraningTestNG;

import ui.Test;

public class TestNG {


@BeforeTest
public void beforeMethod() {
	System.out.println("Opening Browser");
	}
@Test
public void Test3() {
	System.out.println("Inside Test");
	}
public void afterClass() {
	System.out.println("Closing Browser");
	}
}
