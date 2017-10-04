package edu.self;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController // Webアプリのリクエストを受け付けるクラスであることの指定
@EnableAutoConfiguration // 様々な設定を自動的に有効化
public class App {
  @RequestMapping("/")
  public String index() {
    return "Hello Spring Boot!";
  }

  // JSONを返す
  @RequestMapping("/hello")
  public Map<String, String> hello() {
    return Collections.singletonMap("message", "Hello, World!");

  }

  public static void main( String[] args ) {
    // Spring Bootによるアプリケーションを起動する
    SpringApplication.run(App.class, args);
  }
}
