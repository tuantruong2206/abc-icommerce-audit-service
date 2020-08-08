package au.com.nab.icommerce.audit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@ComponentScan(basePackages = {"au.com.nab.icommerce.base.*", "au.com.nab.icommerce.audit.*"})
public class NabIcommerceAuditServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NabIcommerceAuditServiceApplication.class, args);
	}

}
