package com.jinronara.testException;

import com.jinronara.common.exception.BizException;
import com.jinronara.common.exception.EvenException;
import java.lang.Exception;

public class CheckNumber {
	private int number;
	private String nullstring;

	public CheckNumber() {

	}

	public void check() throws EvenException {
		if ((number % 2) == 0) {
			throw new EvenException("저를 무시 해 주세요", new Exception());
		} else {
			System.out.println(Integer.toString(number) + " is Odd number");
		}
	}
	
	public void checkBiz() {
		
		try {
			if (!nullstring.isEmpty()) {
				nullstring = null;
				
			} else {
				System.out.println(nullstring);
			}
		} catch (NullPointerException ne){
			throw new BizException("비즈니스 예외입니다.", ne);
		} 
	}

	public void setNumber(int i) {
		
		
	}
}




