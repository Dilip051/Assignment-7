package AssignmentQution;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Assert {
	@Ignore
	@Test
		public void t1() {
			int a=10,b=20;
			Assert.asserttrue(a>b);
			Assert.assertFalse(a>b);
		}
		@Ignore
		@Test
		public void t2() {
			String s1=null;
			String s2="Dilip";
			Assert.assertNotNull(s2);
			Assert.assertNull(s1);
		}
		@Ignore
		@Test
		public void t3() {
			String s1="tops";
			String s2="tops";
			Assert.assertEquals(s1, s2);
//			Assert.assertNotEquals(s1, s2);
			Assert.assertSame(s1, s2);
		}
		@Ignore
		@Test
		public void t4() {
			int[] a= {1,2,3,4};
			int[] b= {1,2,3,4};
			Assert.assertArrayEquals(a,b);
		
		}
		@Test
		public void t5() {
			System.out.println("self failed");
			fail("self failed");
		}
		
}
