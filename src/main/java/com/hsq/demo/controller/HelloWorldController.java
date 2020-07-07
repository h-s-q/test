package com.hsq.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * .
 *
 * @author shengquan he 2020/7/7 5:02 下午
 */
@RestController
@RequestMapping("v1/")
public class HelloWorldController {

	@GetMapping("/say/hello")
	public String test() {
		return "hello world!";
	}
}
