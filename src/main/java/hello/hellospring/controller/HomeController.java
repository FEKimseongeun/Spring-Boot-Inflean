package hello.hellospring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/") //첫번째 도멘인 처음 화면
    public String home(){
        return "home";
    }

}
