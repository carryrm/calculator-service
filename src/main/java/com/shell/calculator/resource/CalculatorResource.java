package com.shell.calculator.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorResource {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value= "/addition/{x}/{y}", method = RequestMethod.GET)
	public int addition(@PathVariable int x, @PathVariable int y) {
		return x+y;
	}
	
	@RequestMapping(value= "/subtraction/{x}/{y}", method = RequestMethod.GET)
	public int subtraction(@PathVariable int x, @PathVariable int y) {
		return x-y;
	}
	
	@RequestMapping(value= "/multiplication/{x}/{y}", method = RequestMethod.GET)
	public int multiplication(@PathVariable int x, @PathVariable int y) {
		return x*y;
	}
	
	@RequestMapping(value= "/division/{x}/{y}", method = RequestMethod.GET)
	public int division(@PathVariable int x, @PathVariable int y) {
		return x/y;
	}

}
