package org.zerock.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice	//컨트롤러에서 발생하는 Exception을 전문적으로 처리하는 클래스라는 선언
public class CommonExceptionAdvice {
	
	private static final Logger logger = LoggerFactory.getLogger(CommonExceptionAdvice.class);
	
	@ExceptionHandler(Exception.class)
	private ModelAndView errorModelAndView(Exception ex) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/error_common");
		modelAndView.addObject("exception", ex);
		
		return modelAndView;
	}
	
	/*public String common(Exception e) { // common 매소드를 통해 Exception 타입으로 처리되는 모든 예외를 처리 하도록 구현
		logger.info(e.toString());
		
		return "error_common";
	}*/

}
