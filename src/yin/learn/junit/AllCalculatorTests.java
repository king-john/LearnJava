package yin.learn.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//����yԇ
@RunWith(Suite.class)
@Suite.SuiteClasses({CalculatorTest.class, SquareTest.class})
public class AllCalculatorTests {
	
}

