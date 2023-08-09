package tacos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TacoCloudApplication {

  @Autowired
  private ApplicationContext applicationContext;
  
  @Bean
  public Foo foo() {
     Foo foo = new Foo();
     
     String[] allBeanNames = applicationContext.getBeanDefinitionNames();
     System.out.println("***************************************************************************************************************");
     System.out.println("***************************************************************************************************************");
     
       for(String beanName : allBeanNames) {
          if (beanName.compareTo("foo") == 0) 
             continue;
           System.out.println(beanName + " : " + applicationContext.getBean(beanName).getClass().toString());
       }
       
     System.out.println("***************************************************************************************************************");
     System.out.println("***************************************************************************************************************");
     return foo;      
  }
  
	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
		
	}
	
	static class Foo {
      
	   }

}


