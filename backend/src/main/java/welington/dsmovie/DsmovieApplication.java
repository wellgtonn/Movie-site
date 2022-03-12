package welington.dsmovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages =" welington.dsmovie.entities")
@SpringBootApplication
public class DsmovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsmovieApplication.class, args);
	}

}
