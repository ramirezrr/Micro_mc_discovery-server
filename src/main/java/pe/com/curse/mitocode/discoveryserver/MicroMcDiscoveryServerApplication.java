package pe.com.curse.mitocode.discoveryserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroMcDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroMcDiscoveryServerApplication.class, args);
    }

}
