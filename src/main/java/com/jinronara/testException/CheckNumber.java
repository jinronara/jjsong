package com.jinronara.testException;

import com.jinronara.common.exception.EvenException;
import com.jinronara.common.exception.EvenRuntimeException;

public class CheckNumber {
	private int number;

	public CheckNumber() {

	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void check() throws EvenException {
		if ((number % 2) == 0) {
			throw new EvenException(number);
		} else {
			System.out.println(Integer.toString(number) + " is Odd number");
		}
	}
	
	public void checkRuntime() throws EvenRuntimeException {
		if ((number % 2) == 0) {
			throw new EvenRuntimeException(number);
		} else {
			System.out.println(Integer.toString(number) + " is Odd number");
		}
	}

}
