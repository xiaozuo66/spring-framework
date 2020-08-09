package com.spring.lesson;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class BeanWrapperTest {

	public static void main(String[] args) {
		User user=new User();
		BeanWrapper beanWrapper=new BeanWrapperImpl(user);
		System.out.println(beanWrapper.getPropertyDescriptors());
	}
}
