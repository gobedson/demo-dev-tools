package com.example.oluniyin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.oluniyin.services.NotificationService;

@RestController
public class PageController {
	
	@Value("${pageController.msg}")
	private String pageControllerMsg;
	
	@Value("${my.secret}")
	private String mySecret;
	
	@Value("${app.description}")
	private String appDescription;
	
	@Autowired
	private NotificationService notificationService;

	@RequestMapping("/")
	public String home() {
		return pageControllerMsg;
	}
	
	@RequestMapping("/notification")
	public String  notification(){
		return notificationService.toString();
	}
	
	@RequestMapping("/random")
	public String randompage(){
		return mySecret;
	}
	
	@RequestMapping("/page")
	public String pageDescription(){
		return appDescription;
	}
	
	
	
}
