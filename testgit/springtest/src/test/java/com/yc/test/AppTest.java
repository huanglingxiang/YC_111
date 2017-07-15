package com.yc.test;

import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mimi.impl.Container;
import com.mimi.impl.PersonBmiTool;
import com.yc.bean.Apple;
import com.yc.bean.CollectionBean;
import com.yc.bean.ConstructorDI;
import com.yc.bean.InnerBean;
import com.yc.bean.Myproperties;
import com.yc.bean.Person;
import com.yc.bean.Student;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {
	public AppTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	public void testApp() {
		//实例化容器，spring在自己创建时，就读取beans.xml 并通过反射机制创建了对象
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
		//再从容器中可以随机取出bean
		Student stu = (Student) context.getBean("student");
		stu.setId(1);
		stu.setSname("kd");
		System.out.println(stu);
		
		Student stu2 = (Student) context.getBean("student");
		stu2.setId(2);
		stu2.setSname("k d");
		System.out.println(stu);
		
		System.out.println(stu.hashCode() + "  " + stu2.hashCode()); 
	}
	
	public void testApp2() {
		//实例化容器，spring在自己创建时，就读取beans.xml 并通过反射机制创建了对象
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
		
		Myproperties mp = (Myproperties) context.getBean("mp");
		System.out.println(mp);
		
//		Apple apple = (Apple)context.getBean("apple");
//		System.out.println(apple.getId());
		
		ConstructorDI c = (ConstructorDI) context.getBean("constructorDI");
		System.out.println(c);
		
		ConstructorDI c2 = (ConstructorDI) context.getBean("constructorDI2");
		System.out.println(c2);
	}
	
	public void testApp3() {
		//实例化容器，spring在自己创建时，就读取beans.xml 并通过反射机制创建了对象
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
		
		Container c = (Container) context.getBean("container");
		PersonBmiTool pbt = (PersonBmiTool) context.getBean("personBmiTool");
		
		Person p1=new Person( "张三", 1.70, 800);
		Person p2=new Person( "李四", 1.70, 100);     //bmi最小
		Person p3=new Person( "王五", 1.60, 300);     // bmi值大
		Person p4=new Person( "赵六", 0.06, 200); 
		Person p5=new Person( "田七", 1.65, 100); 
		Person p6=new Person( "王八", 1.67, 190); 
		
		c.save(   p1 );
		c.save(p2);
		c.save(  p3);
		c.save(p4);
		c.save(p5);
		c.save(p6);
		
		//Random r=new Random();
		//for(   int i=0;i<1000;i++){
			//  Math.random()   生成 0-1之间的小数
		//	Person p7=new Person( "王八"+i,   1+Math.random()    ,   r.nextInt(80)+30  ); 
		//	c.save(p7);
		//}
		
	
		
		Person max=(Person)c.getMax();   //取最大值
		Person min=(Person)c.getMin();   //最最小值
		
		System.out.println("最大值:"+  max.getName() );
		System.out.println("最小值:"+ min.getName());
		
		System.out.println("平均bmi:"+ c.getAvg() );
		
		Object[] objs=c.getObjs();
		for(   Object o: objs ){
			 Person pp=(Person)o;
			 System.out.println(    pp.getName()+"\t"+pp.getHeight()+"\t"+pp.getWeight() +"\t"+   pbt.measure(   pp  )  );
		}
		
	}
	
	public void testApp4() {
		//实例化容器，spring在自己创建时，就读取beans.xml 并通过反射机制创建了对象
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
		
		BasicDataSource bds = (BasicDataSource) context.getBean("myDataSource");
		try {
			System.out.println(bds.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testApp5() {
		//实例化容器，spring在自己创建时，就读取beans.xml 并通过反射机制创建了对象
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
		
		InnerBean innerBean = (InnerBean) context.getBean("innerBean");
		System.out.println(innerBean);
		
		CollectionBean collectionBean = (CollectionBean) context.getBean("collecctionBean");
		System.out.println(collectionBean);
	}
	
	public void testApp6() {
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
		
	}
}
