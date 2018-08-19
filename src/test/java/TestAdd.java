
import static org.junit.Assert.*;

import org.junit.Test;
import junit.framework.Assert;


public class TestAdd {

	@Test
	public void int_3_2_Test() {
		Addition f=new Addition();
		String num1="3";
		String num2="2";
		assertEquals("5.0",f.printAdd(num1,num2));
		
	}
	@Test
	public void int_ast_Test() {
		Addition f=new Addition();
		String num1="3";
		String num2="!";
		assertEquals("please type int or float",f.printAdd(num1,num2));
		
	}
	@Test
	public void float_3_12__4_13_Test() {
		Addition f=new Addition();
		String num1="3.12";
		String num2="4.13";
		assertEquals("7.25",f.printAdd(num1,num2));
		
	}
	@Test
	public void int_at_Test() {
		Addition f=new Addition();
		String num1="@";
		String num2="4.13";
		assertEquals("please type int or float",f.printAdd(num1,num2));
		
	}
	@Test
	public void int_0_9999__1_Test() {
		Addition f=new Addition();
		String num1="0.9999";
		String num2="1";
		assertEquals("1.9999",f.printAdd(num1,num2));
		
	}
	@Test
	public void int__Test() {
		Addition f=new Addition();
		String num1="_";
		String num2="1";
		assertEquals("please type int or float",f.printAdd(num1,num2));
		
	}
	@Test
	public void float_0_001__0_000001_Test() {
		Addition f=new Addition();
		String num1="0.001";
		String num2="0.000001";
		assertEquals("0.001001",f.printAdd(num1,num2));
		
	}
	@Test
	public void int_plus_Test() {
		Addition f=new Addition();
		String num1="1";
		String num2="+";
		assertEquals("please type int or float",f.printAdd(num1,num2));
		
	}
	@Test
	public void float_amb_Test() {
		Addition f=new Addition();
		String num1="&";
		String num2="0.001";
		assertEquals("please type int or float",f.printAdd(num1,num2));
		
	}
	@Test
	public void float_greaterthan_Test() {
		Addition f=new Addition();
		String num1=">";
		String num2="3.0";
		assertEquals("please type int or float",f.printAdd(num1,num2));
		
	}
	@Test
	public void int_slash_Test() {
		Addition f=new Addition();
		String num1="1";
		String num2="/";
		assertEquals("please type int or float",f.printAdd(num1,num2));
		
	}
	@Test
	public void int_colon_Test() {
		Addition f=new Addition();
		String num1="8";
		String num2=":";
		assertEquals("please type int or float",f.printAdd(num1,num2));
		
	}
	@Test
	public void int_semi_colon_Test() {
		Addition f=new Addition();
		String num1="8";
		String num2=";";
		assertEquals("please type int or float",f.printAdd(num1,num2));
		
	}
	@Test
	public void braces_Test() {
		Addition f=new Addition();
		String num1="(";
		String num2="}";
		assertEquals("please type int or float",f.printAdd(num1,num2));
		
	}
	@Test
	public void mod_Test() {
		Addition f=new Addition();
		String num1="2";
		String num2="%";
		assertEquals("please type int or float",f.printAdd(num1,num2));
		
	}
	@Test
	public void string_Test() {
		Addition f=new Addition();
		String num1="hello";
		String num2="1";
		assertEquals("please type int or float",f.printAdd(num1,num2));
		
	}
	@Test
	public void empty_Test() {
		Addition f=new Addition();
		String num1="";
		String num2="1";
		assertEquals("please type int or float",f.printAdd(num1,num2));
		
	}
	@Test
	public void null_Test() {
		Addition f=new Addition();
		String num1=null;
		String num2="1";
		assertEquals("please type int or float",f.printAdd(num1,num2));
		
	}
	@Test
	public void qn_Test() {
		Addition f=new Addition();
		String num1="2";
		String num2="?";
		assertEquals("please type int or float",f.printAdd(num1,num2));
		
	}
	@Test
	public void hypen_Test() {
		Addition f=new Addition();
		String num1="-";
		String num2="1";
		assertEquals("please type int or float",f.printAdd(num1,num2));
		
	}
}
