package com.jinronara.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jinronara.common.exception.EvenException;
import com.jinronara.common.exception.EvenRuntimeException;
import com.jinronara.testException.CheckNumber;

@RestController
public class TestExceptionController {
	@GetMapping("/evenexception")
	public String evenexception() {

		CheckNumber cn = new CheckNumber();
		for (int i = 0; i < 20; i++) {
			cn.setNumber(i);
			try {
				cn.check();
			} catch (EvenException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}

		return "Even Exceptions Occured!";
	}
	
	@GetMapping("/evenruntimeexception")
	public String evenruntimeexception() {

		CheckNumber cn = new CheckNumber();
		for (int i = 0; i < 20; i++) {
			cn.setNumber(i);
			try {
				cn.checkRuntime();
			} catch (EvenRuntimeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}

		return "Even RuntimeExceptions Occured!";
	}

}