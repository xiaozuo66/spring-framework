package com.spring.lesson;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.convert.TypeDescriptor;

public class ResolvableTypeTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext();

		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(applicationContext);
		String location="classpath:/META-INF/bean-definition-context.xml";
		reader.loadBeanDefinitions(location);

		applicationContext.refresh();

		System.out.println(applicationContext.getBean("user"));

		TypeDescriptor typeDescriptor=TypeDescriptor.valueOf(User.class);

		ResolvableType test = ResolvableType.forClass(User.class);
		System.out.println("启动gradle构建项目");
	}
}
