package za.co.jaliatechnologies.spring_cloud_openfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class SpringCloudOpenFeignApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOpenFeignApplication.class, args);
	}
}
