import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

}



//spring.data.mongodb.database=${env.MONGO_DATABASE}
//		spring.data.mongodb.uri=mongodb+srv://${env.MONGO_USER}:<${env.MONGO_PASSWORD}>@${env.MONGO_CLUSTER}
