package harhogefoo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * author shinocchi.
 * Created on 2017/10/04.
 */
@RestController
public class APIController {

  @RequestMapping("/hello_world")
  public String index() {
    return "Hello Spring Boot!";
  }

  // JSONを返す
  @RequestMapping("/hello")
  public Map<String, String> hello() {
    return Collections.singletonMap("message", "Hello, World!");
  }

}
