package engineer.khavin.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
Mobile class
  sim
  call()

Sim Interface
  call()

Airtel
Jio
 */

/*
Scope:
  Basic Scope:
    - singleton (default) - only once per spring container
    - prototype - new bean is created for every request or reference

  Web-Aware Scopes: (WEB APPLICATIONS)
    - request - new bean is created when servlet request
    - session - new bean is created per session (user)
    - global session - new bean is created per HTTP session


singleton
 - default scope
 - beans are created when application starts
 - only one object or bean is created for a container

prototype
 - beans are created when reference is called
 - for every reference a new object or bean is created

 */


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Mobile mobile = context.getBean("mobile", Mobile.class);

		mobile.printSims();
	}

}
