package pacck2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pack2.Product;

public class MainRrr {

	public static void main(String[] args) {

		ApplicationContext act = new ClassPathXmlApplicationContext("Hhh.xml");

		Product pr = (Product) act.getBean("prodct123");
		pr.ProductService();
	}

}
