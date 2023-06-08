package info.cape;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableEurekaServer
public class NamingServerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(NamingServerApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(NamingServerApplication.class);
	}
	
//	@Bean
//	public EurekaInstanceConfigBean eurekaInstanceConfig(InetUtils inetUtils) {
//
//		EurekaInstanceConfigBean config = new EurekaInstanceConfigBean(inetUtils);
//		String ip = null;
//		try {
//			ip = InetAddress.getLocalHost().getHostAddress();
//
//		} catch (UnknownHostException e) {
//			e.printStackTrace();
//		}
//
//		config.setIpAddress(ip);
//		config.setPreferIpAddress(true);
//
//		return config;
//	}
	
	@GetMapping("/get")
	public String get() {
		return "hi Eureakaserver";
	}
}
