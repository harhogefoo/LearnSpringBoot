package harhogefoo.controller;

import harhogefoo.service.TODOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author shinocchi.
 * Created on 2017/10/04.
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/todo")
public class TODOController {

  @Autowired
  TODOService todoService;

  @GetMapping()
  public String index(Model model) {
    model.addAttribute("todos", todoService.findAll());
    return "todo/index";
  }

}
