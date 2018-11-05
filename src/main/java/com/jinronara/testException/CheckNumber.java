package com.jinronara.testException;

import com.jinronara.common.exception.BizException;
import com.jinronara.common.exception.EvenException;
import com.jinronara.common.exception.EvenRuntimeException;

public class CheckNumber {
	private int number;
	private String string;

	public CheckNumber() {

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
	
	public void checkBiz() {
		
		try {
			if ((number % 2) == 0) {
				throw new NullPointerException();
			} else {
				System.out.println(Integer.toString(number) + " is Odd number");
			}
		} catch (NullPointerException ne){
			throw new BizException("널이네욘.....", ne);
		} 
	}

	public void setNumber(int i) {
		
		
	}
}
