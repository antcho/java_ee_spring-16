package fr.eservices.week402.ctrl;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/world")
	public String sayHello(Model model, @RequestParam(value = "name", required = false) String name) {
        model.addAttribute("message", "Hello " + name + " !");

		return "sample";
	}
	
	
}
