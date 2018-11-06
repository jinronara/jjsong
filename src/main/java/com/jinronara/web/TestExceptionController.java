package com.jinronara.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.jinronara.common.exception.EvenException;
import com.jinronara.testException.CheckNumber;

@RestController
public class TestExceptionController {
	@RequestMapping(value = "/exception/{type}", method = RequestMethod.GET)
	public String exception(@PathVariable String type) throws InterruptedException {
		
		String result = "Choose biz or ignore";

		if (type == "biz") {

			CheckNumber cn = new CheckNumber();
			for (int i = 0; i < 20; i++) {
				Thread.sleep(1000);
				cn.setNumber(i);
				cn.checkBiz();

			}
			
			result = type + " Exceptions Occured!";
		} else if (type == "ignore") {
			CheckNumber cn = new CheckNumber();
			for (int i = 0; i < 20; i++) {
				Thread.sleep(1000);
				cn.setNumber(i);
				try {
					cn.check();
				} catch (EvenException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			result = type + " Exceptions Occured!";
		} 
		return result;
	}

}
