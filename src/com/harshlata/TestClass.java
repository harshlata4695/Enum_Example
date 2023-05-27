package com.harshlata;

public class TestClass {

	Day day;
	
	public TestClass(Day day) {
	this.day = day;
	}

	public void dayTest()
	{
		switch(day)
		{
		case MONDAY:
			System.out.println("it is starting day");
			break;
			
		case TUESDAY:
			System.out.println("it is mid week day");
			break;
			
		case SATURDAY:
			System.out.println("It is second last weekend day");
			break;
		
		case SUNDAY:
			System.out.println("it is last day of weekend");
			break;
		
		default:
			System.out.println("it is kind of week day");
			break;
		}
	}
	
	
	public static void main(String[] args) {

		TestClass test1 = new TestClass(Day.MONDAY);
		test1.dayTest();
		
		TestClass test2 = new TestClass(Day.TUESDAY);
		test2.dayTest();

		
		TestClass test3 = new TestClass(Day.WEDNESDAY);
		test3.dayTest();

		
		TestClass test4 = new TestClass(Day.THRUSDAY);
		test4.dayTest();

		
		TestClass test5 = new TestClass(Day.FRIDAY);
		test5.dayTest();

		
		TestClass test6 = new TestClass(Day.SATURDAY);
		test6.dayTest();

		
		TestClass test7 = new TestClass(Day.SUNDAY);
		test7.dayTest();

		
	}

}
