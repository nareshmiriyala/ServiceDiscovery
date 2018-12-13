package au.com.redenergy.ServiceDiscovery

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class ServiceDiscoveryApplication {

	static void main(String[] args) {
		SpringApplication.run ServiceDiscoveryApplication, args
	}

}

