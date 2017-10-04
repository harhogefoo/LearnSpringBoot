package harhogefoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class App {
  public static void main( String[] args ) {
    // Spring Bootによるアプリケーションを起動する
     SpringApplication.run(App.class, args);
  }
}
