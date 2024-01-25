package AssignmentQution;

import org.testng.annotations.Test;

public class GroupTestNg {
	@Test(groups = {"red"})
	  public void red1() {
		  System.out.println("red group1");
	  }
	  @Test(groups = {"red"})
	  public void red2() {
		  System.out.println("red group2");
	  }
	  @Test(groups = {"green"})
	  public void green1() {
		System.out.println("green group1");
	}
	  @Test(groups = {"green"})
	  public void green2() {
		System.out.println("green group2");
		
	}
	  @Test(groups = {"green","red"})
	  public void green3() {
		System.out.println("green group2 and red3");
		
	}
}
